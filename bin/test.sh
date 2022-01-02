#!/bin/bash

# При возникновении ошибки в любой из строк скрипта, выполнение будет остановлено с возникшей ошибкой
set -e

export EXERCISE=$(basename `pwd`)
# Путь к директории с скомпилированными классами упражнения
export BUILD_EXERCISE_PATH=$BUILD_PATH/$EXERCISE
# Отключаем проверку скоспилированных классов (влияет на время запуска команды java)
export JAVA_OPTS="-noverify"
# Отключаем всё, что влияет на скорость старта и работы компилятора kotlin: проверка версии jdk
# оптимизации, дополнительная обработка предупрежедний, использование готовых jar файлов с jdk, stdlib и reflect.
# Используем ранее подготовленную директорию с распакованными классами
export COMPILER_OPTS="-nowarn -Xeffect-system -Xno-optimize -Xskip-runtime-version-check -no-jdk -no-reflect -no-stdlib -classpath $CLASSPATH -d $BUILD_EXERCISE_PATH"

# Обычно эту операцию выполняет исполняемый файл kotlinc. Поскольку мы его не используем - удалем файл вручную перед компиляцией.
rm -f $BUILD_EXERCISE_PATH/MainKt.class
# В штатном исполняемом файле kotlinc зашито использование jar файлов.
# Обходим это ограничение, используя напрямую классы нужные для компиляции
java $JAVA_OPTS org.jetbrains.kotlin.preloading.Preloader org.jetbrains.kotlin.cli.jvm.K2JVMCompiler $COMPILER_OPTS Main.kt 2>&1
# Компиляция файла с тестами нужна только при сборке
[ ! -z $COMPILE_TESTS ] && javac -cp $CLASSPATH:$BUILD_EXERCISE_PATH Test.java -d $BUILD_EXERCISE_PATH 2>&1
# Запускаем тесты
java -cp $CLASSPATH:$BUILD_EXERCISE_PATH Test 2>&1

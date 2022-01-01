#!/bin/bash

set -e

export EXERCISE=$(basename `pwd`)
export BUILD_EXERCISES_PATH=$BUILD_PATH/$EXERCISE
export JAVA_OPTS="-noverify"
export COMPILER_OPTS="-nowarn -Xeffect-system -Xno-optimize -Xskip-runtime-version-check -no-jdk -no-reflect -no-stdlib -classpath $CLASSPATH -d $BUILD_EXERCISES_PATH"

java $JAVA_OPTS org.jetbrains.kotlin.preloading.Preloader org.jetbrains.kotlin.cli.jvm.K2JVMCompiler $COMPILER_OPTS Main.kt 2>&1
[ ! -z $COMPILE_TESTS ] && javac -cp $CLASSPATH:$BUILD_EXERCISES_PATH Test.java -d $BUILD_EXERCISES_PATH 2>&1
java -cp $CLASSPATH:$BUILD_EXERCISES_PATH Test 2>&1

#!/bin/bash

set -e

export EXERCISE=$(basename `pwd`)
export BUILD_PATH=/exercises-kotlin/build/$EXERCISE

kotlinc Main.kt -classpath $CLASSPATH -d $BUILD_PATH 2>&1
# java -jar /kotlinc/lib/kotlin-compiler.jar Main.kt -classpath $CLASSPATH -d $BUILD_PATH 2>&1
[ ! -z $COMPILE_TESTS ] && javac -cp $CLASSPATH:$BUILD_PATH Test.java -d $BUILD_PATH 2>&1
java -cp $CLASSPATH:$BUILD_PATH Test 2>&1

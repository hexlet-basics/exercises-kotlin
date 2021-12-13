#!/bin/bash

set -e

kotlinc *.kt -no-jdk -no-reflect 2>&1
javac Test.java 2>&1
java Test 2>&1

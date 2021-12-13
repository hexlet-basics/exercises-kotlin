#!/bin/bash

set -e

kotlinc *.kt 2>&1
javac Test.java 2>&1
java Test 2>&1

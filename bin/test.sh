kotlinc `pwd`/Main.kt -d `pwd`/Main.jar
kotlinc `pwd`/Test.kt -d `pwd`/Test.jar
kotlin -classpath `pwd`/Test.jar TestKt
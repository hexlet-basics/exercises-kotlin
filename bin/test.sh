kotlinc `pwd`/*.kt 2>&1
javac -cp `pwd`:/opt/commons_lang3.jar:/opt/assertj.jar `pwd`/*.java 2>&1 || exit 1;
java -cp `pwd`:/opt/commons_lang3.jar:/opt/assertj.jar Test 2>&1
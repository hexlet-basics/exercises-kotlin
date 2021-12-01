-include /opt/basics/common/common.mk

compose-setup: compose-build

compose:
	docker-compose up

compose-build:
	docker-compose build

code-lint:
	# java -jar /opt/checkstyle.jar -c checkstyle.xml modules src

compile:
	@(for i in $$(find . -type f -name Main.kt); do kotlinc $$(dirname $$i)/Main.kt -d  $$(dirname $$i)/Main.jar; done)
	@(for i in $$(find . -type f -name Test.kt); do kotlinc $$(dirname $$i)/Test.kt -d  $$(dirname $$i)/Test.jar; done)

clean:
	@$$(find . -type f -name Main.jar -delete)
	@$$(find . -type f -name Test.jar -delete)
	
compose-bash:
	docker-compose run exercises bash

compose-test:
	docker-compose run exercises make test


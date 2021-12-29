-include /opt/basics/common/common.mk

code-lint:
	java -jar /opt/ktlint
	java -jar /opt/checkstyle.jar -c checkstyle.xml modules

compile:
	@(for i in $$(find . -type f -name Main.kt); do kotlinc $$(dirname $$i)/Main.kt ; done)
	@(for i in $$(find . -type f -name Test.java); do javac $$(dirname $$i)/*.java ; done)

clean:
	@$$(find . -type f -name *.class -delete)
	@$$(find . -type d -name META-INF -exec rm -r {} +)

compose-setup: compose-build

compose:
	docker-compose up

compose-build:
	docker-compose build

compose-bash:
	docker-compose run exercises bash

compose-test:
	docker-compose run exercises make test

compose-code-lint:
	docker-compose run exercises make code-lint

compose-description-lint:
	docker-compose run exercises make description-lint

compose-schema-validate:
	docker-compose run exercises make schema-validate

ci-check:
	docker-compose --file docker-compose.yml build
	docker-compose --file docker-compose.yml up --abort-on-container-exit

xz:
	@(for i in $$(find modules/** -type f -name Makefile); do make test -C $$(dirname $$i) || exit 1; done)

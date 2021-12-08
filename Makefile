-include /opt/basics/common/common.mk

code-lint:
	java -jar /opt/ktlint

compile:
	@(for i in $$(find . -type f -name Main.kt); do kotlinc $$(dirname $$i)/Main.kt -d  $$(dirname $$i)/Main.jar; done)
	@(for i in $$(find . -type f -name Test.kt); do kotlinc $$(dirname $$i)/Test.kt -d  $$(dirname $$i)/Test.jar; done)

clean:
	@$$(find . -type f -name Main.jar -delete)
	@$$(find . -type f -name Test.jar -delete)

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
	docker-compose --file docker-compose.yml up --abort-on-container-exit

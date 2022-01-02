-include /opt/basics/common/common.mk

code-lint:
	java -jar /opt/ktlint
	java -jar /opt/checkstyle.jar -c checkstyle.xml modules

compose-setup: compose-build

compose:
	docker-compose up

compose-build:
	docker-compose build

compose-bash:
	docker-compose run --rm exercises bash

compose-test:
	docker-compose run --rm exercises make test

compose-code-lint:
	docker-compose run --rm exercises make code-lint

compose-description-lint:
	docker-compose run --rm exercises make description-lint

compose-schema-validate:
	docker-compose run --rm exercises make schema-validate

ci-check:
	docker-compose --file docker-compose.yml build
	docker-compose --file docker-compose.yml up --abort-on-container-exit

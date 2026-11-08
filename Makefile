-include /opt/basics/common/common.mk

.PHONY: code-lint compose compose-build compose-bash compose-test ci-check

code-lint:
	ktlint 'modules/**/*.kt' 'lib/**/*.kt'

compose:
	docker compose up

compose-build:
	docker compose build

compose-bash:
	docker compose run --rm exercises bash

compose-test:
	docker compose run --rm exercises make test

ci-check:
	docker compose --file docker-compose.yml build
	docker compose --file docker-compose.yml run --rm exercises make check

.PHONY: help build test

help:
	@cat $(firstword $(MAKEFILE_LIST))

build:
	gradle build

test:
	gradle test

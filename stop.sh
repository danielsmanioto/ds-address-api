#!/bin/bash

docker stop $(docker ps -q --filter ancestor="ds-address-api")
docker rm $(docker ps --all -q --filter ancestor="ds-address-api")

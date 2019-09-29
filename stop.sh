#!/bin/bash

docker stop $(docker ps -q --filter ancestor="ds-address-api")

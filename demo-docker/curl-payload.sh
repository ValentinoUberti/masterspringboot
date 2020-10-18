#!/bin/bash

## ReadMe
## How to run 100 parallel threads
## seq 1 100 | xargs -n1 -P100 ./curl-payload.sh

# bombed address
TEST_URL="http://istio-ingressgateway-istio-system.apps.ocp.example.net/monitoring/"

curl -sS -A "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:59.0) Gecko/20100101 Firefox/59.0" --limit-rate 10K  -d@- $TEST_URL > /dev/null

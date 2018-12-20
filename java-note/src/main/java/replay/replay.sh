#!/bin/bash


# 重写url
gor --input-raw :8080 --output-http qa-dev.sayabc.com:8888 --http-rewrite-url  /v1/user/([^\\/]+)/ping:/v2/user/$1/ping
#!/usr/bin/env bash
# desc: build and package all artifacts
# author: Elvin Zeng
# date: 2017-6-11

cd $(cd $(dirname $0) && pwd -P)
cd ../
mvn clean package
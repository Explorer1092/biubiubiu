#!/usr/bin/env bash

source /etc/profile
sudo su
# 修改配置文件,强制替换
cp -rf /opt/.jenkins/application.properties src/main/resources/application.properties
# 执行mvn
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true
# 登录远程redis清理缓存
echo "============登录redis执行清理=============="
/root/tmp/redis-3.2.1/src/redis-cli -h 10.102.132.149 -p 6379 "flushall"

# source /etc/profile
# sudo su
# cp /opt/.jenkins/application.properties src/main/resources/application.properties
# mv src/main/resources/application.properties.example src/main/resources/application.properties
# mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true
# echo "============登录redis执行清理=============="
# ssh -p52722 shenwandong@10.102.132.149  "redis-cli && flushall"
# /root/tmp/redis-3.2.1/src/redis-cli -h 10.102.132.149 -p 6379 "flushall"
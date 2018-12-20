#!/usr/bin/env bash
# course sql脚本
scp shenwandong@10.102.131.92:/opt/build/src/course/database/schema.sql /home/shenwandong/package/

# 拷贝order服务
scp shenwandong@10.102.131.92:/opt/build/src/order/target/order.jar /home/shenwandong/package/
# 拷贝course服务
scp shenwandong@10.102.131.92:/opt/build/src/course/target/course.jar /home/shenwandong/package/
# 拷贝auth服务jar
scp shenwandong@10.102.131.92:/opt/build/src/auth/target/auth.jar /home/shenwandong/package/
# 拷贝config服务jar
shenwandong@10.102.131.92:/opt/build/src/config/target/config.jar /home/shenwandong/package/
# 拷贝inventory服务jar
scp shenwandong@10.102.131.92:/opt/build/src/inventory/target/inventory.jar /home/shenwandong/package/
# 拷贝reward服务jar
scp shenwandong@10.102.131.92:/opt/build/src/reward/target/reward.jar /home/shenwandong/package/
# 拷贝signalling服务jar
scp shenwandong@10.102.131.92:/opt/build/src/signalling/target/signalling.jar /home/shenwandong/package/


# 从跳转机拷贝到apitest环境
scp course-schema.sql shenwandong@l-xbk-apitest2.syc.beta.ali.qr:/home/shenwandong/





#https://shenwandong@code.vipkid.com.cn/shenwandong/panamera.git


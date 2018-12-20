#!/usr/bin/env bash


build_env="shenwandong@10.102.131.92"
server_url=( l-xbk-account1.syc.pre.ali.qr l-xbk-auth1.syc.pre.ali.qr      l-cc-server1.syc.pre.ali.qr
            l-xbk-course1.syc.pre.ali.qr   l-duidui-server1.syc.pre.ali.qr l-email-server1.syc.pre.ali.qr
            l-xbk-exercise1.syc.pre.ali.qr l-fire-server1.syc.pre.ali.qr    l-xbk-inventory1.syc.pre.ali.qr
            l-link-server1.syc.pre.ali.qr  l-management-java1.syc.pre.ali.qr l-xbk-order1.syc.pre.ali.qr
            l-processor-server1.syc.pre.ali.qr  l-xbk-push1.syc.pre.ali.qr  l-xbk-reward1.syc.pre.ali.qr
            l-xbk-signalling1.syc.pre.ali.qr  l-sms-java1.syc.pre.ali.qr  l-student-java1.syc.pre.ali.qr
            l-tasks-server1.syc.pre.ali.qr  l-teacher-java1.syc.pre.ali.qr  l-tunnel-server1.syc.pre.ali.qr
            l-xbk-uploader1.syc.pre.ali.qr  l-wechat-server1.syc.pre.ali.qr l-xbk-penamera1.syc.pre.ali.qr
            )
server_name=(account auth cc course duidui email exercise fire inventory link management order processor push
            reward1 signalling1 sms student tasks teacher tunnel uploader wechat panamera)
for i in ${server_url[@]};
do
    echo "test:"$i
done

echo ${server_url[1]}

echo """Please select server:
1.account 2.auth 3.cc 4.course 5.duidui 6.email 7.exercise 8.fire 9.inventory 10.link 11.management 12.order 13.processor
14.push 15.reward1 16.signalling1 17.sms 18.student 19.tasks 20.teacher 21.tunnel 22.uploader 23.wechat 24.panamera
"""

read -p "Please enter the server name:" char
path=/opt/build/env/
case $char in
	"1")
		echo "build script path:${path}"
		read  -p "Please enter server:" server  &&  echo "server:" ${path}${server}.sh
        ./${path}${server}

		# $2 =options


#!/bin/bash
# xbk.apitest.login bash

echo "select server"
select server in  "l-xbk-apitest1.syc.beta.ali.qr" "l-xbk-apitest2.syc.beta.ali.qr" "l-xbk-apitest3.syc.beta.ali.qr" "l-xbk-apitest4.syc.beta.ali.qr" "l-xbk-mysql1.syc.beta.ali.qr" "l-xbk-redis1.syc.beta.ali.qr";
do
case $server in
        "apitest1 10.102.131.109")
                server="l-xbk-apitest1.syc.beta.ali.qr";;
        "apitest2 10.102.131.110")
                server="l-xbk-apitest2.syc.beta.ali.qr";;
        "apitest3 10.102.131.111")
                server="l-xbk-apitest3.syc.beta.ali.qr";;
        "apitest4 10.102.131.112")
                server="l-xbk-apitest4.syc.beta.ali.qr";;
        "mysql 10.102.132.148")
                server="l-xbk-mysql1.syc.beta.ali.qr";;
        "redis 10.102.132.149")
                server="l-xbk-redis1.syc.beta.ali.qr";;

esac
break
done

expect -c "

set timeout -1
spawn  ssh $server

interact

"
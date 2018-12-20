# -*- coding:utf-8 -*-
import os
import requests
import re
import urllib


# 读取text文本中的参数数据，以逗号分隔开
def ids(t):
    a = "Bearer "
    # res ="{}{}".format(a,t)
    res = "Bearer\t" + t
    print("Authorization", '"%s"' % res)


f = open('/Users/shen/Desktop/student100.txt', 'r')
# 读取每一行数据，遍历获取'" %s"' %a %t
for line in f.readlines():
    t = line.split(',')[1]
    # print(t)
    id = line.split(',')[0]
    # print(id)
    ids(t)


# 获取本机主机名称
def GetHostName():
    Name = os.popen('hostname').read()
    HostName = Name.strip()
    print(HostName)


GetHostName()

# 查找网易云课堂的视频地址
keyword = input("keyword:")
key = urllib.parse.quote(keyword)
payload = {
    'callCount': '1',
    'scriptSessionId': '${scriptSessionId}190',
    'httpSessionId': 'f090ee8789f5413792d5b5eed4568e82',
    'c0-scriptName': 'OpenSearchBean',
    'c0-methodName': 'searchVideo',
    'c0-id': '0',
    'c0-param0': 'string:{0}'.format(key),
    'c0-param1': 'number:1',
    'c0-param2': 'number:100',
    'batchId': '1478666899720'
}
data = requests.post("http://c.open.163.com/dwr/call/plaincall/OpenSearchBean.searchVideo.dwr", data=payload).text
print(data)
reg = re.compile("http://open.163.com.*?\.html")
links = re.findall(reg, data)
for link in links:
    print(link)

# 极简python服务器
# 服务器部分

# ! /usr/bin/python
import socket

HOST = '0.0.0.0'
PORT = 40678
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind((HOST, PORT))
s.listen(5)
conn, addr = s.accept()
print
'Connected by', addr
while True:
    data = conn.recv(1024)
    print
    data
    if data == "exit":
        conn.close()
        break
s.close()

# 客户端部分

# !/usr/bin/python
import socket

HOST = '0.0.0.0'
PORT = 40678
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((HOST, PORT))
while 1:
    cmd = raw_input("Please input cmd:")
    s.sendall(cmd)
    if cmd == "exit":
        break
s.close()

# 远程ssh连接
import pexpect

config = {
    'ip': "192.168.100.100",
    'user': "root",
    'passwd': "123456",
    'cmd': "ls",
}


def ssh_cmd(ip, user, passwd, cmd):
    ret = -1
    ssh = pexpect.spawn('ssh %s@%s "%s"' % (user, ip, cmd))
    try:
        i = ssh.expect(['password:', 'continue connecting (yes/no)?'], timeout=5)
        if i == 0:
            ssh.sendline(passwd)
        elif i == 1:
            ssh.sendline('yes\n')
            ssh.expect('password: ')
            ssh.sendline(passwd)
            ssh.sendline(cmd)
        r = ssh.read()
        print
        r
        ret = 0
    except pexpect.EOF:
        print
        "EOF"
        ssh.close()
        ret = -1
    except pexpect.TIMEOUT:
        print
        "TIMEOUT"
        ssh.close()
        ret = -2
    return ret


if __name__ == '__main__':
    ssh_cmd(**config)

# 使用shell命令
# -*- coding: UTF-8 -*-
import commands


def main():
    cmd = "ls -l ."
    # execute the string cmd in a shell with os.popen() and return a 2-tuple (status, output).
    status, output = commands.getstatusoutput(cmd)
    if status != 0:
        print
        "command : '%s'\nstatus  : %s\nmessage : %s" % (cmd, status, output)
    else:
        print
        output


if __name__ == "__main__":
    main()

# web页面质量检查
# -*-coding: utf-8-*-
import os, sys
import time
import sys
import pycurl

URL = raw_input("请输入网站地址:")
c = pycurl.Curl()
c.setopt(pycurl.URL, URL)

# 连接超时时间,5秒
c.setopt(pycurl.CONNECTTIMEOUT, 5)

# 下载超时时间,5秒
c.setopt(pycurl.TIMEOUT, 5)
c.setopt(pycurl.FORBID_REUSE, 1)
c.setopt(pycurl.MAXREDIRS, 1)
c.setopt(pycurl.NOPROGRESS, 1)
c.setopt(pycurl.DNS_CACHE_TIMEOUT, 30)
indexfile = open(os.path.dirname(os.path.realpath(__file__)) + "/content.txt", "wb")
c.setopt(pycurl.WRITEHEADER, indexfile)
c.setopt(pycurl.WRITEDATA, indexfile)
try:
    c.perform()
except Exception, e:
    print
    "connecion error:" + str(e)
    indexfile.close()
    c.close()
    sys.exit()

NAMELOOKUP_TIME = c.getinfo(c.NAMELOOKUP_TIME)
CONNECT_TIME = c.getinfo(c.CONNECT_TIME)
PRETRANSFER_TIME = c.getinfo(c.PRETRANSFER_TIME)
STARTTRANSFER_TIME = c.getinfo(c.STARTTRANSFER_TIME)
TOTAL_TIME = c.getinfo(c.TOTAL_TIME)
HTTP_CODE = c.getinfo(c.HTTP_CODE)
SIZE_DOWNLOAD = c.getinfo(c.SIZE_DOWNLOAD)
HEADER_SIZE = c.getinfo(c.HEADER_SIZE)
SPEED_DOWNLOAD = c.getinfo(c.SPEED_DOWNLOAD)

print
"HTTP状态码：%s" % (HTTP_CODE)
print
"DNS解析时间：%.2f ms" % (NAMELOOKUP_TIME * 1000)
print
"建立连接时间：%.2f ms" % (CONNECT_TIME * 1000)
print
"准备传输时间：%.2f ms" % (PRETRANSFER_TIME * 1000)
print
"传输开始时间：%.2f ms" % (STARTTRANSFER_TIME * 1000)
print
"传输结束总时间：%.2f ms" % (TOTAL_TIME * 1000)

print
"下载数据包大小：%d bytes/s" % (SIZE_DOWNLOAD)
print
"HTTP头部大小：%d byte" % (HEADER_SIZE)
print
"平均下载速度：%d bytes/s" % (SPEED_DOWNLOAD)

indexfile.close()
c.close()

# 说明
# 需要pycurl； pip install pycurl;可能下载失败 可以试试sudo apt-get install python-pycurl


# python发邮件
# coding: utf-8
import smtplib
from email.mime.text import MIMEText

MAIL_HOST = "smtp.qq.com"
MAIL_PORT = 25
MAIL_USERNAME = "用户名"
MAIL_PASSWD = "密码"


class MailClient(object):

    def __init__(self):
        pass

    def __enter__(self):
        self.server = smtplib.SMTP()
        self.server.connect(MAIL_HOST, MAIL_PORT)
        self.server.login(MAIL_USERNAME, MAIL_PASSWD)
        return self

    def _send_text(self, from_, to_list, subject, text, text_type):
        msg = MIMEText(text.encode("utf-8"), _subtype=text_type, _charset='utf-8')
        msg['Subject'] = subject.encode("utf-8")
        me = "<" + from_ + ">"
        msg['From'] = me
        msg['To'] = ";".join(to_list)
        self.server.sendmail(from_, to_list, msg.as_string())

    def send_plain_text(self, from_, to_list, subject, text):
        self._send_text(from_, to_list, subject, text, 'plain')

    def send_html(self, from_, to_list, subject, html):
        self._send_text(from_, to_list, subject, html, 'html')

    def __exit__(self, exc_type, exc_value, exc_tb):
        self.server.close()
        return False


if __name__ == "__main__":
    with MailClient() as client:
        client.send_plain_text("xxx@qq.com", ["yyy@163.com"], u"北京欢迎你", u"很好")
        client.send_html("xxx@qq.com", ["yyy@163.com"], u"北京欢迎你", u"<a href='http://www.baidu.com'>很好</a>")

# coding=utf-8  列表解析
M = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
# 列表解析，矩阵
# 把矩阵M的每个row中的row[1]，放在一个新的列表中，其结果就是一个包含了矩阵的第二列的新列表
clo = [row[1] for row in M]
print
clo
# 例子：列表解析去步进坐标的一个硬编码列表和一个字符串
dia = [M[i][i] for i in [0, 1, 2]]
print
dia

doubles = [c * 2 for c in 'python']
print
doubles

G = (sum(row) for row in M)
print
next(G)

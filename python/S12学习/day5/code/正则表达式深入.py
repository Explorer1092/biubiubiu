#!/usr/bin/env python
# -*- coding:utf-8 -*-
"""
@version: 1.0
@author: shen
@file:正则表达式深入.py
@time: 16-3-5 下午11:44
"""
import re

# 正则表达式的另一种写法,先定义一个变量,在调用
p = re.compile("^[0-9]")  # 生成要匹配的对象,^代表从开头匹配,[0-9]代表匹配0至0的任意
m = p.match("14534Abc")  # 按上面生成的正则对象 去匹配字符串,如果能匹配成功
print(m.group())  # m.group() 返回匹配上的结果,此处为1,因为匹配上的1这个字符

p = "14534"
# 上面的第2和第3行也可以合并成一行来写
s = re.match("^[0-9]", p)

# 第一种方式是提前对要匹配的格式进行了编译(对匹配公式进行解析),这样在去匹配的时候就不用在编译匹配的格式
#  第二种简写是每次匹配的时候都要进行一次匹配公式的编译
# 如果要从一个5w行的文件中匹配出所有以数字开头的行,建议先把 正则公式进行编译在匹配

#  ^ 匹配字符串的开头
import re

# m =re.findall("$[0-8]", '12323adadc213')
# print(m)
#  $匹配字符串的末尾
#  .匹配任意字符,除了换行符,当re.DOTALL标记被制定时,则可以匹配包括换行符的自已字符
#  [...]用来表示一组字符,单独列出:[amk]'a','m'或'k'
s = re.match("[0-9]", '23da2311')  # [匹配数字
p = re.match("a-zA-Z0-9]", "12398932dakjdnajd23")
# [^...]不在[]中的字符,[^abc]匹配除了abc之外的字符
# re* 匹配0个或多个的表达式
# re+匹配1个或多个的表达式
# re?匹配0个或1个当前面的正则表达式定义的片段,非贪婪方式
#  re{n} 匹配多少次!!
# 匹配一个ip地址,第一个参数代表0-9的数字,{1,3}第二个参数代表匹配1次到3次,\.是转义字符,显示点号,
# {3}代表匹配.后面的要匹配3次,
# string = "192.168.1.132"
# test = re.match("([0-9] {1,3} \.) {3} \d {1,3} ", string)
# print(test.group())
# re{n,} i精确匹配n个前面表达式
#  re{n,m}匹配n到m次由前面的正则表达式定义的片段,贪婪模式
# a|b 匹配a或b
a = "ankndknvb"
t = re.match("a|b",a)
print(t.group())
# (re)G匹配括号内的表达式,也表示一个数组
# (? imx)正则表达式包含三种可选标志,i,m,或x,之影响括号中的区域
# (?-imx)正则表达式关闭i,m,或x.只影响括号中的区域
# (?: re)类是(...),但是不表示一个组
# \w 匹配字母数字
# \W 匹配非字母数字
# \s匹配任意空白字符,等价与[\t\n\r\f]
# \S匹配任意非空字符
# \d匹配任意数字,等价与[0-9]
# \D匹配任意非数字
# \A匹配字符串开始
# \Z匹配字符串结束,如果是存在换行,只匹配到换行前的结束字符串
# \z匹配字符串结束
# \G[匹配最后匹配完成的位置
# \b匹配一个单词边界,也就是指单词和空格见的位置,例如,'er\b'可以匹配'never'中的'er'
# \B匹配非单词边界
# \n\t匹配一个换行符,匹配一个制表符
# \1...\9匹配第n个分组的子表达式
# \10匹配第n个分组的子表达式,如果他经匹配,否则指的是八进制字符码表达式


# 正则表达式常用的5种操作
# re.match(pattern.string)  # 从头匹配
# re.search(pattern,string)    #匹配整个字符串,直到找到一个匹配
# re.split()  # 将匹配到的格式当作分割点对字符串分割成列表
m = re.split("[0-9]","alex1rain2jack3helen rachel9")
print(m)
# re.findall 找到所有要匹配的字符并返回列表,和split是相反的意思
b = re.findall("[0-9]","alex1rain2jack3helen rachel9")
print(b)
# 替换re.sub(pattern,repl,string,count,flag) 替换匹配到的字符,count代表替换4次
m=re.sub("[0-9]","|","alex1rain2jack3helen rachel9",count=4)
print(m)

#  正则表达式实例
# 字符匹配
# 实例python 描述 匹配"python"
# 字符类
# [Pp]ython    匹配"Python"或"python"
# rub[ye]       匹配"ruby"或"rube"
# [aeiou]       匹配中括号内的任意一个字母
# [0-9]         匹配任何数字,类似与[0123456789]
# [a-z]         匹配任何小写字母
# [A-Z]         匹配任何大写字母
# [a-zA-Z0-9]匹配任何字母及数字
# [^aeiou]      除了aeiou字母意外的所有字符

# 特殊字符类
# 点 .       匹配除"\n"换行之外的任何单个字符,要匹配包"\n"在内的任何字符,请使用像'[.\n]'的模式
# \d        匹配一个数字字符,等价于[0-9]

# re.match 与re.search的区别
# re.match()只匹配字符串的开始,如果字符串开始不符合正则表达式,则匹配失败,函数返回None;而re.search()匹配整个字符串,知道找到一个匹配


# 正则表达式修改:选项标志d
# re.I      不区分大小写匹配
string2 = "ALEX li"
m = re.search("[a-z]",string2,flags=re.I)     # 使用标志位re.I可以匹配到大写
print(m.group())
# 只匹配到换行
string3 = "alex \njack\nrain\nli"
z = re.search("^a.*$",string3,flags = re.M)
print(z.group())



# 几个常见的正则规则
# 匹配手机号

phone_str = "hey my name is alex ,and my phone number is 13651054607,please call me if you are pretty!"
phone_str2 = "hey my name is alex ,and my phone number is 18651054604,please call me if you are pretty!"
# 先匹配第一位,匹配第二位[358],用来表示一组字符,只能是3,5或8
# \d表示匹配任意数字,{9}匹配前一个字符9次
phone = re.search("(1)([358]\d{9})",phone_str)
if phone:
    print(phone.group())

# 匹配IP V4
ip_addr = "inet 192.168.60.223 netmask 0xffffff00 broadcast 192.168.60.255"
# \d匹配所有数字,{1,3}匹配1-3次,\.转义字符,匹配4次数字都是1-3位的0-9数字,用点隔开
m = re.search("\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}",ip_addr)
print(m.group())
# 分组匹配地址
contactInfo = "Oldboy school, Beijing Changping Shahe: 010-8343245"
match = re.search('(\w+),(\w+):(\S+) ', contactInfo)   # 分组
print(match.group())

match = re.search(r'(?P<last>\w+),(?P<first>\w):(?P<phone>\S+)',contactInfo)


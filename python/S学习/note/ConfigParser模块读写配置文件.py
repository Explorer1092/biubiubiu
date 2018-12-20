# -*- coding:utf-8 -*-

# configparser是python自带的模块，用来读取配置文件，用法简单

# 配置文件 test.conf
"""
[section1]
name = tank
age = 28

[section2]
ip = 192.168.1.1
port = 8080
"""
# python代码
import configparser

conf = configparser.ConfigParser()
conf.read(r"C:\Users\PCPC\cloud\S12学习\note\test.conf")

# 获取指定的section，指定的option的值
name = conf.get("section1", "name")
print(name)
age = conf.get("section1", "age")
print(age)

# 获取所有的section
sections = conf.sections()
print(sections)

# 写配置文件

# 更新指定section，option的值
conf.set("section2", "port", "8081")

# 写入指定section，增加option的值
conf.set("section2", "IEPort", "80")
conf.set("section2", "IE", "800")
conf.set("section2", "google", "1080")

# 添加新的section
conf.add_section("new_section")
conf.set("new_section", "new_option", "http://www.baidu.com/")

# 写回配置文件
conf.write(open("C:\\Users\\PCPC\\cloud\\S12学习\\note\\test.conf",'w'))

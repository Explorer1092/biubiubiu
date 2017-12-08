# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support.select import Select
import time
import datetime
import csv
import sys
#reload(sys)
#sys.setdefaultencoding('utf-8')

driver = webdriver.Chrome()#打开浏览器
driver.maximize_window() #浏览器最大化
driver.get("http://baidu.com")


def clickbutton(xpath1):
    driver.find_element_by_xpath(xpath1).click()
    time.sleep(1)
def inputvalue(xpath1,value1):
    time.sleep(1)
    driver.find_element_by_xpath(xpath1).send_keys(value1)
def linktext(text):
    driver.find_element_by_link_text(text).click()
    time.sleep(1)
def general():
    clickbutton("//*[@id='components-multi-select']/span")
    linktext('友盟')
    clickbutton("//*[@id='versions-multi-select']/span")
    linktext('待确认')
    selectvalue("//*[@id='customfield_11072']",'10971')
    inputvalue("//*[@id='labels-textarea']",u"线上")
    time.sleep(1)
    
def selectvalue(xpath1,value1):
    Select(driver.find_element_by_xpath(xpath1)).select_by_value(value1)

def Monday(version):
    if version == 'I':
        inputvalue("//*[@id='assignee-field']","guweixiong")
    else:
        inputvalue("//*[@id='assignee-field']","caoxu")
def Tuesday(version):
    if version == 'I':
        inputvalue("//*[@id='assignee-field']","guoqianling")
    else:
        inputvalue("//*[@id='assignee-field']","wangzhe")
def Wednesday(version):
    if version == 'I':
        inputvalue("//*[@id='assignee-field']","ligaofeng")
    else:
        inputvalue("//*[@id='assignee-field']","kongxiaoyan")
def Thursday(version):
    if version == 'I':
        inputvalue("//*[@id='assignee-field']","yanpei")
    else:
        inputvalue("//*[@id='assignee-field']","tantao")
def Friday(version):
    if version == 'I':
        inputvalue("//*[@id='assignee-field']","luguoqiang")
    else:
        inputvalue("//*[@id='assignee-field']","wangfeng")

def os(os1):
    try:
        if os1 == u"IOS 患者":
            selectvalue("//*[@id='customfield_10170']",'10241')    
        elif os1 == u'IOS 医生':
            selectvalue("//*[@id='customfield_10170']",'10242')         
        elif os1 == u'Android 患者':
            selectvalue("//*[@id='customfield_10170']",'10243')         
        else:
            selectvalue("//*[@id='customfield_10170']",'10244')
    except:
        os(os1)

def login():
    if time1 =='Monday':
        username='c1'
        password='123'
    elif time1 =='a1':
        username='123'
        password='111111'
    else:
        username='123'
        password='111111'

    inputvalue("//*[@id='login-form-username']",username) #登录用户名
    inputvalue("//*[@id='login-form-password']",password) #登录密码
    clickbutton("//*[@id='login-form-submit']") #点击登录按钮
    time.sleep(1)

def basic(time1):
    try:
        time.sleep(1)
        if time1 == 'Monday':
            inputvalue("//*[@id='project-field']",u"流量产品")
        elif time1 == 'Tuesday':
            inputvalue("//*[@id='project-field']",u"学院中心产品")
        elif time1 == 'Wednesday':
           inputvalue("//*[@id='project-field']",u"综合产品")
        elif time1 == 'Thursday':
            inputvalue("//*[@id='project-field']",u"线上互联网医院")
        else:
            inputvalue("//*[@id='project-field']",u"医生产品")
        time.sleep(1)
    
        clickbutton('//*[@id="所有项目"]/li[1]/a')
        time.sleep(1)
        inputvalue("//*[@id='issuetype-field']",u"缺陷")
        time.sleep(1)
        clickbutton("//*[@id='issuetype-suggestions']/div/ul/li/a")
        time.sleep(1)
    except:
        basic(time1)


time1 = time.strftime('%A',time.localtime())#判断今天是星期几

login()  #登录

i = 1
with open('2016-9-12.csv') as csvfile:  #打开每日友盟bug文件
    reader = [each for each in csv.DictReader(csvfile)]
for row in reader:
    clickbutton("//*[@id='create_link']")#点击创建问题
    time.sleep(1)
    if i==1:      
            basic(time1)  #根据日期选择对应方向

    time.sleep(1)
    inputvalue("//*[@id='summary']",row['title']) #填写标题
    time.sleep(1)
    inputvalue("//*[@id='description']",row['title'])#填写内容
    general() #公共参数调用
    time.sleep(1)
    inputvalue("//*[@id='duedate']",row['maturitydate'].decode('GB2312'))#选择到期日
    try:
        eval(time1)(row['client'][0]) #通过日期 选择对应开发
        time.sleep(1)
        clickbutton("//*[@id='所有用户']/li/a")
        time.sleep(1)
    except:
        eval(time1)(row['client'][0]) #通过日期 选择对应开发
        time.sleep(1)
        clickbutton("//*[@id='所有用户']/li/a")
        time.sleep(1)
        
    os(row['client'].decode('GB2312')) #选择版本
        
    
    level = row['level'] #级别   
    if level == 'P1':       #选择到期日和级别
        selectvalue("//*[@id='customfield_10172']",'10250')
    elif level == 'P2':
        selectvalue("//*[@id='customfield_10172']","10251")
    else:
        selectvalue("//*[@id='customfield_10172']","10252")


    clickbutton("//*[@id='create-issue-submit']")  #提交
    #clickbutton("//*[@id='create-issue-dialog']/div[2]/div/div/form/div[2]/div/a")
    
    i += 1

csvfile.close()

data = driver.title  
#print data  
#driver.quit()

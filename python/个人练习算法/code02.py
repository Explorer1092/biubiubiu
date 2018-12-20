from code01 import *
haha('span',8)
def pand(x,y):
    if x > y:
        print 'x ����y'
    elif x< y:
        print 'xС��y'
    else :
        print x ,"and",y,"are equal"
a =raw_input('������һ�����֣�')
b =raw_input('���ڴ�����һ�����֣�')
pand(a,b)
def jia(x,y):
    print  ("x+y�����:"),x+y
def jian(x,y):
    print ("x-y�����:"),x-y
def chen(x,y):
    print ("x*y�����:"),x*y
def chu(x,y):
    print  ("x/y�����:"),x/y
def panduan(x,o,y):
    if o =="+":
        jia(x, y)
    elif o=="-":
        jian(x, y)
    elif o=="*":
        chen(x, y)
    elif o=="/":
        chu(x, y)
    else:
        pass

a =input("����һ������")
b =raw_input("������һ������")
c =input("������һ������")
panduan(a,b,c)


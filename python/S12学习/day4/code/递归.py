# -*- coding:utf-8 -*-
# author:shen
# DATE:2016/2/18

# 递归是一种直接或间接调用自身算法的过程
# 递归算法解决问题的特点:
# 1. 递归就是在过程或函数里调用自身
# 2.在使用递归策略时,必须有一个明确的递归结束条件,称为递归出口
# 3.递归算法解题通常显得很简洁,但递归算法接替的运行效率较低,所以一般不提倡用递归算法设计程序
# 4.在递归调用的过程中系统为每一层的返回点\局部量等开辟了栈来存储,递归次数过多容易造成栈溢出等

# 要求
# 递归算法所体现的'重复'一般有三个要求:
# 一是每次调用在规模上都有所缩小(通常是减半)
# 二是相邻两次重复之间的紧密的联系,前一次要为后一次做准备(通常前一次的输出就做为后一次的输入)
# 三是在问题的规模极小时必须用直接给出解答而不再进行递归调用,因而每次递归调用都是有条件的,无条件的递归会陷入死循环而不能正常结束


# 实现
# def calc(n):
#     print(n)
#     if n / 2 > 1:
#         res = calc(n / 2)
#         print('res', res)
#     print('n', n)
#     return n
#
#
# calc(10)
#
#
# def fun(s):
#     print(s)
#     if s / 2 == type(int):
#         result = fun(s / 2)
#         print(result)
#     print(s)
#     return s
#
#
# primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 23]
# for i in primes:
#     print(i)
#     fun(i)


#
# def function():
#     print('1')
#     function()
#
#
# function()
#
# def show():
#     print('1')
#     print('2')
#
#
# while True:
#     show()

# 斐波那契(feibonaqi)数列指的是每前两个数相加的值是第三个例如:
# 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368
# 具体实现方法
def func(arg1, arg2, stop):     # 传入的三个参数func(0,1,50)
    if arg1 == 0:               # 判断如果第一个参数等于0
        print(arg1, arg2)       # 打印arg1和arg2
    arg3 = arg1 + arg2          # 定义变量arg3 等于 arg1加上arg2
    print(arg3)                 # 打印arg3
    if arg3 < stop:             # 判断如果arg3 小于stop(50)
        func(arg2, arg3, stop)  # 小于的话,就传入函数func(),arg2的值传给arg1,arg3的值传给arg2,在进行循环判断,直到大于50就不进行计算
# 总是等于前两个值的和
func(0, 1, 50)     # 传入三个参数

# 定义的第三个参数是步长step

# data = list(range(1,300,3))
# print(data)


# 二分查找
def binary_search(data_source, find_n):         # 传入列表和要找的数字
    mid = int(len(data_source) / 2)             # 把数据长度截取两份,并转换成int类型
    if len(data_source) > 1:                    # 判断如果数据长度大于1执行下面的判断
        if data_source[mid] > find_n:  # 数据在左边  #判断如果截取的数据大于查找的数据
            print("data in lef of %s" % data_source[mid])  # 输出判断后的数据
            # print(data_source[:mid])
            binary_search(data_source[:mid], find_n)    # 通过递归把查找到的数据在传入函数,在进行循环判断,直到找到数据
        elif data_source[mid] < find_n:  # 数据在右边    # 判断查找到的数据小于要查找的数据
            print("data in right of %s" % data_source[mid])    # 输出判断后的数据
            # print(data_source[mid:])
            binary_search(data_source[mid:], find_n)    # 递归把查找到的数据传入函数,在进行循环判断,在缩小范围查找
        else:
            print("found find_s,", data_source[mid])    # 否则就查找到数据
    else:
        print("cannot find....")    # 否则就查找不到数据

if __name__ == '__main__':
    data = list(range(1, 5000))    # 定义数据范围
    #   print(data)
    binary_search(data, 600)       # 传递参数




a = []
for i in range(10):
    a.append(i*2)
    print(a)

# 二维数组
a = [[ col for col in range(4)] for row in range(4)]
for i in a:
    print(i)
#输出
# [0, 1, 2, 3]
# [0, 1, 2, 3]
# [0, 1, 2, 3]
# [0, 1, 2, 3]
m = [[ a for a in range(3)] for b in range(3)]
for n in m:
    d = n[1]
    print(d)

mat = [[1,2,3],[4,5,6],[7,8,9]]
new_mat = [[row[i] for row in mat] for i in [0,1,2]]  #嵌套,row等于mat列表,i等于0,1,2 ,
# 取出的值就是
# [[1, 4, 7], [2, 5, 8], [3, 6, 9]]


# 二维数组,旋转90度实现
data = [[col for col in range(4)] for row in range(4)]
for i in data:
    print(i)
print(10*'--')

for r_index,row in enumerate(data):
    for c_index in range(r_index,len(row)):
        tmp = data[c_index][r_index]
        data[c_index][r_index] = row[c_index]
        data[r_index][c_index] = row[c_index]
        data[r_index][c_index] = tmp
    print(10 * '--')
    for r in data:print(r)



# 冒泡排序
# 将一个不规则的数组按从小达到的顺序进行排序
data = [1, 10, 4, 22, 33, 21, 54, 3, 85, 5, 22, 2, 18, 13, 12]

print("before sort", data)
previous = data[0]
for j in range(len(data)):
    tmp = 0
    for i in range(len(data) - 1):
        if data[i] > data[i + 1]:
            tmp = data[i]
            data[i] = data[i + 1]
            data[i + 1] = tmp
    print(data)
print("after sort:", data)

# -*- coding:utf-8 -*-

#
# list = [10, 9, 2, 3, 6, 1]
# list.sort()
# print list
#
#
# def comp(x, y):
#     if x < y:
#         return 1
#     elif x > y:
#         return -1
#     else:
#         return 0
#
#
# nums = [100, 20, 30, 50, 10]
# nums.sort(comp)
# print nums
# nums.sort(cmp)
# print nums
#
# # 冒泡排序
# array = [100, 99, 88, 55, 22, 11]
# for i in range(len(array))[::-1]:
#     for j in range(i):
#         if array[j] > array[j + 1]:
#             array[j], array[j + 1] = array[j + 1], array[j]
# print array
#
#
# # 另一种写法
# def bubble(numbers):
#     for i in range(len(numbers)):
#         for j in range(i):
#             if numbers[j] > numbers[i]:
#                 numbers[j], numbers[i] = numbers[i], numbers[j]
#     print numbers
#     return numbers
#
#
# bubble([9, 6, 4, 2, 8, 1])
#

# class Test:
#     def prt(self):
#         print(self)
#         print(self.__class__)
#
# t = Test()
# t.prt()
class lc():
    def __init__(self):
        self.a = 5
        self.name ="hello world"

    def fun(self) -> object:
        print "this is name：",self.name
        print "今天星期：",self.a
        
smalllc = lc()
print smalllc.fun()

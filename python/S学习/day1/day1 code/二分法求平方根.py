#!/usr/bin/env python
# -*- coding:utf-8 -*-
"""
@version: 1.0
@author: shen
@file:二分法求平方根.py
@time: 16-3-13 下午4:42

"""
# 如果guess平方等于x,则输出guess,程序结束
# 如果guess平方小于x,low = guess,继续执行步骤2
# 如果guess平方大于x,则high = guess;继续执行步骤2
x = float(input("Enter the number:"))
low = 0
high = x
guess = (low + high) / 2

while abs(guess ** 2 - x) > 1e-5:  # 1e-5代表1的5次方
    if guess ** 2 < x:
        low = guess
    else:
        high = guess
    guess = (low + high) / 2
print('the root of x is :', guess)


# 素数(prime Number)
# 素数(质数) 一个大于1的自然数,除了1和它本身外,不能被其他自然数整除,否则被称为合数
num = int(input("Enter the number:"))

for i in range(2,num):
    if num % i == 0:
        print('the number is not a prime')
        break
else:
    print('the number is a prime')

# 找到前50个素数

import math

count = 0
num = 2

while count < 50:
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            break
    else:
        print(num, )
        count += 1
    num += 1

# 回文数
# 一个整数如果顺着和反过来都是一样的(如13431,反过来也是13431),就被称为回文数
# 判断一个数num是否为回文数
# 算法:求num的逆序num,如果num==num,则num为回文数,否则num非回文数
num = int(input('Enter the number:'))
num_temp = num
num_prime = 0

while num_temp != 0:
    num_prime = num_prime * 10 + num_temp % 10
    num_temp /= 10

if num == num_prime:
    print('The number', num, 'is a palindrome')
else:
    print('The number', num, 'is not a palindrome')

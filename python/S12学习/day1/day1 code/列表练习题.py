#!/usr/bin/env python
# -*- coding:utf-8 -*-
"""
@version: 1.0
@author: shen
@file:列表练习题.py
@time: 16-3-13 上午12:24
读取一个字符串,计算每个字母出现的个数
方案一: 生成26个变量,代表每个字母出现的个数
方案二:生成具有26个元素的列表,将每个字母转化为相应的索引值,如a-0,b-1...
"""
# 方案二实现:
count = [0] * 26
for i in 'abcdeadbe':
    count[ord(i) - 97] += 1  # ord参数是一个字符,返回他对应的整数
    print(count)
# 方案三实现:生成一个字典,字母做键,对应出现的次数做值
count = {}
for i in 'abcdad':
    if i in count:
        count[i] += 1
    else:
        count[i] = 0
    print(count)

    # 读取小说emma.txt,打印钱10个最常见单词
    # 是否还能直观的将每个单词转化为相应的数字
f = open("emma.txt")
word_freq = {}
for line in f:
    words = line.split()
    for word in words:
        if word in word_freq:
            word_freq[word] += 1
        else:
            word_freq[word] = 1
word_freq_lst = []
for word, freq in word_freq.items():
    word_freq_lst.append((freq, word))
word_freq_lst.sort(reverse=True)

for freq, word in word_freq_lst[:10]:
    print(word, freq)


# 反转字典
# 生成一个新字典,其键为原字典的值,值为原字典的键
# 同一个值,可能对应多个键,需要用列表存储


def invert_dict(d):
    inverse = {}
    for key in d:
        val = d[key]
        if val in inverse:
            inverse[val].append(key)
        else:
            inverse[val] = [key]
    print(inverse)

a = {'k1': 'v1', 'k2': 'v2', 'k3': 'v3'}
invert_dict(a)

# 使用enumerate生成索引位置和对应值
for i, v in enumerate(['hello', 'world', 'test']):
    print(i,v)


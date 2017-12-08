#!/usr/bin/env python
# -*- coding:utf-8 -*-
"""
@version: 1.0
@author: shen
@file:中文分词.py
@time: 16-3-13
实现思路:正向最大匹配分词,若干个中文分词,假如最长的分词4个字,我们只需要判断前4个是不是一个单词
如果不是在判断前三个是不是一个单词,假设前面两个是一个单词,就从这里断开,在判断后面3个是不是一个单词
知道最后所有的分开
"""


def load_dict(filename):
    word_dict = set()
    max_len = 1
    f = open(filename)
    for line in f:
        word = line.strip()
        word_dict.add(word)
        if len(word) > max_len:
            max_len = len(word)
    return max_len, word_dict


def fmm_word_seg(sent, max_len, word_dict):
    begin = 0
    words = []
    # sent = unicode(sent,'utf-8')

    while begin < len(sent):
        for end in range(begin + max_len, begin, -1):
            if sent[begin:end] in word_dict:
                words.append(sent[begin:end])
                break
        begin = end
    return words


max_len, word_dict = load_dict('lexicon.txt')
sent = input("input a sentenced:")
words = fmm_word_seg(sent, max_len, word_dict)
for word in words:
    print(word)

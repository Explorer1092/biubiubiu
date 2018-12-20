# -*- encoding:utf-8 -*-
import re

file = '/Users/shen/Documents/Code/vipkid-xbk/basescript/CodeNote/doc.text'


def count_word(file):
    with open(file, 'r') as p:
        text = p.read()

    words = re.split(r'[,.!\s\n]', text)
    words_correct = []

    for word in words:
        if word != '':
            words_correct.append(word)
    print("该文本中的单词数量:" + str(len(words_correct)) + "个")


def testspilt():
    s1 = 'aa bb cc,fdfd,fdf'
    # spilt 只能做简单的字符分割
    print(s1.split(' '))
    # re.spilt 可以做多个分割把空格和逗号的都分开
    print(re.split(r'[,\s]', s1))


if __name__ == '__main__':
    count_word(file)
    testspilt()

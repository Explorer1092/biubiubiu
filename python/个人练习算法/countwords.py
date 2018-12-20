# -*- encoding:utf-8 -*-
import re

data = '/Users/shen/Documents/Code/vipkid-xbk/basescript/CodeNote/doc.text'


def countword(file):
    with open(file, 'r') as f:
        text = f.read()
    # 匹配符号，.!空格，换行等
    words = re.split(r'[,.!\s\n]', text)
    words_count = []

    for word in words:
        if word != '':
            words_count.append(word)
    print("统计一共有", str(len(words_count)) + "个单词")

    resoult = {}
    newstr = ''
    currentstr = text.replace(' ', '')
    for i in currentstr:
        if (currentstr.count(i) <= 1):
            newstr = newstr + i
            nestr = newstr + ":"
            newstr = newstr + str(1) + ' '
    print(resoult)


if __name__ == '__main__':
    countword(data)

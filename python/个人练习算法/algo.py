# -*- encoding:utf-8 -*-
# 斐波那契数列
def alog(n):
    a = 0
    b = 1
    result = []
    for i in range(n):
        result.append(b)
        a, b = b, a + b
    print(result[99])
    return result


alog(100)

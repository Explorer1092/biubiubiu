# -*- coding:utf-8 -*-
# 用户输入1-2*((60-30+(-40/5)*(9-2*5/3+7/3*99/4*2998+10*568/14))-(-4*3)/(16-3*2))等类似公式后
# 必须自己解析里面的(),+,-,*,/符号和公式，运算后得出结果，结果必须与真实的计算器所得出的结果一致

import re


def deal_minus_issue(calc_list):
    new_calc_list = []
    for index, item in enumerate(calc_list):
        if item.strip().endswith("*") or item.strip().endswith("/"):
            new_calc_list.append("%s-%s" % (calc_list[index], calc_list[index + 1]))
        elif ("*" or "/") in item:
            new_calc_list.append(item)

    print("new calc_list:", new_calc_list)
    return new_calc_list


# 做乘除计算
def mutilpy_and_dividend(formula):
    print("运算", formula)  # 先算乘除怎么取出来
    calc_list = re.split("[+-]", formula)
    calc_list = deal_minus_issue(calc_list)
    print(calc_list)
    for item in calc_list:
        sub_calc_list = re.split("[*/]", item)
        sub_operator_list = re.findall("[*/]", item)
        print(sub_calc_list, sub_operator_list)
        sub_res = None
        for index, i in enumerate(sub_calc_list):  # 取下标用for index,i in enumerate(),只可以取字符串的下标
            if sub_res:  # 这不是第一次, 代表为true
                if sub_operator_list[index - 1] == "*":
                    sub_res *= float(i)
                else:
                    sub_res /= float(i)
            else:
                sub_res = float(i)
        print("\033[31;1m[%s]=\033[0m" % item, sub_res)
        formula = formula.replace(item, str(sub_res))
    print("\033[31;1m[%s]结果\033[0m" % formula)


def calc(formula):
    parentheses_flag = True  # 这个循环只是为了取出括号
    while parentheses_flag:  # 只要这里一直是true
        m = re.search("\([^()]+\)", formula)  # 匹配括号,用\转义,匹配左括号右括号,新号代表括号里的所有字符,.+代表一个或多个字符
        # ^代表非的意思不包括左括号不包括右括号,其他的所有字符+,一个或多个
        if m:
            print(m.group())
            sub_formula = m.group().strip("()")
            print(sub_formula)
            sub_res = mutilpy_and_dividend(sub_formula)
        break


if __name__ == '__main__':
    formula = "1-2*((60-30+(9-2*5/3+7/3*99/4*2998+10*568/14)(-40/5))-(-4*3)/(16-3*2))"
    res = calc(formula)

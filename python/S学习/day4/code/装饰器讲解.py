# -*- coding:utf-8 -*-
# !/usr/bin/env python


# 装饰器方法实现

# 执行第一次只是返回了inner方法的地址
def login(func):
    def inner(*args, **kwargs):  # 传入实参home("Yamaha", "Super")
        print("passed user verification...")
        return func(*args, **kwargs)  # 执行home函数内部函数块 return func函数存放在内存中,*args,可以传入多个参数或者一个参数

    return inner  # return语句把执行结果返回上一层


# fun()  fun带参数是传参数,函数调用
# fun   不带括号是存放在内存中方法,不能调用
# return func不加括号是方法
# return func()加括号是求返回值
@login
# @函数就执行这句先调用login函数
# 给home传入多个参数,在fun(*args)添加*
def home(name, passwd):
    print("welcome [%s] to home page [%s]" % (name, passwd))
    a = {'k1': 'v1', 'k2': 'v2', 'k3': 'v3'}
    for i in a.items():
        print(i)
    return "有返回值,返回print(t)"


@login
def tv(name):
    print("welcome [%s] to tv page" % name)

# -*- coding:utf-8 -*-
#!/usr/bin/env python


# 装饰器方法实现

# 执行第一次只是返回了inner方法的地址
def login(func):
    def inner(*args,**kwargs):     # 传入实参home("Yamaha", "Super")
        print("passed user verification...")
        return func(*args,**kwargs)  # 执行home函数内部函数块 return func函数存放在内存中,*args,可以传入多个参数或者一个参数

    return inner      # return语句把执行结果返回上一层
# fun()  fun带参数是传参数,函数调用
# fun   不带括号是存放在内存中方法,不能调用
# return func不加括号是方法
# return func()加括号是求返回值
@login
# @函数就执行这句先调用login函数
# 给home传入多个参数,在fun(*args)添加*
def home(name, passwd):
    print("welcome [%s] to home page [%s]" % (name, passwd))
    a = {'k1':'v1','k2':'v2','k3':'v3'}
    for i in a.items():
        print(i)
    return "有返回值,返回print(t)"

@login
def tv(name):
    print("welcome [%s] to tv page" % name)

@login
def move(name):
    print("welcome [%s] to move page" % name)


t =home("Yamaha", passwd="Super")
print(t)
tv('ALex')
move('shen')


# @login
# 执行@login函数,把自己装饰的函数名当作参数,login(home)
# home函数重新定义,定义为login(home)的返回值
# 新的home =




# 装饰器中传入装饰器


# 第一个装饰器
def Before(request, kargs):
    print('before')


# 第二个装饰器
def After(request, kargs):
    print('after')


# 多参数装饰器
def Filter(before_func, after_func):
    def outer(main_func):
        def wrapper(request, kargs):

            before_result = before_func(request, kargs)
            if (before_result != None):
                return before_result;

            main_result = main_func(request, kargs)
            if (main_result != None):
                return main_result;

            after_result = after_func(request, kargs)
            if (after_result != None):
                return after_result;

        return wrapper

    return outer


@Filter(Before, After)
def Index(request, kargs):
    print('index')





# 装饰器中传入装饰器


# 第一个装饰器
def Before(request, kargs):
    print('before')
    return 33

# 第二个装饰器
def After(request, kargs):
    print('after')


# 多参数装饰器
def Filter(before_func, after_func):
    def outer(main_func):
        def wrapper(request, kargs):

            before_func(request, kargs)

            main_func(request, kargs)

            after_func(request, kargs)

        return wrapper

    return outer


@Filter(Before, After)
def Index(request, kargs):
    print('index')
    return 'Index...'

Index('hello','alex')
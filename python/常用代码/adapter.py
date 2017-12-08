# -*-coding:utf-8-*-
import hashlib
import os


def MD5(c):
    return hashlib.md5(c).hexdigest()


def loop_folder(path):
    namedir = os.getcwd()
    print namedir

    # path_new = namedir + ".\\data\\" +  MD5(path)
    # print os.path.isdir(path)

    # print '当前路径',namedir
    if os.path.isdir(path):
        print path
        print MD5(path)
        os.system('mkdir %s' % ".\\data\\" + MD5(path))
    #     try:
    #         os.system('xcopy %s/* %s/' % (path, MD5(path)))
    #     except:
    #         pass
    #
    #     folderList = os.listdir(path)
    #     for x in folderList:
    #         # print "x:", x
    #         loop_folder(path + "/" + x)


loop_folder("C:\\test")
# ".sonar/data/(MD5)"

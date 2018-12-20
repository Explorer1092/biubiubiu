# coding=utf-8
import os
from os.path import join
import re
import subprocess
import time
from string import Template
from cmd import Cmd

currpath = os.path.dirname(os.path.realpath(__file__))

JMETER_Home = "/Users/shen/Public/apache-jmeter/bin/jmeter"

origin_jmxfile = replaced_jmxfile = ''


def before_check():
    global origin_jmxfile
    count_jmxfile = 0
    for root, dirs, files in os.walk(currpath):
        for name in files:
            if '-P.jmx' in name:
                os.remove(join(root, name))
            if '-P.jmx' not in name and '.jmx' in name and 'XL' not in name:
                count_jmxfile = count_jmxfile + 1
                origin_jmxfile = join(root, name)
    if count_jmxfile != 1 and origin_jmxfile:
        print('为了更智能地执行jmx文件，请确保有且仅有一个有效的jmx文件!')
        return False
    else:
        return True


def create_para_jmxfile():
    global origin_jmxfile, replaced_jmxfile
    jmx_str = ''
    with open(origin_jmxfile, "r", encoding="utf-8") as file:
        jmx_str = file.read()
    patten = '<stringProp name="LoopController.loops">(.*?)</stringProp>'
    replace_str = '<stringProp name="LoopController.loops">$loops</stringProp>'
    jmx_str = re.sub(patten, replace_str, jmx_str)
    patten = '<stringProp name="ThreadGroup.num_threads">(.*?)</stringProp>'
    replace_str = '<stringProp name="ThreadGroup.num_threads">$num_threads</stringProp>'
    jmx_str = re.sub(patten, replace_str, jmx_str)
    replaced_jmxfile = origin_jmxfile.replace('.jmx', '-P.jmx')
    with open(replaced_jmxfile, "w+", encoding="utf-8") as file:
        file.writelines(jmx_str)


def getDateTime():
    '''
    获取当前日期时间，格式'20150708085159'
    '''
    return time.strftime(r'%Y%m%d%H%M%S', time.localtime(time.time()))


def execcmd(command):
    print("command={command}")

    output = subprocess.Popen(
        command,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        shell=True,
        universal_newlines=True)

    stderrinfo, stdoutinfo = output.communicate()
    print("stderrinfo={stderrinfo}")
    print("stdoutinfo={stdoutinfo}")
    print("returncode={output.returncode}")


def execjmxs(Num_Threads, Loops):
    tmpstr = ''
    with open(replaced_jmxfile, "r", encoding="utf-8") as file:
        tmpstr = Template(file.read()).safe_substitute(
            num_threads=Num_Threads, loops=Loops)
    now = getDateTime()
    tmpjmxfile = currpath + '\{now}-T{Num_Threads}XL{Loops}.jmx'
    with open(tmpjmxfile, "w+", encoding="utf-8") as file:
        file.writelines(tmpstr)
    csvfilename = currpath + "\{now}-result.csv"
    htmlreportpath = currpath + "\{now}-htmlreport"
    if not os.path.exists(htmlreportpath):
        os.makedirs(htmlreportpath)
    # execjmxouthtml = os.system(JMETER_Home +"-n -t"+ tmpjmxfile+"-l"+ csvfilename +"-e -o"+ htmlreportpath)
    execcmd(JMETER_Home + " -n -t " + tmpjmxfile + " -l " + csvfilename + " -e -o " + htmlreportpath)
    # print(JMETER_Home +" -n -t "+ tmpjmxfile+" -l "+ csvfilename +" -e -o "+ htmlreportpath)


if before_check():
    create_para_jmxfile()
    jobs = [dict(Num_Threads=(x + 1), Loops=1) for x in range(10)]
    [execjmxs(x["Num_Threads"], x["Loops"]) for x in jobs]
import os
from os.path import join

currpath = os.path.dirname(os.path.realpath(__file__))
run_time_list = []
scene_name_list = []
jmxfile_name_list = []
csvfile_list = []
htmlreport_list = []

for root, dirs, files in os.walk(currpath):
    for name in files:
        if '.jmx' in name and '-' in name and 'XL' in name:
            name_split_list = name.split('-')
            run_time_list.append(name_split_list[0])
            scene_name_list.append(name_split_list[-1].replace('.jmx', ''))
            jmxfile_path = join(root, name).replace('\\', '/')
            jmxfile_link = '<a href="file:///{jmxfile_path}" target="_blank">{name}</a>'
            jmxfile_name_list.append(jmxfile_link)
            csvfile_name = name_split_list[0] + '-result.csv'
            csvfile_path = join(root, csvfile_name).replace('\\', '/')
            csvfile_link = '<a href="file:///{csvfile_path}" target="_blank">{csvfile_name}</a>'
            csvfile_list.append(csvfile_link)
            htmlfile_tail = '\\' + name_split_list[0] + '-htmlreport\\index.html'
            htmlfile_path = currpath + htmlfile_tail
            htmlfile_path = htmlfile_path.replace('\\', '/')
            htmlfile_link = '<a href="file:///{htmlfile_path}" target="_blank">查看</a>'
            htmlreport_list.append(htmlfile_link)

result = [run_time_list, scene_name_list, jmxfile_name_list, csvfile_list,
          htmlreport_list]
title = ['执行时间', '场景名', 'jmx文件', '响应结果', '报告详情']

th_str = '<tr>'
for x in title:
    th_str = th_str + '<th>' + x + '</th>'
else:
    th_str = th_str + '</tr>'

td_str = ''
for index, item in enumerate(run_time_list):
    td_str = td_str + '<tr>'
    for x in result:
        td_str = td_str + '<td>' + x[index] + '</td>'
    td_str = td_str + '</tr>'
table_str = '<table border="1">{th_str}{td_str}</table>'
html_str = '<!DOCTYPE html><html lang="en"><body><center>{table_str}</center></body></html>'
with open('SummaryReport.htm', 'w', encoding='utf-8') as file:
    file.writelines(html_str)

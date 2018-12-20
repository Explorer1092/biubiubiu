# -*- coding:utf-8 -*-

import counter
import joker
import mitmproxy.http
from mitmproxy import ctx, http

# class Counter:
#     def __init__(self):
#         self.num = 0
#
#     # 请求的统计
#     def request_Count(self, flow: mitmproxy.http.HTTPFlow):
#         self.num = self.num + 1
#         ctx.log.info("We've seen %d flows" % self.num)
#         ctx.log.info(mitmproxy.http.HTTPFlow.get_state(flow))
#
#     # 记录用户的搜索词，再修改请求，将搜索词改为360搜索
#     # def request(self, flow: mitmproxy.http.HTTPFlow):
#     #     # 忽略非百度搜索地址,如果地址不是www.baidu.com的都忽略
#     #     if flow.request.host != "www.baidu.com":
#     #         return
#     #     # 确认请求参数中有搜索词
#     #     if "wd" not in flow.request.query.keys():
#     #         ctx.log.warn("can not get search word from %s" % flow.request.pretty_url)
#     #         return
#     #     ctx.log.info("catch search word: %s" % flow.request.query.get("wd"))
#     #
#     #     # 替换搜索词为"360搜索"
#     #     flow.request.query.set_all("wd", ["python"])
#     #     ctx.log.info("篡改后URL是: %s" % flow.request.pretty_url)
#
#     # 修改服务端响应，实现一个response事件
#     # def response(self, flow: mitmproxy.http.HTTPFlow):
#     #     text = flow.response.get_text()
#     #     text = text.replace("python", "请使用谷歌")
#     #     ctx.log.info(flow.response.set_text(text))
#
#     # 需要拒绝客户端请求，所以实现一个http_connect事件,可以屏蔽不想访问的网站
#     def http_connect(self, flow: mitmproxy.http.HTTPFlow):
#         # 确认客户端是想访问www.baidu.com
#         if flow.request.host == "www.baidu.com":
#             # 返回一个非2xx响应断开连接
#             flow.response = http.HTTPResponse.make(404)

addons = [
    counter.Counter(),
    joker.Joker(),
]

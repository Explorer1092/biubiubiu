#!/usr/bin/python3
import websocket
import _thread
import time
import json


def on_message(ws, message):
    print(message)


def on_error(ws, error):
    print(error)


def on_close(ws):
    print("### closed ###")


data = {"userid": "448", "roomid": "1011770361", "role": "2", "alias": "slotb", "timestamp": "1500432643208",
        "msgid": "200"}
jsondata = json.dumps(data)


def on_open(ws):
        def run(*args):
            for i in range(500):
                time.sleep(5)
                ws.send(jsondata)
            time.sleep(5)
            ws.close()
            print("thread terminating...")
        _thread.start_new_thread(run, ())


if __name__ == "__main__":
    websocket.enableTrace(True)
    ws = websocket.WebSocketApp("ws://a2-ep1.api.com:8061/",
                                on_message=on_message,
                                on_error=on_error,
                                on_close=on_close)
    ws.on_open = on_open
    ws.run_forever()

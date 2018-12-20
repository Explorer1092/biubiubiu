package util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shenwandong
 * @date 2018/6/21 11:10
 */
public class JsonDemo {

    /**
     * 将json字符串转为json对象
     *
     * @param parse
     * @return
     */
    static JSONObject changeStringToJson(String parse) {
        JSONObject js = JSON.parseObject(parse);
        return js;
    }

    /**
     * 将json字符串数组转为json数组对象
     * @param jsonstr
     * @return
     */
    static JSONArray changeStringArray(String jsonstr) {
        JSONObject js = JSON.parseObject(jsonstr);
        if (!js.containsKey("person")) {
            return null;
        }
        String strArray = js.getString("person");
        return JSONArray.parseArray(strArray);
    }

    /**
     * 将json字符串转为map
     * @param jsonStr
     * @return
     */
    static Map<String, Object> changeJsonToMap(String jsonStr) {
        Map<String, Object> map = new HashMap<String, Object>();
        JSONObject jo = JSON.parseObject(jsonStr);
        for (String str : jo.keySet()) {
            map.put(str, jo.get(str));
        }
        return map;
    }

    public static void main(String[] args) {
        // 获取json对象，输出,存储数组
        String jsonstr = "{\"person\":{\"name\":\"小川94\",\"age\":18,\"gender\":\"boy\",\"hasGirlFriend\":false}}";
        JSONObject t1 = changeStringToJson(jsonstr);
        System.out.println(t1.toString());
        // 获取json数组，输出.对象加数组符合
        String jsonlist = "{\"person\":[{\"name\":\"小川94_2号\"},{\"name\":\"小川94_3号\"}]}\n";
        System.out.println(changeStringArray(jsonlist));
        // 输出map
        System.out.println(changeJsonToMap(jsonstr));
    }
}

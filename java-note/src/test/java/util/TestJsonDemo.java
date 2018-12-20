package util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @author shenwandong
 * @date 2018/6/21 17:12
 */
public class TestJsonDemo {
    private long startTime;
    private long endTime;

    private static final String JSON_TO_BEAN = "\"{\"+\"'name':'小川94',\"+\"'age':18,\"+\"'gender':'boy',\"+\"'hasGirlFriend':false,\"+\"'interest':'coding'\"+\"}\"";

    private static String str = "\"{\"person\":{\"+\"\"name\":\"小川94\",\"age\":18,\"gender\":\"boy\",\"+\"\"hasGirlFriend\":false,\"interest\":\"coding\"}}\"";
    private static String strArray ="\"{\"person\":[\"+\"{\"name\":\"小川94_2号\"},{\"name\":\"小川94_3号\"}]}\"";

    @Before
    public void setUp() throws Exception {
        this.startTime = System.currentTimeMillis();
        System.out.println("==========开始测试==========");
    }

    @After
    public void tearDown() throws Exception {
        this.endTime = System.currentTimeMillis();
        System.out.println("测试用时：" + (endTime - startTime));
        System.out.println("===========测试结束===========");
    }

    @Test
    public void testChangeJsonToMap() {
        Map<String, Object> map = JsonDemo.changeJsonToMap(JSON_TO_BEAN);
        System.out.println(map);
    }

    @Test
    public void testChangeStringToJson() {
        JSONObject jo = JsonDemo.changeStringToJson(str);
        System.out.println(jo);
    }

    @Test
    public void testChangeStringToArray() {
        JSONArray ja = JsonDemo.changeStringArray(strArray);
        System.out.println(ja);
        assert ja != null;
        System.out.println(ja.get(0));
    }




}

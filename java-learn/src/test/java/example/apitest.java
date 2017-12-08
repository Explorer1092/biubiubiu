//package example;
//
//import com.oracle.javafx.jmx.json.JSONException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//import util.PropertiesUtils;
//import util.StringUtils;
//import util.TimeUtils;
//import util.WriteOrReadFileUtils;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//public class apitest {
//    public final Logger logger = LoggerFactory.getLogger(apitest.class);
//    public static Map<String, String> conf = PropertiesUtils.getProperties("/conf/baseTest.properties");
//    public static String url = conf.get("parent_url");
//    public static Map<String, String> headerMap = new HashMap<>();
//    public static Map<String, Object> dataMap = new HashMap<>();
//    public static String token = "";
//    public static List sids = new ArrayList();
//    public static TimeUtils timeUnit = new TimeUtils();
//    public static String parent_url = conf.get("learning_url");
//    public static Integer hour = 8;
//    public static Integer[] min = {0, 30};
//    public static Integer second;
//    public static Long ts;
//    public static File result;
//    Boolean flag = true;
//
//    public static String api = "/api/v1/order/search";
//
//
//    @BeforeSuite
//    @Parameters("env")
//    public void beforeSuite(String env) {
//        url = StringUtils.getUrlByEnv(url, env, api);
//    }
//
//    @AfterClass
//    public void beforeClass() {
//        headerMap.put("Content-Type", "application/json;charset=UTF-8");
//
//    }
//
//    @AfterClass
//    public void afterClass() {
//
//    }
//    @Test(description ="测试样本",groups={"somk","function"})
//    public void testBookinfo() throws JSONException {
//        String bookStr = WriteOrReadFileUtils.ReadFile(result);
//
//    }
//
//}
//
//
//
//

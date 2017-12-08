package demo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import util.ReportUtil;


import static io.restassured.RestAssured.given;

/**
 * demo.demo
 */

public class Test3 {
    @BeforeSuite
    public void setUp() {
        RestAssured.baseURI = "http://gateway.api-dev.com:8000/teacher-dev-9090";
        RestAssured.port = 80;
        RestAssured.basePath = "/api/v1";
    }



    @Test
    public void testcase() {
        Response response = given().
//                header("Authorization", "Bearer uBkIk9A0N08MqaJSiUixR88VzFLXje").

                get("/api/v1/teacher/signup");
//        System.out.println(response.asString());
        String json = response.asString();
        JsonPath jp = new JsonPath(json);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals("21", jp.get("total").toString());
        ReportUtil.log("status:" + response.statusCode());
        ReportUtil.log("rsp:" + json);
        ReportUtil.log("预期为：200"+"实际返回值为："+response.statusCode());
    }

    @Test
    public void captcha_test() {


    }

}

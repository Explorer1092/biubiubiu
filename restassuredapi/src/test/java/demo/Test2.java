package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.MessageUtil;

public class Test2 {
    String message = "Manisha";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,messageUtil.salutationMessage(),"hellooooo");
    }
    @Test(description = "这是一个测试描述")
    public void testsuper() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals("hello","hello");
    }

//    @Test
//    public void testmakedon() {
//        Response response = given().
//                header("Authorization", "Bearer uBkIk9A0N08MqaJSiUixR88VzFLXje").
//                get("http://gateway.api.com/order/api/v1/745/orders?p=1");
//        System.out.println(response.asString());
//        String json = response.asString();
//        JsonPath jp = new JsonPath(json);
//        Assert.assertEquals(200, response.statusCode());
//        Assert.assertEquals("21", jp.get("total").toString());
//    }
}
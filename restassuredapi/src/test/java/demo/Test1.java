package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.MessageUtil;
import util.ReportUtil;

public class Test1 {
    String message = "Manisha";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        Assert.assertEquals(message, messageUtil.printMessage());
        ReportUtil.log("message:"+message);
    }
}
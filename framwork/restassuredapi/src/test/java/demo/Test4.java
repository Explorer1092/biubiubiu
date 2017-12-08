package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 {
    @Test(description = "test desc", groups = "test-group")
    public void testMethodOne() {
        Assert.assertEquals("123","123");

    }
    @Test
    public void testMethodTwo() {
        Assert.assertEquals("200","200");

    }

    @Test(description = "helloworld",groups = { "test-group" })
    public void testMethodThree() {
        Assert.assertEquals("ha","ha");

    }
}

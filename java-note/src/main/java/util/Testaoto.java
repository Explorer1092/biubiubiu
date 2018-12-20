package util;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Shen on 2017/6/30.
 */
@Listeners({util.AssertionListener.class})
public class Testaoto {


    @Test
    public void testAssert3() {
        Assertion.verifyEquals(2, 3, "比较两个数是否相等：");
        Assertion.verifyEquals(1, 2, "比较两个数是否相等：");
    }

    @Test
    public void testAssert4() {
        Assertion.verifyEquals(4, 3, "比较两个数是否相等：");
        Assertion.verifyEquals(2, 2, "比较两个数是否相等：");
    }

    @Test
    public void testAssert5() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void testAssert6(){
        Assert.assertNotNull("");
    }

    @Test
    public void testAssert7() {
        Assert.assertEquals("hello", "hellO");
    }

}

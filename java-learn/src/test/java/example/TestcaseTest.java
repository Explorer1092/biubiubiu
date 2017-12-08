package example;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Shen on 2017/3/15.
 */
public class TestcaseTest {

    @Before
    public void BeforTest() {
        System.out.println("before test");
    }

    @Test
    public void beginTest() {
        Assert.assertNotNull("hello");
    }

    @After
    public void afterTest() {
        System.out.println("after test");
    }


}
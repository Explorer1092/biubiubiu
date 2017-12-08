package util;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.assertEquals;




/**
 * Created by Shen on 2017/3/16.
 */
public class AnnotationTest {
    //这是一个构造方法，也就是要测试的方法
    public int AnnotationTest(int a,int b) {
        return a + b;
    }

    //@BeforeClass在类实例化前执行一次
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");
    }

    // @AfrerClass在所有资源执行后执行一次
    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");
    }

    //@Before在每个@Test执行前执行一次
    @Before
    public void setUp() {
        System.out.println("Before");
    }

    //@After在每个@Test执行后执行一次
    @After
    public void tearDown() {
        System.out.println("After");
    }

    //@Test标记一个方法为测试方法
    @Test
    public void test1() {
        AnnotationTest tt = new AnnotationTest();
        tt.AnnotationTest(2, 3);
        assertEquals(5, 5);
        System.out.println("test1");
    }

    //@Test标记一个方法为测试方法
    @Test
    public void test2() {
        System.out.println("test2");
    }

    //@Ignore标记的方法不会被执行
    @Ignore
    public void test3() {
        System.out.println("test3");
    }
}

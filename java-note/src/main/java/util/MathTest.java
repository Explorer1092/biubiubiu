package util;

import org.junit.Before;
import org.junit.Test;
//导入包assartEquals时需要时static
//import java.lang.Math;

import static org.junit.Assert.assertEquals;

/**
 * Created by Shen on 2017/3/16.
 */
public class MathTest {
    @Before
    public void set() throws Exception {

    }

    @Test
    public void factorial() throws Exception {
        assertEquals(20, new Math().factorial(5));
    }


}
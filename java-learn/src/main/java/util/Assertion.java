package util;

import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shen on 2017/6/28.
 */
public class Assertion {
    public static boolean flag = true;
    public static List<Error> errors = new ArrayList<Error>();

    public static void verifyEquals(Object actual, Object expected) {
        try {
            Assert.assertEquals(actual, expected);
        } catch (Error e) {
            errors.add(e);
            flag = false;
        }
    }

    public static void verifyEquals(Object actual, Object expected, String message) {
        try {
            Assert.assertEquals(message, actual, expected);
        } catch (Error e) {
            errors.add(e);
            flag = false;
        }
    }
}

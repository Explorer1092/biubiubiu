package DemoTest;

import org.junit.Test;

import static java.util.Arrays.sort;
import static org.junit.Assert.*;

public class Junittest {

    @Test
    public void junitHasAssertionstest() {

        assertEquals(6, 3 + 3);
        assertEquals("3+3=6", 6, 3 + 3);

        assertFalse("false is false", false);
        assertFalse(false);

        int[] oneTo10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tenToOne = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(tenToOne);
        assertArrayEquals(oneTo10,tenToOne);
    }
}

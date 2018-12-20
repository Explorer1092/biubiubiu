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
	
	
	
	    public static void main(String[] args) {
	        String str = "abcdef";
	        StringBuilder stringBuilder = new StringBuilder(str);
	        stringBuilder.reverse();
	        System.out.println(stringBuilder);

	    }

	    public void sun() {
	        long sum = 0, num = 1;           //sum用于加和，num作为每一个数阶乘后的结果
	        for (int i = 1; i <= 10; i++) {
	            num *= i;                 //num始终保留上一次阶乘的结果，所以只需要乘i
	            sum += num;               //每次阶乘后相加
	        }
	        System.out.println("1+2!+3!+...+20!=" + sum);
	    }
	

	
}

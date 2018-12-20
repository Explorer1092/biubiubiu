package example;


/**
 * Created by Shen on 2017/3/15.
 */
public class Testcase {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a,int b) throws Exception {
        if (0 == b) {
            throw new Exception("除数不能为0");
        }
        return a / b;
    }
}

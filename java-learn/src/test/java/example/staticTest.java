package example;

/**
 * Created by Shen on 2017/4/30.
 * 静态变量的使用static
 */
public class staticTest {
    public static String USER_NAME = "shenwd";


    public static void main(String[] args) {
        System.out.println(staticTest.USER_NAME);
        staticTest.USER_NAME = "supermagic";
        System.out.println(staticTest.USER_NAME);

    }



}

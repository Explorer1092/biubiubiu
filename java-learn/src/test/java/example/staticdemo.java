package example;

/**
 * Created by Shen on 2017/4/16.
 */
public class staticdemo {
    public static final String USER_NAME = "zhangsan";


    public static void main(String[] args) {
        System.out.println(staticdemo.USER_NAME);
//        staticdemo.USER_NAME = "lisi";
        System.out.println(staticdemo.USER_NAME);
    }
}


package example;

/**
 * Created by Shen on 2017/4/30.
 */
public class DataTypeDemo {
    public Byte b = 10;

    public void test(Byte b) {
        b = 19;


    }

    public Integer changeType(String s) {
        try {
            return Integer.valueOf(s);
        } catch (Exception e) {
            return null;
        }
    }


    public static void main(String[] args) {
        DataTypeDemo d = new DataTypeDemo();
        d.test(d.b);
        System.out.println(d.b);

        System.out.println(d.changeType("s"));
        new Integer(123);
        Integer.parseInt("123");
        Integer.valueOf("123");
        System.out.println(Integer.valueOf("127")==Integer.valueOf("127"));
        System.out.println(Integer.valueOf("128")==Integer.valueOf("128"));
        System.out.println(Integer.parseInt("128")==Integer.valueOf("128"));
//java.lang.Integer.valueOf(String s)方法用法实例教程 - 该方法返回一个Integer对象,持有指定的字符串的值
    }
}

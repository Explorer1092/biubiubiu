package code;

import java.util.Random;



/**
 * Created by shen on 2017/9/17.
 * java基础的类型
 */
public class Helloworld {
    public static void main(String[] args) {
        System.out.println("hello world".length());
//        使用Random类的对象产生随机数
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());
        int te =1231231231;
        System.out.println(te);
        double x =3.75;
//        拆分字符串使用substring
        String greeting="hello,world!";
        String location = greeting.substring(6, 11);
        System.out.println("location:"+location);
//       使用equals比较两个字符串是否相等
        System.out.println(location.equals("world"));
//        计算出来的结果存放另一个内存中，如果使用==比较会返回false
        System.out.println(location =="world");
//        比较字符串好的方式将字符串放在前面
        System.out.println("world".equals(location));
//        不考虑大小写比较两个字符串，可以使用equalsIgnoreCase方法
        System.out.println("WORLD".equalsIgnoreCase(location));

//        使用split提取字符串中子字符串
        String name = "dong,song,wen,java";
        for (String resuilt : name.split(",")) {
            System.out.println(resuilt+",");
        }
//        控制台输入内容使用Scanner
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入内容s：");
//        int  s =input.nextInt();
//        System.out.println("s:"+s);
        //    提取空格中的字符串
        String testsplit = "shen wan dong";
        for (String names : testsplit.split("\\s")) {
            System.out.println("names:"+names);
        }
//        数字与字符串转换,使用静态方法Integer.toSting
        int a =42;
        String str = Integer.toString(a);
//        可以指定基数，范围为2-36
        str = Integer.toString(a, 2);
        System.out.println(str);

//        将整数转换为字符串的更简单的方法是空字符串连接""+str
        String q = "" + str;
//        包含整数的字符串转换为数字，使用Integer.parseInt
        String l = "1234";
        int m = Integer.parseInt(l);
        System.out.println(m);
//        对于浮点数，使用Double.toString和Double.parseDouble方法
        String strs = Double.toString(3.1415);
        double n = Double.parseDouble("3.1415");
        System.out.println("strs:"+strs+"n:"+n);



    }



}

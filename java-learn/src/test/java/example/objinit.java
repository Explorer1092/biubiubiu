package example;

import java.util.Date;

public class objinit {
    public static void main(String args[]) {
        String str = "";
        for (int i = 0; i < 100; i++) {
//            valueOf的使用
            str += String.valueOf(i);
            System.out.println("str is:" + str);

        }
        StringBuilder sb = new StringBuilder();
//        append的使用，添加到后面
        for (int i = 0; i < 100; i++) {
            sb.append(i);
            System.out.println(sb);
        }
        double[] mylist = {1.2, 2.1, 3.4, 4.5};
        for (int i = 0; i < mylist.length; i++) {
            System.out.println(mylist[i] + "");
        }
        double total = 0;
        String  a= "abcde";
//        for循环的使用
        for (int i = 0; i < mylist.length; i++) {
            total += mylist[i];
            System.out.println("mylist is:"+ mylist.length);


        }
        System.out.println("Total is " + total);
//        取一个字符串中的一个数值
        System.out.println("a长度是："+a.substring(0,2));
        Date date = new Date();
//       输出日期
        System.out.println(date.toString());
    }
}


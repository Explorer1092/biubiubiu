package example;

import java.util.Scanner;

public class WorkDay {


    private   static void Timo(int day) {
        switch (day) {
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
                break;
            case 3:
                System.out.println("今天星期三");
                break;
            case 4:
                System.out.println("今天星期四");
                break;
            case 5:
                System.out.println("今天星期五");
                break;
            default:
                System.out.println("这是什么鬼！");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("今天星期几？");
        int day = s.nextInt();
        String weekday = day <= 5 ? (day < 0 ? "输入错误" : "工作日") : (day > 7 ? "输入错误" : "周末");
        System.out.println(weekday);
        String a = s.nextLine();
        System.out.println("读取的字符串是：" + a);
        int b = s.nextInt();
        System.out.println("读取的整数是："+b);
        float c = s.nextFloat();
        System.out.println("读取的浮点数是："+c);

        Timo(day);



    }
}

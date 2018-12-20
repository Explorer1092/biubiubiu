package code;
import java.io.Console;
import java.util.Scanner;

/**
 * Created by shen on 2017/9/17.
 * 读取输入的方式和读取密码的方式
 */
public class InputTest {
    public void  InputTest() {
//        调用Scanner方法
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
//        nextLine方法从输入读取一行,使用hasNextLine检查是否有另外一行
        if (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            System.out.println("My name is:" + name);
        } else {
            System.out.println("type error");
        }
        /*读取整数用nextInt方法，校验是否有另外一个整数hasNextInt*/
        System.out.println("How old are you?");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            System.out.println("我的年龄是:" + age);
        } else {
            System.out.println("type error");
        }
//        hasNext检查是否有另外一个单词
        System.out.println("你喜欢什么语言？");
        if (scanner.hasNext()) {
            String tag = scanner.next();
            System.out.println("我喜欢的语言是:" + tag);
        } else {
            System.out.println("type error");
        }
//        HasNextDouble检查是否浮点数
        System.out.println("圆周率是多少");
        if (scanner.hasNextDouble()) {
            double pr = scanner.nextDouble();
            System.out.println("圆周率是：" + pr);
        }else {
            System.out.println("type error");
        }
    }


    public static void main(String[] args) {
        InputTest inputTest = new InputTest();
        inputTest.InputTest();

    }
}

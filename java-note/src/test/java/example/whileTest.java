package example; /**
 * Created by Shen on 2017/4/23.
 */

import java.lang.Math;
public class whileTest {
    public static void main(String[] args) {
//        int a[]; //声明一个引用
//        a = new int[5]; //创建一个长度为5的数组，并且使用引用a指向该数组
//        int b[] = new int[5];//声明的同时，指向一个数组
////        访问数组
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;
////        数组长度使用a.length
//        System.out.println(a.length);
//
//        int[] x = new int[5];
//        x[0] = (int) (Math.random() * 100);
//        x[1] = (int) (Math.random() * 100);
//        x[2] = (int) (Math.random() * 100);
//        x[3] = (int) (Math.random() * 100);
//        x[4] = (int) (Math.random() * 100);
//        System.out.println("数组中各个随机数是：");
//        for (int n=0;n<x.length;n++) {
//            System.out.println(x[n] + " ");
//        }
//        int min = 1000;
//        for (int n=0;n<a.length;n++) {
//            if (x[n] < min) {
//                min = x[n];
//            }
//        }
//        System.out.println("最小数组是：" + min);

//        数组反转
        int[] t = new int[4];
        t[0] = (int) (Math.random() * 100);
        t[1] = (int) (Math.random() * 100);
        t[2] = (int) (Math.random() * 100);
        t[3] = (int) (Math.random() * 100);
        System.out.println("数组中各个值是：");
        for (int i=0;i<t.length;i++) {
            System.out.println(t[i]+" ");
        }
        for (int i=0;i<t.length/2;i++) {
            int meddle = t[t.length - i - 1];
            t[t.length - i - 1] = t[i];
            t[i] = meddle;
        }
        System.out.println("再次反转后的数组是：");
        for(int i=0;i<t.length;i++) {
            System.out.println(t[i] + " ");
        }
    }
}

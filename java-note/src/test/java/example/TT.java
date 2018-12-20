package example;

import java.util.ArrayList;

class TT {
//    private 表示私有的只能在该类中使用
//    static 表示类变量，值可以改变
//    final 表示终态
    private static final String strStaticFinalVar = "aaa";
    private static String strStaticVar = null;
    private final String strFinalVar = null;
    private static final int intStaticFinalVar = 0;
    private static final Integer integerStaticFinalVar = new Integer(8);
    private static final ArrayList<String> alStaticFinalVar = new ArrayList<String>();

    private void test() {
        System.out.println("-------------值处理前----------");
        System.out.println("strStaticFinalVar=" + strStaticFinalVar + "");
        System.out.println("strStaticVar=" + strStaticVar + "");
        System.out.println("strFinalVar=" + strFinalVar + "");
        System.out.println("intStaticFinalVar=" + intStaticFinalVar + "");
        System.out.println("integerStaticFinalVar=" + integerStaticFinalVar + "");
        System.out.println("alStaticFinalVar=" + alStaticFinalVar + "");


        //strStaticFinalVar="哈哈哈哈";//错误，final表示终态,不可以改变变量本身.
        strStaticVar = "哈哈哈哈";         //正确，static表示类变量,值可以改变.
        //strFinalVar="呵呵呵呵";            //错误, final表示终态，在定义的时候就要初值（哪怕给个null），一旦给定后就不可再更改。
        //intStaticFinalVar=2;                 //错误, final表示终态，在定义的时候就要初值（哪怕给个null），一旦给定后就不可再更改。
        //integerStaticFinalVar=new Integer(8);                //错误, final表示终态，在定义的时候就要初值（哪怕给个null），一旦给定后就不可再更改。
        alStaticFinalVar.add("aaa");     //正确，容器变量本身没有变化，但存放内容发生了变化。这个规则是非常常用的，有很多用途。
        alStaticFinalVar.add("bbb");     //正确，容器变量本身没有变化，但存放内容发生了变化。这个规则是非常常用的，有很多用途。

        System.out.println("-------------值处理后----------");
        System.out.println("strStaticFinalVar=" + strStaticFinalVar + "");
        System.out.println("strStaticVar=" + strStaticVar + "");
        System.out.println("strFinalVar=" + strFinalVar + "");
        System.out.println("intStaticFinalVar=" + intStaticFinalVar + "");
        System.out.println("integerStaticFinalVar=" + integerStaticFinalVar + "");
        System.out.println("alStaticFinalVar=" + alStaticFinalVar + "");
    }

    public static void main(String args[]) {
        new TT().test();
    }
}
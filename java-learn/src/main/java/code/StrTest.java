package code;

/**
 * Created by shen on 2017/9/17.
 * Java string 常用方法
 */
public class StrTest {

    private void TestStr() {
//        检查字符串是否以某个字符串开始
        String str = "welcome to beijing";
        System.out.println(str.startsWith("w", 0)); // true
//         检查字符串是否以某个字符串结束
        System.out.println(str.endsWith("n"));  // false
//       检查字符串是否包含该字符串
        System.out.println(str.contains("welcome"));  // true
//      获取str第一次出现的位置
        System.out.println(str.indexOf("w")); // 0
//        获取str最后一次出的位置
        System.out.println(str.lastIndexOf("e")); // 12
//        搜索整个字符串从fromindex开始
        System.out.println(str.indexOf("b",1)); // 11
//        搜索整个字符串从lastindex开始
        System.out.println(str.lastIndexOf("e",10)); // 6

//        返回一个字符串，该字符串是通过将原字符串中所有字符串替换为newstring
        System.out.println(str.replace("beijing","china")); // welcome to china
//        返回一个将原来字符串的所有字符转变为大写
        System.out.println(str.toUpperCase());
//        返回一个将原来字符串的所有字符转变为小写
        System.out.println(str.toLowerCase());
//        返回一个删除了前后空格的字符串
        System.out.println(str.trim());
        System.out.println("StrTest.TestStr");

    }


    public static void main(String[] args) {
        StrTest strTest = new StrTest();
        strTest.TestStr();
    }
}

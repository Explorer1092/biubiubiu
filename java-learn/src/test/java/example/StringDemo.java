package example;

/**
 * Created by Shen on 2017/4/30.
 */
public class StringDemo {
    private String demoString = "shenwandong";

    public void testString() {
        String dsg = demoString.concat(" "+"vear good"); //字符串相加，也可用+来表示
        System.out.println(dsg);

        int len = demoString.length(); //字符串的长度
        System.out.println(len);


        boolean eq = "shenwandong".equals(demoString);//比较两个字符创是否相等
        System.out.println(eq);

        String sub = demoString.substring(5, 8);//取字符串，从第5个字符开始，到第8个字符，但不包含第8个字符
        System.out.println(sub);
        String subString = demoString.substring(4);//取字符串，从第5个字符开始一直到字符串尾
        System.out.println(subString);

        boolean sw = demoString.startsWith("shen");//判断是否以某个字符串开头
        System.out.println(sw);

        boolean ew = demoString.endsWith("dong"); //判断是否以某个字符串结尾
        System.out.println(ew);

        int subIndex = demoString.indexOf("n");//找出子字符串在字符串中第一次出现的index，如果找不到则返回-1
        System.out.println(subIndex);

        int lastIndex = demoString.lastIndexOf("e");//找出子字符串在字符串中最后一次出现的index，如果找不到则返回-1
        System.out.println(lastIndex);

        System.out.println(demoString.toUpperCase()); //字符串的字母全部大写
        System.out.println(demoString.toLowerCase()); //字符串的字母全部小写
        System.out.println(demoString.trim()); //将字符串的首尾空格去掉

        String subReplace = demoString.replace("shen", " MR");
        System.out.println(subReplace);//将字符串的某段子字符串换成新的子字符串

        String subReplaceF = demoString.replaceFirst("e", " ");//将字符串中的某段第一次出现的子字符串替换成新的子字符串，支持正则
        System.out.println(subReplaceF);

        String subRepalceA = demoString.replaceAll("n", "6");//将字符串中的所有出现的子字符串替换成新的子字符串，支持正则
        System.out.println(subRepalceA);

    }

    public static void main(String[] args) {
        StringDemo s = new StringDemo();
        s.testString();
    }

}

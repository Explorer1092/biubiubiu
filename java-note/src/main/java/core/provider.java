import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shenwandong
 * @date 2018-12-06 20:50
 */
public class provider {
    public void CountTime() {
        long startTime = System.currentTimeMillis();
        String[] str = new String[1]; //创建数组类型
        str[0] = "hello";
        String[] pre = {"hello world", "xiaoming", "wangwu", "zhaosi", "liwen"};
        System.out.println("str:"+ Arrays.toString(str));
        System.out.println(Arrays.equals(pre, pre));


        Map ms = new HashMap();
        ms.put("name", "zhangsan");
        ms.put("age", 20);
        ms.put("work", "IT");
        System.out.println("\n"+ms);
        System.out.println(ms.getClass().getTypeName());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }

    public static void main(String[] args) {
        provider p = new provider();
        p.CountTime();
    }

}

package util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author shenwandong
 * @date 2018/9/19 15:41
 */
public class CheckArray {


    

    //    检查数组中是否包含字符串
    private static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }



    public static void main(String[] args) {

        String arr[] = new String[]{"a", "b", "c", "d"};
        System.out.println(useList(arr, "e"));

        Set<String> set = new HashSet<>();
        String s1 = "hello world";
        String s3 = "word";
        set.add(s1);
        set.add(s3);
        System.out.println(set.contains("word"));



    }
}

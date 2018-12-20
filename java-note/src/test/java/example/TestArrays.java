package example;

/**
 * Created by shenwd on 2017/2/6.
 */
public class TestArrays {
    public static void main(String[] args) {
        //整形列表
        int[] index = new int[4];
        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;
        //字符串列表
        String[] islands = new String[4];
        islands[0] = "bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        //列表可以是各种类型的，也可以是一个对象
        Object[] isObject = new Object[4];
        isObject[0] = "zhangsan";
        isObject[1] = "lisi";
        isObject[2] = "wangwu";
        isObject[3] = "zhaoliu";
        int y = 0;
        int ref;
        int t1;
        while (y < 4) {
            ref = index[y];
//            System.out.print(islands[y]);
            System.out.print(islands[y]+":");
            System.out.println(islands[ref]);
            System.out.println(isObject[y]);
            y = y + 1;

        }

    }
}

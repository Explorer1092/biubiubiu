package example;

import java.util.*;

public class testlist {
    public static void main(String[] args) {
        Map map = new HashMap();
//        成对放入多个key-value对
        map.put("勒布朗詹姆斯", 6);
        map.put("凯文杜兰特",35);
        map.put("斯蒂芬库里", 30);
//        多次放入的key-value对中value可以重复
        map.put("威斯布鲁克", 0);
//        放入重复的key时，新的value会覆盖原来的value
//        如果新的value覆盖了原有的value，该方法返回被覆盖的value
        System.out.println(map.put("勒布朗詹姆斯",23)); //输出6
        System.out.println(map.put("勒布朗詹姆斯",30));//输出23
        System.out.println(map);
//        判断是否包含指定key
        System.out.println("是否包含值为 勒布朗詹姆斯 key:"
        +map.containsKey("勒布朗詹姆斯")); // 输出true
//        判断是否包含制定value
        System.out.println("是否包含值为 0 value:"
        +map.containsValue(0));
//        获取Map集合的所有key组成集合，通过遍历key来实现遍历所有key-value对
        for (Object key : map.keySet()) {
            // map.get(key)方法获取指定key对应的value
            System.out.println(key+"-->"+map.get(key));

        }
        map.remove("凯文杜兰特"); //根据key删除key-value对
        System.out.println(map.toString()); //输出结果不再包含 疯狂凯文杜兰特=35 的key-value对

//        数组的声明与增删该查
        int[] a = {2, 4, 6};
        for (int i=0;i<a.length;i++) {
            int t = a[i];
            System.out.println(a[i]);
            a[i] = t + 1;
            System.out.println(a[i]);

        }
//        多维数组
//        int[][] c = {{1, 2}, {5, 6}, {9, 10}};
        int[][] b = new int[3][];
        for (int i=0;i<b.length;i++) {
            int[] c = new int[4];
            b[i] = c;

        }
        System.out.println("b是："+ b[1][3]);

    }
}
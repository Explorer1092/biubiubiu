package example;

import java.util.*;

/**
 * Created by Shen on 2017/4/30.
 */
public class MapDemo {
//    Map基本操作
    public void mapAction() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "this is a");//往map里添加一对键值对
        map.put("b", "this is b");
        int len = map.size();//一共有多少对键值对
        System.out.println(len);
        String a = map.get("a");//获取key为a的值
        System.out.println(a);//输出this is a
        System.out.println(map.get("c"));//获取一个不存在的key值时，返回值为null，并不会抛出异常
        map.put("a", "this is the second a");//添加一个已存在的key，后面添加的value会覆盖前面已存在的value
        System.out.println(map.get("a"));

        boolean c = map.containsKey("a");//判断map中是否存在key a
        System.out.println("map中是否包含key为a：" + c);
        boolean v = map.containsValue("this is the second a");//判断map中是否存在给定的value
        System.out.println("map中是否包含value：" + v); //输出TRUE

        Map<String, String> m1 = new HashMap<String, String>();
        m1.put("a", "this is the third a");
        m1.put("d", "this is d");
        map.putAll(m1);//取map与m1的并集，如果m1中有已经在map中存在的key，则m1中的value会覆盖map中的存在的key的value，并集的值会赋值给map
        System.out.println(map);
    }

    //    Map循环
    public void loopMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "this is a");
        map.put("b", "this is b");
        /**
         * set可理解成为一种特殊的List，只是里面的元素对象是不允许重复的，keyset是将key都放到一个集合里面去
         * HashMap是无序排列的，keyset后，set对象也是无序的
         */
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println("循环输出map的value值：" + map.get(s));//循环输出map的value值
        }
        Collection<String> v = map.values();//将map的所有 value值转换为一个集合类
        for (String s : v) {
            System.out.println(s);//循环输出map的value值
        }
    }


    // Map键值对删除
    public void mapRemove() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "this is a ");
        map.put("b", "this is b");
        map.remove("a");//根据key来删除map里的键值对
        System.out.println("删除后的map值为：" + map);
    }

    // Map循环删除
    public void loopRemoveMap() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "this is a");
        map.put(2, "this is b");
        /**
         * set虽然可以看作一个特殊的list，但是set没有像list一个通过get取值的方式
         * 要想取值，可以将set转为list，或者转为iterator
         */
        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<Integer>(set); //set转换为list
        for (int i=0;i<list.size();i++) {
            map.remove(list.get(i));
        }
        System.out.println("循环删除后的list是：" + map);
    }

    // Map清空键值对
    public void clearMap() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "this is a");
        map.put(1, "this is b");
        boolean e = map.isEmpty();//判断map力是否存在键值对
        System.out.println(e);
        map.clear();//清除map里所有的键值对
        e = map.isEmpty();
        System.out.println(e); //输出TRUE

    }

    // Map按键(key)排序
    // 简单排序:
    public void sortMapKey() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(13, "this is b ");
        map.put(12, "this is c");
        map.put(11, "this is a");
        map.put(1, "this is 10");
        System.out.println(map);
        /**
         * TreeMap是一个按key进行升序排列的一个Map实现类
         * TreeMap会自动的把里面的键值对进行排序
         * 利用这一点，将HashMap转换为TreeMap，即可实现Map按key进行排序
         */
        Map<Integer, String> tm = new TreeMap<Integer, String>();
        tm.putAll(map);
        map = tm;
        System.out.println(map);
    }

    // 复杂排序
    public void sortMapByKey() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "this is a");
        map.put("c", "this is c");
        map.put("b", "this is b");
        System.out.println(map);
        /**
         * LinkedHashMap是会记录你put进去的顺序，输出时，会按你put进去的顺序进行输出
         * 利用这一点，将HashMap的key按要求排列好，然后在put进一个LinkedHashMap既能实现map的复杂排序
         */
        Map<String, String> lm = new LinkedHashMap<String, String>();
        List<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list, new Comparator<String>() {

            public int compare(String o1, String o2) {
                return o2.compareTo(o1);//list降序排列
            }
        });
        System.out.println(list);
        for (String key : list) {
            lm.put(key, map.get(key));
        }
        System.out.println(lm);
    }

    public static void main(String[] args) {MapDemo m = new MapDemo();
        m.mapAction();
        m.loopMap();
        m.mapRemove();
        m.loopRemoveMap();
        m.clearMap();
        m.sortMapKey();
        m.sortMapByKey();
    }
}



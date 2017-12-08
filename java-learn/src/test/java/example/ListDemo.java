package example;

import java.util.*;

/**
 * Created by Shen on 2017/4/30.
 * List基本使用，Collection接口，他是在集合层次结构的顶层，List接口扩展了集合，并声明存储元素的序列集合的行为
 * 也就是List接口里定义了一堆方法，让实现类去实现，List的长度是不固定的，可以任意添加，删除。且ArrayList里面的元素值是可以重复的
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); //这里面只能接复合数据类型，List<int>就会报编译错误
        list.add("abc");//增加一个元素
        int len = list.size();//获取list的大小，即元素个数
        System.out.println(len); //输出为1

        String s = list.get(0);//获取List中的第一个值，是从0开始的，如果List长度为1而get(1)时，就会越界异常
        System.out.println(s); //输出abc

        list.set(0, "shen");//替换index为0的元素值
        System.out.println(list);

        boolean c = list.contains("s"); //判断List中是否包含元素s
        System.out.println(c);

        List<String> ll = new ArrayList<String>();
        ll.add("c");
        list.addAll(ll);//向list里面添加一个ll，可以理解为两个数组取并集，并将并集的值赋给list
        System.out.println(list); //输出shen，c

        list.retainAll(ll);//取两个数组的交集，并将交集的值赋给list
        System.out.println(list);//输出c
        list.add("e");
        list.add("f");
        System.out.println(list);
        List<String> d = list.subList(0, 2);//从list中去一个子list，示例中是从0开始，到index2，但不包含2
        System.out.println(d);
        ListDemo listTest = new ListDemo();
        listTest.loopList();
        listTest.listRemove();
        listTest.loopRemoveList();
        listTest.iteratorRemoveList();
        listTest.arrayToArrayList();
        listTest.clearList();
        listTest.sortList();
        listTest.sortsList();
    }

//    list循环
    public void loopList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("循环的值为："+list.get(i));
        }
        for (Integer i : list) {
            System.out.println("循环的值为："+i);
        }
    }

//    list删除
    public void listRemove() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        /**
         * remove有两种形式，一种是按index删除，一种是按list中的值删除。
         * 按index删除时，入参是int类型，按值删除时，入参时复合数据类型
         */
        Integer e = 1; //事先定义好要删除的值对象
        /**
         * api说明中强调了，在remove(Object o)时，时删除第一个出现的这个值
         */
        list.remove(e);
        System.out.println("删除后为："+list);

        //方法2
        int index = 0;//定义要删除的index，也可以不事先定义，直接remove(1)。这个1会被默认为是int类型
        list.remove(index);
        System.out.println("删除后的值为："+list);


        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(list);
        List<Integer> p = new ArrayList<Integer>();
        p.add(2);
        /**
         * remove时单个remove，如果我想把list中的元素2全部一次性remove掉，就要用removeall
         * removeall会把list中包含了ll元素的元素全部删除
         * 也可以理解为是取list与p的差集，并将差集的值赋给list
         */
        list.removeAll(p);
        System.out.println("最后结果为："+list);
    }

//    循环删除
    public void loopRemoveList() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("a");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("a")) {
                list.remove(list.get(i));
            }
        }
        System.out.println("循环删除后：" + list);
        /**
         * loopRemoveList方法中，在循环删除时，最后发现其返回值中仍然有a，并没有删除完全，这里因为在循环中用了list.size()来做为循环退出判断条件
         * 在remove掉元素后，其list.size()的值就会发生变化，导致了数组没有循环完全就退出了，正确的循环删除应该引入iterator；
         */
    }

//    使用迭代器Iterator删除
    public void iteratorRemoveList() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("a");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("a")) {
                it.remove();
            }
        }
        System.out.println("输出结果：" + list);
    }

    public void arrayToArrayList() {
        Integer[] i = new Integer[]{1, 2, 3};
        List<Integer> t = Arrays.asList(i);
        List<Integer> list = new ArrayList<>(t);//将数组转换为ArrayList的正确方式
        System.out.println(list);
    }

//    public void clearList() {
//        List<String> list = null;
//        boolean e = list.isEmpty();
//        System.out.println(e);

    /**
     * 以上的代码，list等于null。需要注意的是，当list等于null时，调用任何方法，都会报空指针异常。
     */
//    }
//    清除list
    public void clearList() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        boolean e = list.isEmpty(); //判断list里面是否存在元素
        System.out.println(e); //返回FALSE
        list.clear();//清除list中的所有元素
        boolean m = list.isEmpty();
        System.out.println(m);//输出TRUE
    }

    //    list排序
    public void sortList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);
        Collections.sort(list); //集合排序，升序排序
        System.out.println(list); //输出1，2，3，4，5
    }

    /**
     * List<List<Integer>> list = new ArrayList<List<Integer>>();
     * 复杂排序，对于上面这种复杂数据类型的list，如果用Collections.sort(list)；会报编译错误。假如我们想根据List里面的List的第一个值的大小来排序。
     */
    public void sortsList() {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(3);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(2);
        list.add(l1);
        list.add(l2);
        list.add(l3);
        Collections.sort(list, new Comparator<List<Integer>>(){
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(0) > o2.get(0)) { //按List<Integer>的第一个值进行排序
                    return -1;
                } else if (o1.get(0) < o2.get(0)) {
                    return 1;
                }
                return 0;
            }

        });
        System.out.println(list);

    }

}

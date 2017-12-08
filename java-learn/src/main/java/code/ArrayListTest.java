package code;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shen on 2017/9/18.
 * 数组和数组列表的使用，(Arrays)数组的长度不能改变，(ArrayList)数组列表的长度可以改变
 * 数组和数组列表有时有区别的！！！
 */
public class ArrayListTest<S> {
    public void ArrayTest() {
//        创建一个数组(String[] str,int[] primes)
        int[] primes = {2, 3, 5, 7, 11, 13};
//        获取数组的长度
        System.out.println(primes.length);
//        遍历获取数组中的数组
        for (int i=0;i<primes.length;i++) {
            System.out.println(primes[i]);
        }
//        int转换成String
        String arrstr = Arrays.toString(primes);
        System.out.println(arrstr);

//       从Array中创建ArrayList
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arrstr));
        System.out.println(arrayList);
//        判断数组中是否包含13
        String a="13";
        if (Arrays.asList(arrstr).contains(a)) {
            System.out.println("13在这个数组里");
        }



//        数组复制
        int[] numbers = primes;
        numbers[5] = 42; //现在数组primes中的primes[5]也是42，两个变量引用同一个数组
//        如果不想共享爱那个数组，则需要复制数组，使用静态方法Arrays.copOf
        System.out.println("numbers"+numbers);
        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);
        System.out.println("copiedPrimes:"+copiedPrimes);





//        创建一个整型的数组列表
        ArrayList<Integer> num = new ArrayList<>();
//        添加数组列表add
        num.add(111);
        num.add(12);
//        get返回integer的对象
        int first = num.get(1);
        System.out.println(first);
        System.out.println(num);

        ArrayList<String> str = new ArrayList<>();
        str.add("hello");
        str.add("world");
//        如果取第2位就会报错
        String len = str.get(1);
        System.out.println(len);
        System.out.println(str);

        ArrayList<Character> ch = new ArrayList<>();
        ch.add((char) 100001);
        ch.add((char) 101011);
        System.out.println(ch);

//      增强循环,变量n被赋值为num[0],num[1]
        int sum = 0;
        for (int n : num) {
            sum += n;
            System.out.println(sum);  //输出111，123
        }
//    使用增强循环遍历字符串列表
        for (String name : str) {
            System.out.println(name.toUpperCase());
        }

//        数组列表使用的同样的方式
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Peter");
        friends.add("paul");
        friends.add("jack");
//        设置元素set
        friends.set(1, "lisa");
        System.out.println(friends);
        ArrayList<String> people = friends;
        people.set(0, "Mary");
        System.out.println(people);
//       要复制数组列表可以从已存在的数组列表构造一个新的数组列表
        ArrayList<String> copledFriends = new ArrayList<>(friends);
        System.out.println(copledFriends);

//        Array.asList方法可以使用一个数组或者任意数量的参数，使用任意数量参数这种形式时，你可以将它作数组初始化语法的一种替代
        ArrayList<String> friend = new ArrayList<>(Arrays.asList("lin", "shu", "cool"));
        System.out.println(friend);


//       也可以将数组列表复制在数组中
        String[] names = friend.toArray(new String[0]);
        System.out.println(Arrays.toString(names));

        String[] Anima = people.toArray(new String[0]);
        System.out.println(Arrays.toString(Anima));

     }


    public void Stop() {
        int a = 10;
        String[] mau = new String[5];
//        数组转换为数组列表
        ArrayList<String> arrlist = new ArrayList<String>(Arrays.asList(mau));
        System.out.println("arrlist:"+arrlist);
//        数组列表中添加元素
        arrlist.add(1, "hello");
        arrlist.add("lisa");
        arrlist.add("lulu");
//        数组列表中移除元素
        arrlist.remove(0);
        arrlist.remove(2);
        arrlist.remove(3);
        arrlist.add("hello world");
//        打印数组列表中索引为2的元素
        System.out.println(arrlist.size());



    }



    public static void main(String[] args) {
        ArrayListTest list = new ArrayListTest();
        list.ArrayTest();
        list.Stop();
    }
}

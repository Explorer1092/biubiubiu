package example;

/**
 * Created by Shen on 2017/3/9.
 */
public class HelloWorld {
    public static void main(String[] args) {
//       高精度向低精度转换
        byte b = 5;
        int i = 10;
        int s = 300;

        b = (byte) i;
//        因为i的值是在byte范围之内，所以即便进行强制转换，最后得到的值，也是10
        System.out.println(b);


//        因为s的值是在byte范围之外，所以就会按照byte的长度进行截取，s的值是300，其对应的二进制数是100101100
//        按照byte的长度8位进行截取，其值为00101100 即44
        b = (byte) s;
        System.out.println(b);

//        查看一个整数对应的二进制方法
        System.out.println(Integer.toBinaryString(s));

        int t = 1;
        boolean b1 = !(i++ == 3) ^ (i++ == 2) && (i++ == 3);
        System.out.println(b1);
        System.out.println(t);

        boolean a = true;
        boolean k = false;
        System.out.println(a ^ k); // 不同返回真
        System.out.println(a ^ !k);//相同返回假

    }

    public void method1() {
        final int z ; // 被修饰的变量只能赋值一次，再次赋值就会出错
        z = 10;
//        z = 100; 再次赋值就会报错
    }

    public void method2(final int j) {
        // j = 6; 这个是错误的，因为在调用方法的时候，就一定会第一次赋值了，后面不能在进行多次赋值
    }

}

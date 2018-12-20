package code;

import java.text.SimpleDateFormat;
import java.util.Date;

class HuoZhe {

    private static void transForMillSecond(long times) {
        System.out.println("Unix时间戳是:" + times + " 毫秒方式");
        long d = times / 1000;
        System.out.println("Unix时间戳是:" + d + " 按秒计算");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(times))));
        System.out.println("毫秒转换的时间为：" + sd);
        String ps = sdf.format(new Date(Long.parseLong(String.valueOf(d))));
        System.out.println("秒转换的时间为：" + ps);
    }


    private void booger() {

        String jsonString = String.format("{\"name\":\"zhansan\",\n\"age\":20}");
        System.out.println("Json:" + jsonString.toUpperCase());
        String str = "select * from user_info where user_name=\"zhangsan\"";
        System.out.println(str.indexOf("1"));
    }

    public static void main(String[] args) {
        System.out.println("hello world!");
        long test = 1528181732000L;
        transForMillSecond(test);
        HuoZhe huoZhe = new HuoZhe();
        huoZhe.booger();
    }

}
package example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;

/**
 * Created by shenwd on 2017/1/3.
 */
public class urltest {

    public static void t2(String link) throws IOException {

        Logger logger = null;
//        String tt = null;
        try {
        URL url = new URL(link);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        int state = conn.getResponseCode();

        System.out.println(state);
            if (state ==  200) {
                System.out.println("状态码"+state+"ok");
            }
//            if (state == 404) {
//                System.out.println("状态码：" + state + "failed");
//            }
            else {

                System.out.print("链接失败！");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public static void main(String[] args) throws IOException {
        urltest.t2("http://aaa.baidu.com");
    }




}



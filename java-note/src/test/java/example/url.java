package example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * /**
 * public int getResponseCode()throws IOException
 * 从 HTTP 响应消息获取状态码。
 * 例如，就以下状态行来说：
 * HTTP/1.0 200 OK
 * HTTP/1.0 401 Unauthorized
 * 将分别返回 200 和 401。
 * 如果无法从响应中识别任何代码（即响应不是有效的 HTTP），则返回 -1。
 *
 * 返回 HTTP 状态码或 -1
 *
 * Created by shenwd on 2017/1/4.
 */

public class url {

    public static void main(String [] args){
        try{
            URL url = null;
            try {
                String ur = "www.baidu.com";
                url = new URL(ur);
            } catch (MalformedURLException e1) {
                e1.printStackTrace();
            }
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            int state = conn.getResponseCode();
            System.out.println(state);
            if(state == 200){
                System.out.print("true");
            }
            else{
                System.out.print("false");
            }
        }
        catch(IOException e){
            System.out.print("false");
        }



    }




}






package util;

/**
 * Created by LP-569 on 2017/2/20.
 */
public class StringUtils {


    public static String getUrlByEnv(String url,String env,String api){
        String result;

        if("online".equals(env)){
            result = "http://" + url+ api;
        }else if("pre".equals(env)){
            result = "http://"+env+"-" + url+ api;
        }else {
            result = "http://" + env.substring(1,env.length()) + "-" + url + api;
        }

        return result;
    }



    public static void main(String[] args) {
        //填写参数地址
        String str = StringUtils.getUrlByEnv("parent-rest.com.cn","pre","/test");
        System.out.println(str);
    }
}

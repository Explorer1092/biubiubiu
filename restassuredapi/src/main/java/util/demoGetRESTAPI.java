package util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class demoGetRESTAPI {

    public String demoGetRESTAPI(String url) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            HttpGet getRequest = new HttpGet(url);

            getRequest.addHeader("Authorization", "Bearer uBkIk9A0N08MqaJSiUixR88VzFLXje");

            HttpResponse response = httpClient.execute(getRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new RuntimeException("Failed with HTTP error code:" + statusCode);
            }
            //Now pull back the response object
            HttpEntity httpEntity = response.getEntity();
            String apiOutput = EntityUtils.toString(httpEntity);

//            System.out.println(apiOutput);
            return apiOutput;
        }
        finally{
            httpClient.getConnectionManager().shutdown();
        }
    }


    public void  Jsonstr() throws Exception {
        demoGetRESTAPI test = new demoGetRESTAPI();
//        调用demoGetRESTAPI，取出apiOutput结果
        String text = test.demoGetRESTAPI("http://gateway.api.com/order/api/v1/745/orders?p=1");
        System.out.println(text);
        ReportUtil.log(text);


    }

    public static void main(String[] args) throws Exception {
        demoGetRESTAPI test = new demoGetRESTAPI();
        test.Jsonstr();
//        test.demoGetRESTAPI("http://gateway.api.com/order/api/v1/745/orders?p=1");


    }
}


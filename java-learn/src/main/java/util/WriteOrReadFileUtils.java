package util;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

public class WriteOrReadFileUtils {
    //读取文件信息

    public static String ReadFile(String file) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while ((s = br.readLine()) != null) { //使用readLine方法，一次读一行
                result.append(System.lineSeparator() + s);

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    //写文件

    /**
     *
     * @param file
     * @param jsonObject
     * @throws IOException
     */
    public static void WriteFile(File file, JSONObject jsonObject) throws IOException {
        FileOutputStream fos = null;
        String str = jsonObject.toString();
        fos = new FileOutputStream(file);
        if (!file.exists()) {
            file.createNewFile();
        }
        byte[] contentByte = str.getBytes();
        fos.write(contentByte);
        fos.flush();
        fos.close();

        if (fos != null) {
            fos.close();
        }
    }

    public static void main(String[] args) throws JSONException {
        String filename = "/Users/shen/Desktop/test_demo.py";
        System.out.println(ReadFile(filename));
        JSONObject json = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        json.put("hello", 1);
        json.put("world", 2);
        jsonArray.put(json);
        System.out.println(json);
        System.out.println(jsonArray);

    }



}

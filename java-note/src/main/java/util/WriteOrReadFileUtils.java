package util;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

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
     * @param file       需要传入一个文件类型的参数
     * @param jsonObject 传入的参数类型String
     * @throws IOException
     */
    public static void WriteFile(File file, String jsonObject) throws IOException {
        FileOutputStream fos = null;
        fos = new FileOutputStream(file);
        if (!file.exists()) file.createNewFile();
        byte[] contentByte = jsonObject.getBytes();
        fos.write(contentByte);
        fos.flush();
        fos.close();
    }

    public static void main(String[] args) throws JSONException, IOException {
        File file = new File("/Users/shen/Desktop/roomIds.txt");
        String filename = "/Users/shen/Desktop/408054180.json";
        System.out.println(ReadFile(filename));
//        要创建json格式的数据，首先要创建一个整体的json的对象，作为一个容器
        JSONObject json = new JSONObject();
//        构建json(key,value)
        json.put("name", "Lisa");
        json.put("sex", "male");
        json.put("age", 22);
        json.put("is_student", true);
        json.put("hobbies", new String[]{"hiking", "swimming"});
        System.out.println(json.toString());

//        创建JSONArray格式数据类型
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(json);
        System.out.println(json);
        System.out.println(json.getClass());
        System.out.println(jsonArray.getClass());
//        写入json到文件里
        WriteFile(file, json.toString());
        System.out.println(file.getAbsoluteFile());
        createJsonByMap();

    }

//    使用HashMap构建
    private static void createJsonByMap() {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "John");
        data.put("sex", "male");
        data.put("age", 22);
        data.put("is_student", false);
        data.put("hobbles",new String[] {"hiking", "swimming"});

        JSONObject obj = new JSONObject(data);
        System.out.println(obj.toString());


    }



}

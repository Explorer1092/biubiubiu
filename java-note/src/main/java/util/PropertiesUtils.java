package util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtils {
    public static Map<String, String> getProperties(String confPath) {
        Map<String, String> map = new HashMap<>();
        Properties properties = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(confPath));
            properties.load(in);
            Enumeration en = properties.propertyNames();
            while (en.hasMoreElements()) {
                String strKey = (String) en.nextElement();
                String strValue = properties.getProperty(strKey);
                map.put(strKey, strValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = PropertiesUtils.getProperties("./conf/baseTest.properties");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey() + "and value=" + entry.getValue());
        }
    }
}

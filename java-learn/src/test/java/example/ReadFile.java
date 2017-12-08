package example;

import java.io.*;

/**
 * Created by Shen on 2017/5/1.
 */
//第一种读文件
public class ReadFile {
    public static void readByte(String fileName) {
        InputStream is = null;
        try {
            // 创建文件对象
            is = new FileInputStream(fileName);
            /**
             * 申请了一段内存空间，然后通过文件对象，把文件内容放到了内存里，这个内存大小是1024个字节，当达到1024字节后
             * 就不在输送字节流到内存了
             */
            byte[] byteBuffer = new byte[1024];
            int read = 0;
            //当把内存里的数据读出来后，就又可以往里面输送字节了
            while ((read = is.read(byteBuffer)) != -1) {
                System.out.write(byteBuffer, 0, read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//第二种buffer读取文件，通过bufferedReader.readLine()来读取缓存区里的一行一行数据
    public static String readBufferFile(String filePath) {
        StringBuffer appInfolistInput = new StringBuffer();
        try {
            String encoding = "UTF8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    appInfolistInput.append(lineTxt.trim());
                    System.out.println(appInfolistInput);
                }
                read.close();
                bufferedReader.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }

        return appInfolistInput.toString();
    }

    public static void main(String[] args) {
        String file = "/home/test";
        readByte(file);
        readBufferFile(file);
    }
}

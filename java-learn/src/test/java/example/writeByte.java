package example;

import java.io.*;

/**
 * Created by Shen on 2017/5/1.
 * 文件写入的两种方式
 */
public class writeByte {
//    流写入
    public void writeByte(String filename) {
        try {
            File file = new File(filename);
            OutputStream os = new FileOutputStream(file);
            String s = "Hello World";
            byte[] byteBuffer = s.getBytes();//从程序中的数据放到内存里，然后通过os.write(byteBuffer,0,byteBuffer.length)把内存数据写入本地文件里
            os.write(byteBuffer, 0, byteBuffer.length);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//buffer写入

    public void writeBuffer(String fileName) {
        try {
            File file = new File(fileName);
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write("Hello Java");
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String file = "/hoem/test";
        writeByte w = new writeByte();
        w.writeByte(file);
        w.writeBuffer(file);
        w.writeByte(file);
    }
}

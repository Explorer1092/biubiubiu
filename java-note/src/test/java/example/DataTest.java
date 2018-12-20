package example;
/**
 * Created by shenwd on 2016/11/30.
 */
import java.io.File;
import java.io.FileInputStream;

public class DataTest {
    public static void main(String[] args) throws Exception {
        /*文件路径*/
        File localFile = new File("apitest");
        FileInputStream ins = new FileInputStream(localFile);
        System.out.println("file:"+ins);
        int countLen = ins.available();
        byte[] m_binArray = new byte[countLen];
        ins.read(m_binArray);
        System.out.println(localFile.getAbsoluteFile() + ""
                + localFile.getFreeSpace());
    }

}

package replay;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author shenwandong
 * @date 2018/6/19 11:26
 */
public class goreplay {
    public static String runshell(int prot) {
        try {

            String shpath = "record.sh";
            Process ps = Runtime.getRuntime().exec(shpath);
            // ps.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String result = sb.toString();
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void main(String[] args) {
        System.out.println(runshell(9090));
    }

}

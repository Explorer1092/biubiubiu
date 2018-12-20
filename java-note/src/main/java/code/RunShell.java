//package code;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//// Java调用shell脚本
//public class RunShell {
//    public static   String runshell(String prot,String log) {
//        try {
//
//            String shpath = "/Users/shen/Desktop/replay/record.sh";
//            Process ps = Runtime.getRuntime().exec(shpath);
//           // ps.waitFor();
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
//            StringBuffer sb = new StringBuffer();
//            String line;
//            while ((line = br.readLine()) != null) {
//                sb.append(line).append("\n");
//            }
//            String result = sb.toString();
//            System.out.println(result);
//            return result;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//
//    }
//
//    public static void main(String[] args){
//        System.out.println(runshell(args[0], args[1]));
//
//    }
//}
package code;

public class PrintOs {
    public static void main(String[] args) {
//        获取系统环境
        String osName = System.getProperty("os.name");
        if (osName.equals("Mac OS X") || osName.equals("Linux")) {
            System.out.println("This is a UNIX box amd therefore good.");
        } else if (osName.equals("Windows NT") || osName.equals("Windows 7")) {
            System.out.println("This is a Windows box an therefore bad.");
        } else {
            System.out.println("This is not a box.");
        }
    }
}

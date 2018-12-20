package code;

import java.io.Console;

/**
 * 输入用户和密码
 */
public class ConsoleDemo {

    public static void main(String[] args) {
        Console console = System.console();
        if ((console != null)) {

            String userName = null;
            char[] passwd = new char[0];
            try {
                userName = console.readLine("User Name:");
                passwd = console.readPassword("Password: ");
            } catch (Exception e) {
                e.printStackTrace();
            }

            //test
            System.out.println(userName);
            for (char c : passwd) {
                System.out.print(c);
            }
            //replace passwd arrays
            passwd = null;
        }
    }
}
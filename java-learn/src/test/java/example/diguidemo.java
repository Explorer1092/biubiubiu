package example;

/**
 * Created by Shen on 2017/4/20.
 */
public class diguidemo {
    public static void main(String[] args) {
        System.out.println(f(5));
      }

    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 5;
        } else {
            return f(n -1)  + f(n - 2); //4 3 ,3 2,2 1,
        }
    }
}

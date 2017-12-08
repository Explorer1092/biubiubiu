package example;

/**
 * Created by shenwd on 2017/1/5.
 */
public class urlpass {

    public void print(int num){
        System.out.println(num);
    }

    public void num(){
        for (int i = 0; i < 10; i++) {
            print(i);
        }
    }
    public static void main(String[] args) {
        new urlpass().num();
    }
}

package example;

/**
 * Created by shenwd on 2017/2/6.
 */
public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        //因为列表都是从0开始计算的，下面z+1的话就是从1开始算，所以要写-1
        int z= -1;

        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.println(h[z].name + " is a");
            System.out.println("good Hobbits name");
        }
    }
}

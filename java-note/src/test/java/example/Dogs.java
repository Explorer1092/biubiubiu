package example;

/**
 * Created by shenwd on 2017/2/6.
 */
public class Dogs {
    int size;
    String name;

    void bark() {
        if (size > 50) {
            System.out.println("我是："+name+"Wooof! Wooof!");
        } else if (size > 20) {
            System.out.println("我是："+name+"Ruff! Ruff!");
        } else {
            System.out.println("我是："+name+"Yip! Yip");
        }
    }

    void cate(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("ruff");
            numOfBarks = numOfBarks - 1;
        }

    }

    void go() {

    }

    int giveSecret() {
        return 42;
    }





}

class DogsTestDrive {
    public static void main(String[] args) {
        Dogs one = new Dogs();
        one.size = 70;
        one.name = "狼狗";
        Dogs two = new Dogs();
        two.size = 10;
        two.name = "宠物狗";
        Dogs Three = new Dogs();
        Three.size = 30;
        Three.name = "看家狗";

        one.bark();
        two.bark();
        Three.bark();

        Dogs d = new Dogs();
        d.cate(3);


    }
}

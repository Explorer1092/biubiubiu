package example;

/**
 * Created by shenwd on 2017/2/7.
 * return this.this.field,this.method()
 * 对象最终的初始化值与构建方法中的值一致。因此:
 * 构建方法 > 显式初始值 > 默认初始值
 */
public class test1 {
    public static void main(String[] args) {
        Human aPerson = new Human(150);
        System.out.println(aPerson.getHeight());
        Human pass = new Human(180);
        System.out.println(pass.getHeight());
        aPerson.repeatBreath(10);

    }
}

class Human {
    int getHeight() {
        return this.height;
    }


//    void growHeight(int h) {
//        this.height = this.height + h;
//    }


    void breath() {
        System.out.println("hu...hu...");
    }
    //带参数的方法
    void repeatBreath(int rep) {
        int i;
        for (i = 0; i < rep; i++) {
            this.breath();
        }
    }

    Human(int h) {
        this.height = h;
    }
    int height;
}

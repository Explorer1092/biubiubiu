package example;

/**
 * Created by shenwd on 2017/2/6.
 */
class Dog {
   String name;

    public static void main(String[] args) {
        //创建Dog对象 Dog类new一个新的对象，类的实例
        Dog dog1 = new Dog();
        //bark方法时候后面定义的方法
        dog1.bark();
        //实例dog1中的name指定变量
        dog1.name ="bart";

        //创建dog数组，创建了Dog数组3个
        Dog[] myDogs = new Dog[3];
        //关门放狗
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //通过数组引用存取
        myDogs[0].name = "fred";
        myDogs[1].name = "Marge";

        //myDog[2]的名字是？
        System.out.println("last dog's name is");
        System.out.println(myDogs[2].name);

        //逐个对Dog执行bark()
        int x =0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }

    }

    public void bark() {
        System.out.println(name + "says ruff!");
    }

}

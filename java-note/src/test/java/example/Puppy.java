package example;

/**
 * Created by shenwd on 2016/11/29.
 */
public class Puppy {
    int puppyAge;
    public Puppy(String name) {
        System.out.println("小狗的名字是：" + name);
    }
//    ser设置属性
    public void setAge(int age){
        puppyAge = age;
    }
//    get获取方法
    public int getAge(){
        System.out.println("小狗的年龄是：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
//        创建对象
        Puppy mypuppy = new Puppy("tommy!");
//        通过方法来设定age
        mypuppy.setAge(10);
//        调用另一个方法获取age
        mypuppy.getAge();
//        也可以像下面这样访问成员变量
        System.out.println("变量值：" + mypuppy.puppyAge);
    }
}


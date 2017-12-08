package example;

/**
 * Created by shenwd on 2017/2/7.
 */

public class EncapTest{
    public static void main(String[] args) {
        runtest encap = new runtest();
        encap.setAge(10);
        encap.setIdNum();
        encap.setName();
        System.out.println("name: "+encap.getName()+
                " age: "+encap.getAge()+
                " num: "+encap.getIdNum());
    }
}
class runtest {
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    void setName() {
        name = "zhangsan";
    }

    void setIdNum() {
        idNum = "100";
    }
}


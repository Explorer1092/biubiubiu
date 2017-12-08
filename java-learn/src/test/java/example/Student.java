package example;

/**
 * Created by shenwd on 2017/2/7.
 */
public class Student {
    private int number;
    private String name;
    private String courseName;
    private int score;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number =number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [number =" + number + ",name=" + name + ",courseName=" +
                courseName + ",score=" + score + "]";
    }
}
//student类的那些属性就是数据了，get和set方法就是已定义的接口，任何一个个student对象的实例，要操作
//其属性都只能通过get和set方法

class Test {
    public static void main(String[] args) {
        Student ws = new Student();
        ws.setName("张三");
        ws.setCourseName("数学");
        ws.setNumber(1);
        ws.setScore(90);
//        ws.setName("李四");
        System.out.println(ws);
    }
}
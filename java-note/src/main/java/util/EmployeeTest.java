package util;

/**
 * Created by shenwd on 2016/11/30.
 */

public class EmployeeTest {
    public static void main(String[] args) {
//        使用构造器创建两个对象
        Employee empone = new Employee("RUNOOB1!");
        Employee emptwo = new Employee("RUNOOB2");
        Employee empthree = new Employee("RUNOOB3");

//        调用这两个对象的成员方法
        empone.empAge(26);
        empone.empDesignation("IT");
        empone.empSalary(1000);
        empone.printEmployee();

        emptwo.empAge(20);
        emptwo.empDesignation("HR");
        emptwo.empSalary(500);
        emptwo.printEmployee();

        empthree.empAge(30);
        empthree.empDesignation("autowork");
        empthree.empSalary(3000);
        empthree.printEmployee();
    }


}


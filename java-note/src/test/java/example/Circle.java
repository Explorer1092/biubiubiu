package example;

/**
 * Created by shenwd on 2016/12/5.
 */
public class Circle {
    private double x=1;
    private double y=2;
    private double radius=3;
    public double getX(){
        x = x +1;
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    public double arle(){
        return Math.PI * radius *radius;
    }

    private void test(){
        System.out.println("x is :" + getX());
        System.out.println("y is :" + y);
        System.out.println("radius is:" + radius);
        System.out.println("arle is" + arle());
        System.out.println("getArea is" + getArea());
    }
    public static void main(String[] args){new Circle().test();}



    public double getArea() {
        return 0;
    }
}

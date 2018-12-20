package code;

class Anima {
    public void say() {
        String n = "hello";
        int p = n.length();
        System.out.println(n.startsWith("l", 2));
        System.out.println(n.isEmpty());
        System.out.println(n.startsWith("H"));
        System.out.println(n.charAt(0));
        System.out.println(n.hashCode());
        System.out.println(n.replace("he", "sys"));
        System.out.println(n.toLowerCase());
        for (int i = 0; i < n.length(); i++) {
            System.out.println(i);
        }
    }
}

class Apaha extends Anima {
    @Override
    public void say() {
        System.out.println("anima print");

    }
}
/** 重载的类重复使用
 * @author Shen
 */
public class overloading {
    public static void main(String[] args) {
        Apaha a =new Apaha();
        Anima b = new Anima();
        a.say();
        b.say();
    }
}
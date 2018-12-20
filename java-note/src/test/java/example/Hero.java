package example;

/**
 * Created by Shen on 2017/4/23.
 */
public class Hero {
    String name;
    int price;
    float hp=100;
    float armor =60;
    int movespeed =50;

    public void keng() {
        System.out.println("坑队友");
    }

    public void legenderay() {
        System.out.println("超神");
    }
//    获取护甲值
    public float getArmor() {
        return armor;
    }


    //    获取血量
    public float getHp() {
        return hp;
    }

    //    回血
    public void addHp(float blood) {
        hp = hp + blood;
    }


    //    增加移动速度
    public void addSpeed(int speed) {
        movespeed = movespeed + speed;
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "血瓶";
        hero.price = 50;
        System.out.println(hero.name + " " + hero.price);

        hero.name = "草鞋";
        hero.price = 300;
        System.out.println(hero.name + "" + hero.price);

        hero.name = "长剑";
        hero.price = 350;
        System.out.println(hero.name + "" + hero.price);

        hero.addSpeed(100);
        hero.addHp(20);
        hero.keng();
        hero.legenderay();
        System.out.println("移动速度："+hero.movespeed);
        System.out.println("护甲值："+hero.getArmor());
        System.out.println("血量："+hero.getHp());

    }
}

package example;

/**
 * Created by shenwd on 2017/2/7.
 */
//定义一个Cup的接口
interface Cup {
    void addWater(int w);
    void drinkWater(int w);
}
//用implements关键字来实施interface；
// 一旦在类中实施了某个interface，必须在该类中定义interface的所有方法(addWater()和drinkWater())
class MusicCup implements Cup {
    //加水
    public void addWater(int w) {
        this.water = this.water + w;
    }
    //喝水
    public void drinkWater(int w) {
        this.water = this.water - w;
    }
    //在类中可以定义interface没有提及的其他public方法
    public int waterContent() {
        return this.water;
    }
    private int water =0;
}
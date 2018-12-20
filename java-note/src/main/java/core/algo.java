// Java 1，1，3，5，8，第30个是什么，从第三个数字开始，后一个数字是前2个数字的和
public class algo {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1, temp;
        System.out.format("第1个数是%d%n",num1);
        System.out.format("第2个数是%d%n",num2);
        for(int i=2;i<30;i++){
            num1+= num2; //相当于num1 = num1 + num2,然后将结果倒置
            temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.format("第%d个数是%d%n",i+1,num2);
        }
        
        algo a = new algo();
        System.out.print(a.sums(0,1));
    }
    int k =30;
    public int sums(int p1,int p2){
        if (k == 2){
            return 1;
        }
        k--;
        return sums(p2,p1+2);
    }

}

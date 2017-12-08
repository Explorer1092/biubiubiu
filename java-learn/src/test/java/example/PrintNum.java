package example;

/**
 * Created by Shen on 2017/4/25.
 */
public class PrintNum {
    public static void main(String[] args) {
        int num[][] = new int[10][10];
        int count = 0;
//        外层循环时控制数组的数据行内容
        for (int i = 0; i < num.length; i++) {
//            内衬循环时控制数组的数据列内容
            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j]);
                num[i][j] = count++;
                System.out.printf("%3d", num[i][j]);
            }
            System.out.println();
        }
    }
}

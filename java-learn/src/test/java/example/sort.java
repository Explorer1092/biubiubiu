package example;

/**
 * 实现一个数组排序
 * Created by Shen on 2017/4/26.
 */

public class sort {
    public static void main(String[] args) {
        int[] data = new int[]{2, 1, 9, 0, 5, 3, 7, 6, 8};
        sort(data);//实现排序
        print(data);

    }

    //    这个方法负责排序
    public static void sort(int[] arr) {
//        外层控制排序总体次数
        for (int i = 0; i < arr.length; i++) {
//            内层负责每次的排序
            for (int y = 0; y < arr.length - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int t = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = t;
                }
            }
        }
    }

    //类方法无void返回值，main方法可以直接调用
    public static void print(int temp[]) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "、");
        }
        System.out.println();
    }

}

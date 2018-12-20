package example;

/**
 * Created by Shen on 2017/4/26.
 */
// 冒泡排序
public class sortDemo {
    public static void main(String[] args) {
        int data[] = new int[]{100, 88, 56, 33, 2, 27, 1, 156, 14};
        demo(data);
        temp(data);
        int[] a = {49, 100, 52, 53, 65, 98, 12, 13, 51};
        sortDemo t = new sortDemo();
        t.sort(a);
        t.printsort(a);

    }

    public static void demo(int t[]) {
        for (int m = 0; m < t.length; m++) {
            for (int j = 0; j < t.length - 1; j++) {
                if (t[j] > t[j + 1]) {
                    int a = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = a;
                }
            }

        }
    }

    public static void temp(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "、");
        }
        System.out.println();
    }

    //快速排序
    public int getSortIndex(int[] a, int left, int right) {
        int temp = a[left];
        while (left < right) {
            while (left < right && a[right] >= temp) {
                right--;
            }
            a[left] = a[right];
            while (left < right && a[left] <= temp) {
                left++;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        return left;

    }

    public void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int index = this.getSortIndex(a, left, right);
            this.quickSort(a, left, right-1);
            this.quickSort(a, index + 1, right);

        }
    }

    public void sort(int[] a) {
        if (a != null && a.length > 0) {
            this.quickSort(a, 0, a.length - 1);
        }

    }

    public void printsort(int[] a) {
        for (int i : a) {
            System.out.print(i + "、");
        }
        System.out.println();
    }
}

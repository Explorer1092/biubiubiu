
class demos {
    private static void Swap(int[] list, int i, int j) {
        int t = list[i];
        list[i] = list[j];
        list[j] = t;
    }
    private static void Perm(int list[], int k, int m){
        if (k == m) {
            for (int i = 0; i <= m; i++) {
                System.out.println(list[i]);
            }
            System.out.println();
        } else {
            for (int i = k; i <= m; i++) {
                Swap(list, k, i);
                Perm(list, k + 1, m);
                Swap(list, k, i);
            }
        }
    }
    
    
    public static void main(String[] args){
        demos d = new demos();
        int[] arr = {1,2,3,4};
        Perm(arr, 1, 3);
    }


}

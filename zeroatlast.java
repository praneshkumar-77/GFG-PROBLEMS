public class zeroatlast {//283 1  26  27 35 414 2529 basic array in leetcode
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        int n = arr.length;
        int count = 0; 


        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        
        while (count < n) {
            arr[count++] = 0;
        }


        System.out.print("Array after moving zeros to last : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

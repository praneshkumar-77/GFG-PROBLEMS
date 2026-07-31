import java.util.*;
public class checksortarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("enter "+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(isSorted(arr)){
            System.out.print("The element is sorted");


        }else{
            System.out.print(" element is not sorted");
        }
    }
     public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
}
}

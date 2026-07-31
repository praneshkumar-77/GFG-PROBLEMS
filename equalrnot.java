import java.util.*;
public class equalrnot {
    public static boolean equals(int arr1[],int arr2[]){
        if(Array.equalrnot(arr1,arr2)){
            return true;

        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array 1:");
        int size1=sc.nextInt();
        System.out.print("Enter the size of array 2:");
        int size2=sc.nextInt();
        int []arr1=new int [size1];
        int []arr2=new int[size2];
        System.out.print("Enter the array 1 elements:");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();


        }
        System.out.print("Enter the array 2 elements:");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();


        }
        if(equals(arr1,arr2)){
            System.out.print("array are equal");
        }else{
            System.out.print("array is not equal");
        }


    }
    
}

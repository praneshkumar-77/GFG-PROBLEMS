import java.util.*;
public class countarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of Elements:");
        int n=sc.nextInt();

        int []arr= new int[n];
        System.out.print("Enter"+  n  +"elements:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int positivecount=0;
         int negativecount=0;
         int zerocount=0;
         for(int num :arr){
            if(num>0){
                positivecount++;
            }else if(num<0){
                negativecount++;
            }else{
                zerocount++;
            }

         }
         System.out.println("postive count="+positivecount);
         System.out.println("negative count="+negativecount);
         System.out.println("zerocount="+zerocount);

    }
    
}

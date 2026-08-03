import java.util.*;
public class reverse {
    public static  boolean prime(int num){
        if(num<=1){
            return  false;
        }
       for(int i=2;i<=num;i++){
        if(num%i==0){
            return false;
        }
       }
           return true;
    }
    public static int rev(int value){
        int reverse=0;
        while(value!=0){
            reverse=reverse*10+(value%10);
            value/=10;

        }
           return reverse;

    }
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int number=Sc.nextInt();
        if(prime(number)&& prime(rev(number))){
            System.out.println(number+"is a not twisted prime");

        } else{
            System.out.println(number+" is twisted prime");
        }
    }
}

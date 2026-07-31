import java.util.*;
public class alphabetpattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        char ch='A';
        for(int i=0; i<=row;i++){
            for(int j=1;j<=i; j++){
                System.out.print(ch+" ");
                ch++;

            }System.out.println(" ");
        }
    }
}





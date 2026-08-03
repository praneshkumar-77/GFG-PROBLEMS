import java.util.*;
public class squarehallow {
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        for(int row=0; row<size;row++){
            for(int col=0;col<size;col++){
                if(row==0||row==size-1||col==0||col==size-1){
                    System.out.print(" 1 ");

                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        Sc.close();
    }
    
}

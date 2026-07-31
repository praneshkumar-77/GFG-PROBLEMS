public class Array {
    

    public static void main(String[] args) {
        
        int l = 0;

        for(int i = 10 ; i >0; i--){
           

            for (int j = 0; j < i*2 - 1; j++) {
                 System.out.print(" ");
            }
            
            for (int k = 0; k < l*2-1; k++) {
                System.out.print("* ");
            }
            l++;
            System.out.println();
            
        }

        
    }
}// simalar data type stored 

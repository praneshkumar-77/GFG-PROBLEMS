public class firstlastindex{
    public static void main(String[] args) {
        String str="programming";
        char ch='g';
        int lastindex=-1;
        int first_index=-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                if(first_index==-1){
                    first_index=i;

                }
                lastindex=i;


            }
        }
        System.out.println("first index of"+ch+"  is "+first_index);
        System.out.println("last index of"+ch+"is "+lastindex);
    }
}
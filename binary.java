public class binary {
    public static int binarysearch(int[]a,int target){
        int left=0,right=a.length-1;
        
        while(left<=right){
             int mid=(left+right)/2;
             
             if(a[mid]==target){
            return mid;
             }
        
        else if(a[mid]>target){
            right=mid-1;


        }else{
            left=mid+1;

        }
    }
    return-1;

}
public static void main(String[]args){
    int key=3;
    int[]a={1,2,3,4,5,6,7,8,9,10,11};
    System.out.print(binarysearch(a,key));



} 
}

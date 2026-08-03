public class firstoccurance {
    public static int binarysearch(int[]arr,int target){
        int start=0,end=arr.length-1;
        int firstocr=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                firstocr=mid;
                end=mid-1;


            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }
        return firstocr;

    }
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8};
        int target=4;
        System.out.print(binarysearch(a,target));
    }
}

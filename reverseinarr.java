public class reverseinarr {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8};
        int start=0;
        int end=a.length;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            end--;
            start++;
        }
        System.out.print(Arrays.toString(a));
        

    }
    
}

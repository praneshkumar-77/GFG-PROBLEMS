public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,1,2,1,3,2,1,4};
        boolean arr2[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr2[i])
            continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr2[j]=true;
                }
            }
            if(count>1){
                System.out.println(arr[i]+"  "+"Appears"+count+"times");
            }
        }
    }


    
}

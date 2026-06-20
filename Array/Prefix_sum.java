public class Prefix_sum {
    public static void prefix_arr(int arr[]){
        int i,j;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        System.out.print("prefix array is = ");
        for(i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        int sum = prefix[0];
        for(j=1;j<prefix.length;j++){
            if(sum<prefix[j]){
                sum=prefix[j];
            }
        }
        System.out.println("max_sum ="+sum);
        
    }
    public static void main(String[] args) {
        int arr[]={-1,2,6,-1,7};
        prefix_arr(arr);
    }
}

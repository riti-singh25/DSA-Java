import java.math.*;
public class Kadanes {
    public static void max_sum(int arr[]){
        int cs=0,max=0;
        for(int i =0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,-3,4,-1,-2,1,5,-3};
        max_sum(arr);
    }
}

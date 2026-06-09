import java.util.*;
public class Decimaltobinary {
    public static int binary(int a){
        int i,rem,sum=0;
        for(i=0;a>0;i++){
            rem = a%2;
            sum = sum + (rem*(int)Math.pow(10,i));
            a=a/2;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter the binary number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = binary(num);
        System.out.println(result);
    }
}

import java.util.*;
public class Binarytodecimal {
    public static int decimal(int n ){
        int i,rem,sum=0;
        for(i=0;n!=0;i++){
            rem=n%10;
            sum =sum + (rem * (int) Math.pow(2,i));
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the binary number = ");
        int num = sc.nextInt();
        int result =decimal(num);
        System.out.println(result);
    }
}

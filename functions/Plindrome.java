//package functions;
import java.util.*;
public class Plindrome {
    public static int palindrome(int a){
        int i,rem,sum=0;
        for(i=0;a>0;i++){
            rem=a%10;
            sum += rem;
            sum *=10;
            a=a/10;
        }
        sum=sum/10;
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("enter the number =");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(palindrome(num)==num)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();
        int i,rev=0;

        for(i=0;n>0;i++){
            int rem;
            rem=n%10;
            rev+=rem;
            rev*=10;
            n/=10;
        }
        rev/=10;
        System.out.println(rev);
        sc.close();
    }
}

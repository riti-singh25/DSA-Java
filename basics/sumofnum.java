//package loop;
import java.util.*;
public class sumofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();
        int i=1 ,sum=0;
        while (i<=n) {
            sum+=i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}

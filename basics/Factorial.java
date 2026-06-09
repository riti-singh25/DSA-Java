import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = sc.nextInt();
        int i,fact=1;
        if (n==1 || n==0) {
            System.out.println("factorial = 1");
        }
        else{
            for(i=1;i<=n;i++){
                fact*=i;
            }
            System.out.println("factorial = " + fact);
        }
        sc.close();
    }
    
}

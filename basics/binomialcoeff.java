import java.util.*;
public class binomialcoeff {
    public static int factorial(int a){
        int fact = 1;
        for(int i =1 ;i<= a;i++){
            fact = fact *i;
        }
        return fact;
    }
    public static int binomial(int n , int r){
        int num = factorial(n);
        int deno = factorial(r)*factorial(n-r);
        return (num/deno);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n ");
        int n = sc.nextInt();
        System.out.println("enter the number r");
        int r = sc.nextInt();
        int result =binomial(n, r);
        System.out.println(result);

    }
}

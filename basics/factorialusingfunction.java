import java.util.*;
public class factorialusingfunction {
    public static int fact(int a) {
        int factorial = 1;
        for(int i= 1; i<=a; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find factorial: ");
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println("the factorial of "+ num + " is: " + result);
    }
    
}

import java.util.*;

public static int multiply(int a, int b) {
    int mul = a * b;
    return mul;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int result = multiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
        int result2 = multiply(10,30);
        System.out.println("the product of 10 and 30 is: " + result2);
    }
    


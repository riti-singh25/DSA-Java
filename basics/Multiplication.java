import java.util.*;

public class Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number a");
        float a = sc.nextFloat();

        System.out.println("enter the number b");
        float b = sc.nextFloat();

        float mul = a*b;
        System.out.println("Multiplication = "+mul);

        sc.close();

    }
}

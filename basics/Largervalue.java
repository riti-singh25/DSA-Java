import java.util.*;

public class Largervalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number = ");
        int a = sc.nextInt();

        System.out.print("enter the second number = ");
        int b = sc.nextInt();

        if (a>b) {

            System.out.print(a+" is greater then " + b);
            
        }

        else{
            System.out.println(b+ " is greater then " +a);
        }

        System.out.print("enter the number = ");
        int c = sc.nextInt();

        if (c%2==0) {
            System.out.print("entered number is even");
        }

        else{
            System.out.println("entered number is odd");
        }

        sc.close();
    }
    
}

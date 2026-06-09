import java.util.*;

public class Laegeogthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number = ");
        int a = sc.nextInt();

        System.out.print("enter the second number = ");
        int b = sc.nextInt();

        System.out.print("enter the third number = ");
        int c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println("a is the greatest number");
            
        }
        else if (b>a && b>c) {
            System.out.println("b is the greates number");
        }
        else{
            System.out.println("c is the greatest number");
        }

        sc.close();
    }
}

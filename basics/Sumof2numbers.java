import java.util.*;

public class Sumof2numbers {
    public static void main(String[] args) {
        System.out.println("enter the number a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //System.out.println(a);
        System.out.println("enter the number b");
        
        int b = sc.nextInt();
        //System.out.println(b);

        int sum = a+b;
        System.out.println(sum);

        sc.close();
    }
    
}

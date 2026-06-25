import java.util.*;
public class Odd_even {
    public static void find(int a){
        int bitmask =1;
        if ((a & bitmask) == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number = ");
        int n = sc.nextInt();
        find(n);
    }
}

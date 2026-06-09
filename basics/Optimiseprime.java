import java.util.*;
public class optimiseprime {
    public static boolean isprime(int a) {
        if (a == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a % i == 0)
                return false;
        return true;
    }

    public static void primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        primeinrange(num);
    }
}

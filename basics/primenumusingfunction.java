import java.util.*;
public class primenumusingfunction {
  public static boolean isprime(int a)  {
    if(a==2)
        return true;
    for(int i = 2 ;i<=Math.sqrt(a) ; i++)
        if(a%i==0)
            return false;
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to find it is prime or not");
    int n = sc.nextInt();
    boolean result= isprime(n);
    System.out.println(result);
  }
}

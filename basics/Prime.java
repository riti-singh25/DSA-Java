import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int i;
        if (num==2) {
                System.out.println("prime");
            }
        
        else{
            for(i=2; i<=Math.sqrt(num);i++){
            if (num%i==0) {
                System.out.println("not a prime number");
                break;
            }
            else{
                System.out.println("prime number");
                break;
            }
        }
        }
        sc.close();
    }
    
    
}

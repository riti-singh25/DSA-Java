import java.util.*;
public class Sumofoddandeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i,S_even=0,S_odd=0;
        for(i=0; i<=n;i++){
            if (i%2==0) {
                S_even+=i;
            }
            else{
                S_odd+=i;
            }
        }
        System.out.println("sum of even number = "+S_even);
        System.out.println("sum of odd number = "+S_odd);
        sc.close();
    }
}
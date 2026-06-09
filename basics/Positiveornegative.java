import java.util.*;
public class Positiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eenter the number");
        int n =sc.nextInt();
        if (n>0){
            System.out.println("Positive ");
        }
        else if(n==0){
            System.out.println("nor negative nor positive");
        }
        else{
            System.out.println("Negaative ");
        }
        sc.close();

    }
}

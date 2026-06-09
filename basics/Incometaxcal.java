
import java.util.*;
public class Incometaxcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the income in lacs = ");
        int income = sc.nextInt();

        //int tax ;

        if (income<500000) {
            System.out.println("tax = "+(income*0));
        }

        else if (income>=500000 && income< 1000000) {
            System.out.println("tax = "+((int)(income*0.2)));
        }

        else{
            System.out.println("tax = "+((int)(income*0.3)));
        }
        sc.close();
    }
}

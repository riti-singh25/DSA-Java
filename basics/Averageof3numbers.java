import java.util.*;

public class Averageof3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number a");
        float a = sc.nextFloat();

        System.out.println("enter number b");
        float b = sc.nextFloat();

        System.out.println("enter number c");
        float c = sc.nextFloat();

        System.out.println("average of the three numbers = " + (a+b+c)/3);
        
        sc.close();
    }
}


import java.util.*;

public class Areaofsq {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of square");
        float side = sc.nextFloat();
        
        System.out.println("area of the square = " + side*side);

        sc.close();
    }
}

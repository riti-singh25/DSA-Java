import java.util.*;
public class Areaofcircle {
    public static void main(String[] args) {

                //entering the radius of the circle;

        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();

        // area of circle
        float area = 3.14f*rad*rad;
        System.out.println("Area of circle = " + area);

        sc.close();
    }
    
}

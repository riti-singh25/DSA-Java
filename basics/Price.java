import java.util.*;

public class Price{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the price of pencil");
        float pencil = sc.nextFloat(); 

        System.out.println("enter the price of eraser");
        float eraser = sc.nextFloat();  

        System.out.println("enter the price of pen");
        float pen = sc.nextFloat();                

        float total = pen+pencil+eraser;
        System.out.println("the total price without gst = " + total);

        System.out.println("the price after applying gst = "+ (total + ( (total*18)/100)));

        // yes the $ is working as an variable;
        
        int $ = 24;
        System.out.println($);

        sc.close();
    }
}

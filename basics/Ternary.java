import java.util.*;

public class Ternary {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the marks");
    float marks = sc.nextFloat();

    String status = (marks >= 33) ? "pass" : "Fail";

    System.out.println(status);

    sc.close();
   } 
}

import java.util.*;
public class Feverdetection { 
public static void main(String[] args) { 
//double temp = 103.5;
Scanner sc = new Scanner(System.in);
System.out.print("enter your present temperature ");
double ytemp = sc.nextDouble();
if (ytemp<=100) {
    System.out.println("you have'nt fever");
}
else{
    System.out.println("you have fever ");
}
sc.close(); 
}
}
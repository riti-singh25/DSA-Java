//package Strings;
import java.util.*;
public class Operations {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String str1 =" is english alphabate";
        String str2 = str+str1; // concatination of the two strings
        System.out.println(str2);
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println(name);
        System.out.println(name.charAt(6));//return the letter at the index mentioned here ;
    }
}

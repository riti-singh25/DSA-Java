import java.util.*;
public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = sc.nextInt();
        int i,mul=1;
        for(i=1;i<=10;i++){
            mul=i*n;
            System.out.println(i+"*"+n+"="+mul);
        }
        sc.close();

    }
    
}

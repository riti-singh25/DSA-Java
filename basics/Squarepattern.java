import java.util.*;
public class Squarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number ");
        int n = sc.nextInt();

        int i,j;

        for(i=0;i<n;i++){
           for(j=0;j<n;j++){
            System.out.print( "*" );
           }
           System.out.print("\n");
        }
        sc.close();
    }
}

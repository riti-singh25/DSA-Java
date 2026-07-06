public class Increasing_Order {
    public static void Print(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        Print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=20;
        Print(n);
    }
}

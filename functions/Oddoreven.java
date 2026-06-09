//package functions;

public class Oddoreven {
    public static boolean even(int a){
        if(a%2==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(even(3));
    }
}

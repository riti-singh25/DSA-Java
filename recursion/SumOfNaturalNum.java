public class SumOfNaturalNum {
    public static int Sum(int n){
        if (n>0) {
           return n + Sum(n-1);
        }
        return n;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(Sum(n));
    }
}

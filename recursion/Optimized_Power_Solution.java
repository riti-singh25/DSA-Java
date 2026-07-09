class Optimized_Power_Solution {
    public static int power(int a, int n){
        if(n==0)
            return 1;
        int b = power(a,n/2);
        int b2 = b*b;
        if (n%2!=0)
            return a*b2;
        else
            return b2;
    }
    public static void main(String[] args) {
        int a = 2;
        int n =3;
        System.out.println(power(a,n));
    }
}

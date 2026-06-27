//package Bit_Manipulation;

public class Get {
    public static int getin(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else
            return 1;
    }
    public static void main(String[] args) {
        System.out.println( getin(10,3));;
    }
}
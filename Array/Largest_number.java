import java.util.*;
//public package Array;

class Largest_number {
    public static int largest(int array[]) {
        int larg = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > larg) {
                larg=array[i];
            }
            if (array[i] <small) {
                small=array[i];
            }
        }
        System.out.println("smallest value is " + small);
        return larg;
    }

    public static void main(String[] args) {
        int array[] = { 23, 56, 10, 75, 7, 53, 86, 96, 51, 36 };
        int result = largest(array);
        System.out.println("largest number is " + result);
    }
}
public class Invertedhalfpyramid {
    public static void pyramid(int a ){
        int i,j;
        for(i = 1; i<=a;i++){
            for(j=1; j<=a-i ; j++){
                System.out.print(" ");
            }
            for(j=1 ; j<=i;j++){
                System.out.print("*");
            }
                System.out.println();
        }
        //System.out.println();
    }
    public static void main(String[] args) {
        pyramid(5);
    }
}
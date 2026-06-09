public class Flodystriangle {
    public static void triangle(int n){
        int i,j,counter=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(5);
    }
}

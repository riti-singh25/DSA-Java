public class Tiling_Problem {
    public static int Tiles(int n){
        if(n==0 || n==1)
            return 1;
        return Tiles(n-1)+Tiles(n-2);
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println(Tiles(n));
    }
}

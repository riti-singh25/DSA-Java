public class Set {
    public static int setin(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setin(10, 2));
    }
}

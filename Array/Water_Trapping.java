import java.math.*;

public class Water_Trapping {
    public static int water_traped(int arr[]) {
        int l_max[] = new int[arr.length];
        l_max[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            l_max [i]= Math.max(l_max[i - 1], arr[i]);
        }
        int r_max[] = new int[arr.length];
        r_max[arr.length - 1] = arr[arr.length - 1];
        for (int j = arr.length - 2; j >= 0; j--) {
            r_max[j] = Math.max(r_max[j + 1], arr[j]);
        }
        int trp_wtr = 0;
        for (int i = 0; i < arr.length; i++) {
            int wtr_lvl = Math.min(l_max[i], r_max[i]);
            trp_wtr += wtr_lvl - arr[i];
        } 
        return trp_wtr;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(water_traped(arr));
    }
}

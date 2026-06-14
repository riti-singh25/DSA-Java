public class Sum_array {
    public static void sub_Part(int[] array) {
        int sum, ts = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start = i;

            for (int j = i; j < array.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(array[k] + " ");
                    sum += array[k];
                }
                if (max < sum) {
                    max = sum;
                }
                System.out.println("sum=" + sum);
                // ts++;
                System.out.println();
            }
            System.out.println();
        }
        // System.out.println("number of sub arrays" + ts);
        System.out.println("maximum sum of the subarray = " + max);
    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 8, 10 };
        sub_Part(array);
    }
}

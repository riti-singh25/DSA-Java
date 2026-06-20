public class Buy_Sell_Stock {
    public static int stock(int arr[]){
        int bp = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i =0 ; i<arr.length;i++){
           if(bp<arr[i]){
            int profit=arr[i]-bp;
            max_profit = Math.max(max_profit, profit);
           } 
           else{
            bp = arr[i];
           }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(stock(arr));
    }
}

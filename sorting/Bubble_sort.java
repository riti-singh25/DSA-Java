public class Bubble_sort {
    public static void sort(int arr[]){
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(swap==0){
                break;// if there is no any swapping the given array is already sorted !
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,6,8,9,3,4,1,3};
        //int arr[]={2,4,5,6,3,5,1};
        //int arr[]={1,2,3,4,5,6};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

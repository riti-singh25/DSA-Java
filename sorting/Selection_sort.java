
public class Selection_sort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            //finding the idx of smallest element present int  the arr
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
                //swapping of the smallest element to the first element of the unsorted part;
                int temp = arr[i];
                arr[i]=arr[smallest];
                arr[smallest]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2,5,6,3};
        sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}

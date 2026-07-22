public class Merge_Sort {
    public static void merge_Sort(int arr[],int si,int ei){
        if(si>=ei)
            return;
        int mid=si+(ei-si)/2;
        merge_Sort(arr,si,mid);
        merge_Sort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si ,int mid,int ei){
        if (si>ei) {
            return;
        }
        int temp[]=new int[(ei-si)+1];
        int i=si,k=0;
        int j=mid+1;
        while (i<=mid && j<=ei) {
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,4,2,1,3,5,8,0};
        merge_Sort(arr, 0, arr.length-1);
        for(int num : arr)
            System.out.print(num + " ");
    }
}

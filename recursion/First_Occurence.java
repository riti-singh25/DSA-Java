public class First_Occurence {
    public static int firstOccurence(int arr[],int key,int i){
        if(arr[i]==key)
            return i;
        if(i==arr.length-1)
            return -1;
        return firstOccurence(arr, key, i+1) ;
    }
    public static void main(String[] args) {
        int arr [] = {1,3,4,5,7,3,8};
        int key = 8;
        System.out.println(firstOccurence(arr, key, 0));
    }
}

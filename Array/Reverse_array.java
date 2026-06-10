//public package Array;

class Reverse_array {
    public static void reverse(int array[]){
        int start =0,last = array.length - 1;
        int temp;
        while (start<last) {
            temp = array[start];
            array[start]=array[last];
            array[last]=temp;
            start++;
            last--;
        }
    }
  public static void main(String[] args) {
    int array[]={1,2,4,5,6,7,8,9};
    reverse(array);
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
  }  
}

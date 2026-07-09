public class Remove_Duplicate_In_String {
    public static void removeDuplicate(String str , int i , StringBuilder nsb , boolean map[]){
        if (i==str.length()) {
            System.out.println(nsb);
            return;
        }
        char currentchar = str.charAt(i);
        if(map[currentchar-'a']==true)
            removeDuplicate(str, i+1, nsb, map);
        else{
            map[currentchar-'a']=true;
            removeDuplicate(str, i+1, nsb.append(currentchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "apnnacollege";
        removeDuplicate(str, 0,new StringBuilder(""), new boolean[26]);
    }
}

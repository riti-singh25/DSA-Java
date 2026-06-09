import java.util.*;

public class Linear_Search {
    public static String search(String menu[],String key){
        for(int i = 0; i< menu.length ;i++){
            if(menu[i].equals(key)){
                return "found the dish";
            }
            else{
                return"not found";
            }
        }
        return "Execution completed";
        
    }
    public static void main(String[] args) {
        String menu[]={"samosa","dosa","coca","momos","sprite","thumsup","aloo_paratha"};
        System.out.println("enter your favorite dish");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        System.out.println(search(menu, key));
    }

}

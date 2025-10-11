import java.util.HashMap;
import java.util.Scanner;
public class HashMapEx {
    /*
     * keys should be uniques
     * if we put wwith same key again the value will be overwritten
     * there is no order like arrays have
     */
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("AP","Amaravati");
        capitals.put("Delhi","NewDelhi");
        capitals.put("odhisa","chandigar");

        Scanner sc = new Scanner(System.in);
        String input= new String();
        System.out.print("Enter the state name: ");
        input =sc.next();
        System.out.print(capitals.get(input));
        
       
    }
}

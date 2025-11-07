import java.util.HashMap;
import java.util.Map;
public class RLE {
    public static String encodString(String s){
        Map<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            int count = freq.getOrDefault(c, 0);
            freq.put(c, count + 1);
        }
        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character,Integer> entry : freq.entrySet()){
            ans.append(entry.getKey());
            ans.append(entry.getValue());
        }
        return ans.toString();
    }
    public static String decodingString(String s){
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length()-1;i=i+2){
            for(int j=0;j<Integer.parseInt(s.charAt(i+1)+"");j++){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        System.out.println(encodString("aaabbbccd"));
        System.out.println(decodingString("a3b3c2d1"));
    }

}

import java.util.*;
class count_Vowels{
    public static void main(String args[]){
        System.out.println("Enter a word: ");
        Scanner sc= new Scanner(System.in);
        String s = sc.next();int co=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
            c=='A' ||c=='E'|| c=='I' || c=='O' || c=='U'){
                co++;
            }
        }
        System.out.println("Number of characters: "+co);
    }
}
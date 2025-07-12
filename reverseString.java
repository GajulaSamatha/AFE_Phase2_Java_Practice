import java.util.Scanner;
public class reverseString{
    public static void main(String args[]){
        System.out.println("Enter a word: ");
        Scanner sc= new Scanner(System.in);
        String word= sc.next();
        int len = word.length();
        for(int i=len-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }
}
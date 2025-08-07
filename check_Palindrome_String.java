import java.util.*;
class check_Palindrome_String{
    public static void  main(String a[]){
        System.out.println("Enter your word: ");
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        String rs = new String();
        for(int i=s.length()-1;i>=0;i--){
            rs+=s.charAt(i);
        }
        if(s.equals(rs)){
            System.out.println("The string is a Palindrome!!");
        }
        else{
            System.out.println("The string is not a Palindrome!!");
        }
        sc.close();
    }
}
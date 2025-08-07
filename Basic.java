import java.util.*;
class Basic{
public static void main(String[] args){
    // int x=1;
    // char c= x;
    // public static void main(String[] args){
    //     System.out.println("Int to Char Conversion :"+c);
    // }

    //pro2


    // String name="Samatha Gajula";
    // String password="sam@AFE";

    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter your UserName:");
    // String Ename=sc.nextLine().trim();
    System.out.println("Enter your password:");
    String Epassword=sc.nextLine().trim();

    if(Epassword.length()<8){
        System.out.println("Weak Password!!");
        sc.close();
        return;
    }
    else{
        System.out.println("Strong Password!!");
    }

    // if(Ename.equalsIgnoreCase(name)){
    //     if(Epassword.equals(password)){
    //         System.out.println("Login Successfully!!");
    //     }
    //     else{
    //         System.out.println("Invalid Password!!");
    //     }
    // }
    // else{
    //     System.out.println("Invalid Username!!");
    // }

    sc.close();

    // String s="   I am SAMATHA ";
    // String lowerS=s.toLowerCase();
    // String upperS= s.toUpperCase();
    // System.out.println("Lower S:"+lowerS);
    // System.out.println("Upper S:"+upperS);

    // boolean c = s.contains("atha");//returns true if it contains or else false, case sensitive
    // System.out.println("Did s contains 'atha'? :"+c);

    // int ind = s.indexOf("SAM");
    // System.out.println("Index of 'SAM' in "+s+"is "+ind);

    // String ss=s.substring(6);//start inde
    // String ss2 = s.substring(6,13); //start and end indexes
    // System.out.println("Substring from index 6: "+ss);
    // System.out.println("Substring from index 6 to 13: "+ss2);

    // String trimS=s.trim();//trims front and end spaces
    // System.out.println("Trimmed text:"+trimS);
}
}
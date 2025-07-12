import java.util.*;
public class decimalToBinary{
    public static void conversion(int decVal){
        System.out.print("Binary Value of decVal is : ");
        while(decVal>0){
            System.out.print(decVal%2);
            decVal=decVal/2;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n=sc.nextInt();
        conversion(n);
        sc.close();
    }
}
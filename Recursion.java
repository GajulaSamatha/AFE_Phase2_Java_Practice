import java.util.Scanner;

public class Recursion {

    //for better experinece we comparing a problem with loops and recursion
    //print the numbers from n to 1 -- iterative approach
    public static void printNto1Ite(Scanner sc){
        System.out.println("enter the n:");
        int n= sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
    //print the numbers from n to 1 -- recursive approach
    public static void printNto1Rec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1Rec(n-1);
    }
    //factorial by recursion
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fact = factorial(n-1)*n;
        return fact;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //printNto1Ite(sc);
        int fact = factorial(5);
        System.out.println("Factorial : "+fact);
    }
}

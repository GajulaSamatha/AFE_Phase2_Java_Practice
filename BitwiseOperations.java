import java.util.Scanner;

public class BitwiseOperations {
    
     //leftshift
    public static void leftShift(int num,int NOB){
        System.out.println(num<<NOB);
    }
    //rightshift
    public static void rightShift(int num,int NOB){
        System.out.println(num>>NOB);
    }
    /*given a number print even or odd */
    public static void evenOrOdd(int n){
        int mask=1;
        int ans=n&mask;
        if(ans==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
    }
    /*swap two numbers without third variable */
    public static void swap(int a, int b){
        System.out.println("before swaping "+"a = "+ a + " b= "+b); 
         a = a^b;
         b= a^b;
         a= a^b;
         System.out.println("after swaping "+"a = "+ a + " b= "+b); 
    }
    //counting no. of 1's 
    public static void countOnes(int n){
        int c=0;
        while(n>0){
            n = n & (n - 1);
            c++;
        }
        System.out.println("The no. of ones are: "+c);
    }
    public static void main(String[] args) {
        //leftShift(5,3);
        //rightShift(100, 2);
        Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        // evenOrOdd(n);
        //swap(5,10);
        countOnes(7);
        sc.close();
    }
}

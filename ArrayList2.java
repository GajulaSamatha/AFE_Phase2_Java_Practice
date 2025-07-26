import java.util.Scanner;
class ArrayList2{
    //factor of n
    public void printFactors(Scanner sc){
       
        System.out.println("enter your number: ");
        int n= sc.nextInt();
        System.out.println("The factors are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    //is prime?
    public void isPrimeNum(Scanner sc){
        boolean isPrime=true;
        System.out.println("enter your number: ");
        int n= sc.nextInt();
        System.out.println("The factors are: ");
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println(n+" is a prime number!!");
        }
        else{
            System.out.println(n+" is not prime number!!");
        }
    }
    //Factorial
    public void printFactorial(Scanner sc){
        int result=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            result*=i;
        }
        System.out.println("The factorial of n: "+result);
    }
    public static void main(String[] arg){
         Scanner sc=new Scanner(System.in);
        ArrayList2 al=new ArrayList2();
        al.printFactors(sc);
        al.isPrimeNum(sc);
        al.printFactorial(sc);
    }
}
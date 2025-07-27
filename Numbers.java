import java.util.ArrayList;
import java.util.Scanner;
class Numbers{
    //finding GCD of two numbers by using Ecluid's algorithm
    public void findGCD(Scanner sc){
        System.out.println("Enter the a and b values: ");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("The GCD of "+a+", "+b+" is: ");
        while(b>0){
            int t=b;
            b=a%b;
            a=t;
        }
        System.out.println(a);
        
    }
    //finding prime numbers in the n range
    public void findPrimesInRange(Scanner sc){
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter your range: ");
        int n= sc.nextInt();
        for(int k=2;k<=n;k++){
            al.add(k);
        }
        for(int i=2;i<Math.sqrt(n);i++){
            for(int j=2;j<n;j++){
                if(j%i==0){
                    if(al.contains(j)){
                        al.remove(Integer.valueOf(j));
                    }
                }
            }
        }
        System.out.println("Prime numbers are: "+al);
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);     
        Numbers obj = new Numbers();
        obj.findPrimesInRange(sc);
        obj.findGCD(sc);
    }


}
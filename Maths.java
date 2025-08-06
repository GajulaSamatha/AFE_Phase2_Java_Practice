import java.util.Scanner;
import java.util.Random;
class Maths{
     /* 1) Calculate the volume of a cylinder. The formula is V=pi*r^2*h.
    * 1.1) Fix formatting for decimals */ 
   public static void volCyn(double r, double h){
        System.out.println("Volume of cylinder is : "+Math.PI * (r*r)*h);
        String formattedVolume = String.format("%.3f",Math.PI * (r*r)*h);
        System.out.println("Formtted Volume of cylinder is : "+formattedVolume);
   }
    //calculate circle area
    public static void circleArea(Scanner sc){
        double pi = Math.PI;
        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        System.out.println("Area : "+ pi*(r*r));
        System.out.println("Now enter the negative value to fing absolute value: ");
        int a=sc.nextInt();
        System.out.println("Absolute value : "+Math.abs(a));
        System.out.println(Math.sqrt(25));
    }
   /*Fibonacci*/
    public static void fibonacci(Scanner sc){
        int n=sc.nextInt();
        int f=0,s=1;
        System.out.print(f);
        for(int i=0;i<n;i++){
            System.out.print(" "+s);
            int t=s;
            s=s+f;
            f=t;
        }
    }
    public static void OTPGeneator(){
        int OTP = (int)(Math.random()*(999999-100000)+100000);
        System.out.println("Please don't share your OTP with anyone, here is your OTP: "+OTP);
    }
    /*
    3) The Shopping Bill with Tax and Discount
      "A customer buys two items: a shirt for ₹750 
       and a pair of trousers for ₹1200.
       The store is running a promotion offering a 10% discount 
       on the total subtotal before tax.
       Calculate the final bill after applying 
       the discount and adding a Goods and Services Tax (GST) of 18%
       to the discounted price."*/
    public static void shoppingBill(Scanner sc){
        System.out.print("Enter the dicount: ");
        double discount= sc.nextDouble();
        System.out.print("Enter the GST : ");
        double gst = sc.nextDouble()
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            // Random random = new Random();
            // int numberOfDice = 2; // Example: Rolling two dice
            // int roll = random.nextInt(6) + 1;
            // System.out.println("Die " +  " rolled: " + roll);
            // System.out.println(0.22*6);
            fibonacci(sc);
            //OTPGeneator();
            //volCyn(18.12,23.6);
    }

}
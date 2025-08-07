import java.util.Scanner;
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
        double gst = sc.nextDouble();
        System.out.println("Enter the price: ");
        double price = sc.nextInt();
        double calDiscPricce = price*(discount/100);
        double calGstPrice = calDiscPricce*(gst/100);
        double totalPrice = price - calDiscPricce + calGstPrice;
        System.out.println("Total price could be: "+totalPrice);
    }
    /* 6) Unit Conversion: from Centimeters to Feet and Inches
      (e.g., 180.0) into feet and inches.
      1 inch = 2.54 cm
      1 foot = 12 inches*/
    public static void cmConvertor(Scanner sc){
        System.out.println("Enter the value in centimeters: ");
        int centis = sc.nextInt();
        int feets =  (int) (centis/30.48);
        int inches = feets*12;
        System.out.println("Centimeters into Feet and Inches(~) : " + feets+" "+ inches);
    }
    /*
     * 7) The CGPA Calculator
      A student has completed three courses
      with the following grades and credits:
      Course 1: Grade 9.0 (4 credits)
      Course 2: Grade 8.5 (3 credits)
      Course 3: Grade 9.5 (3 credits)
      The CGPA is calculated as the 
      sum of (Grade * Credits) for all courses,
      divided by the total number of credits. 
     */
    public static void CGPACalc(Scanner sc){
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            // Random random = new Random();
            // int numberOfDice = 2; // Example: Rolling two dice
            // int roll = random.nextInt(6) + 1;
            // System.out.println("Die " +  " rolled: " + roll);
            // System.out.println(0.22*6);
            //fibonacci(sc);
            //OTPGeneator();
            //volCyn(18.12,23.6);
            //shoppingBill(sc);
            cmConvertor(sc);
    }

}
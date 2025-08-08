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
      Course 1: Grade 9.0 (4 credits) == 36  =54+36=90/3=30
      Course 2: Grade 8.5 (3 credits) = 24+1.5 = 25.5 
      Course 3: Grade 9.5 (3 credits) = 27+1.5 =28.5
      The CGPA is calculated as the 
      sum of (Grade * Credits) for all courses,
      divided by the total number of credits. 
     */
    public static void GPACalc(Scanner sc){
        System.out.println("Enter grades of subject1 : ");
        double c1 = sc.nextDouble();
        System.out.println("Now enter grades if subject2: ");
        double c2 =sc.nextDouble();
        System.out.println("Now enter grades if subject3: ");
        double c3 =sc.nextDouble();

        double GPA = ((c1*4)+(c2*3)+(c3*3))/3;

        System.out.println("Total GPA : "+GPA);
    }
    /* 8) The Loan EMI Calculator
      You've taken a loan of ₹2,50,000 at a 10% annual interest rate
      for a tenure of 2 years. 
      Formula: EMI = P * r * (1+r)^n/ (1+r)^n -1
         P = Principal loan amount
         r = Monthly interest rate (annual rate divided by 12)
         n = Total number of months*/
    public static void EMICalc(Scanner sc){
        System.out.print("Enter the Prinicipal Loan Amount: ");
        int pAmount = sc.nextInt();
        System.out.print("Enter your Intereset Rate: ");
        int annualRate = sc.nextInt();
        int rate = (annualRate)/(12*100);
        System.out.print("ENter the tenture in months: ");
        int tenure = sc.nextInt();

        double EMI = (pAmount * rate * Math.pow(1 + rate, tenure))/ (Math.pow(1 + rate, tenure) - 1);

        System.out.println("The EMI has to pay : "+EMI);
    }
    //leftshift
    public static void leftShift(int num,int NOB){
        System.out.println(num<<NOB);
    }
    //rightshift
    public static void rightShift(int num,int NOB){
        System.out.println(num>>NOB);
    }
    /*9) The Time Difference between Cities
      Bangalore is located at longitude 77.59° E,
      and London is at 0.12° W.
      The time difference between two locations
      is approximately 4 minutes per degree of longitude.
      Write a program to calculate the
      total time difference in hours and minutes.
      Hint:
         The difference in longitude is 77.59 - (-0.12).
         Calculate the total time difference in minutes.
         Use integer casting and modulus to convert
          the total minutes into hours and minutes.
         Print the result in the format:
          "The time difference is X hours and Y minutes."*/
    public static void calTimeDiff(){
        double bangLong = 77.59;
        double londLong = 0.12;
        double diffLong = bangLong - (-londLong);
        int timediff = (int)(diffLong*4);
        int hoursDiff = timediff/60;
        int minDiff = timediff%60;
        System.out.println("The time differnce is "+hoursDiff+" and "+minDiff+" minutes.");
        System.out.println("The total time in minutes is: "+timediff);
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
            //cmConvertor(sc);
            //GPACalc(sc);
            //EMICalc(sc);
            //leftShift(5,3);
            //rightShift(100, 2);
            calTimeDiff();
        sc.close();
    }

}
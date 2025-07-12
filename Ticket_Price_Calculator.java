import java.util.Scanner;
class Ticket_Price_Calculator{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your age: ");
    int age=sc.nextInt();
    int price=500;
    if(age<=12){
        System.out.println(price-(price*(50/100.0)));
    }
    else if(age>=60){
        System.out.println(price-(price*(20/100.0)));
    }
    else{
        System.out.println(price);
    }
    }
}
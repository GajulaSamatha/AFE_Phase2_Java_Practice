import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your email address:");
        // String email=sc.nextLine().trim();
        // if(email.contains("@")){
        //     int indOfAt = email.indexOf('@');
        // String domain= email.substring(indOfAt+1);
        // System.out.println("Domain of the email is: " + domain);
        // }
        // else{
        //     System.out.println("Invalid Email Address!!");
        // }
        
        // sc.close();

       import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
   }
}
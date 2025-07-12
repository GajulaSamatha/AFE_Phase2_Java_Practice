import java.util.Scanner;
class checkPassFail{
    public void check(int marks){
        if(marks>=40){
            System.out.println("Pass!!");
        }
        else{
            System.out.println("Fail!!");
        }
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int inpMarks=sc.nextInt();
        checkPassFail obj=new checkPassFail();
        obj.check(inpMarks);
        sc.close();
    }
}
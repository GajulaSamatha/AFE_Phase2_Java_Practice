import java.util.*;
class right_Half_Pyramid{
    public static void main(String[] arg){
        System.out.println("Enter no.of rows you want: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //inverted right half pyramid
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Square of Numbers
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //hollow square
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1){
                    System.out.print("* ");
                }
                else if(j==0 || j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Sum of digits
        System.out.println("Enter a number: ");
        int num = sc.nextInt(),c=0;
        while(num>0){
            num/=10;
            c++;
        }
        System.out.println("No, of digits are: "+c);
    }
}
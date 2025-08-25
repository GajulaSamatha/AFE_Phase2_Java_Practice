import java.util.Scanner;

public class Recursion {

    //for better experinece we comparing a problem with loops and recursion
    //print the numbers from n to 1 -- iterative approach
    public static void printNto1Ite(Scanner sc){
        System.out.println("enter the n:");
        int n= sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
    //print the numbers from n to 1 -- recursive approach
    public static void printNto1Rec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1Rec(n-1);
    }
    //factorial by recursion
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fact = factorial(n-1)*n;
        return fact;
    }
    //display the elements of an array using recursion
    public static void printArrRec(int[] arr,int ind){
        if(ind == -1){
            return;
        }
        System.out.println(arr[ind]);
        printArrRec(arr,ind-1);
    }
    //find largest element using recursion
    public static int findLargeRec(int arr[], int ind, int temp){
        if(ind == -1){
            return arr[temp];
        }
        if(arr[temp]<arr[ind]){
            temp=ind;
        }
        return findLargeRec(arr, ind-1, temp);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //printNto1Ite(sc);
        // int fact = factorial(5);
        // System.out.println("Factorial : "+fact);
        
        int arr[] = {1,2,7,4,5,6};
        //printArrRec(arr,arr.length-1);
        System.out.println(findLargeRec(arr,arr.length-1,arr.length-1));
        
        sc.close();
    }
}

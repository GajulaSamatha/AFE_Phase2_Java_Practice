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
    //recursion function for checking palindrome
    //public static void isPalindrome(String s,int ind, cha)
    //recursion function for finding occurence of target
    // public static void freqTarget()

    //find path in square matrix from 00 to nn
    public static void path(int n, int m,int r, int c,String s){
        if(r==n-1 && c==m-1){
            System.out.println(s);
            return;
        }
        if(r>n||c>m){
            return;
        }
        path(n,m,r+1,c,s+"D");
        path(n,m,r,c+1,s+"R");
    }
    //recursion
    public static int fibbonacci(int n) {
        int n1=0,n2=1,fibb=0;
        for(int i=0;i<n;i++){
            fibb=n1+n2;
            n1=n2;
            n2=fibb;
            System.out.print(fibb+" ");
        }
        return n2;
    }
    //fibbonacci using recursion
    public static int fibb(int n){
        if(n<=1){
            return n;
        }
        return fibb(n-1)+fibb(n-2);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //printNto1Ite(sc);
        // int fact = factorial(5);
        // System.out.println("Factorial : "+fact);
        
        int arr[] = {1,2,7,4,5,6};
        //printArrRec(arr,arr.length-1);
        System.out.println(findLargeRec(arr,arr.length-1,arr.length-1));
        //path(3,3,0,0,"");
        int f=fibbonacci(8);
        System.out.println();
        System.out.println(fibb(4));
        sc.close();
    }
}

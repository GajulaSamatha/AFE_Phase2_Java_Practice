import java.util.Scanner;

public class BitwiseOperations {
    
     //leftshift
    public static void leftShift(int num,int NOB){
        System.out.println(num<<NOB);
    }
    //rightshift
    public static void rightShift(int num,int NOB){
        System.out.println(num>>NOB);
    }
    /*given a number print even or odd */
    public static void evenOrOdd(int n){
        int mask=1;
        int ans=n&mask;
        if(ans==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
    }
    /*swap two numbers without third variable */
    public static void swap(int a, int b){
        System.out.println("before swaping "+"a = "+ a + " b= "+b); 
         a = a^b;
         b= a^b;
         a= a^b;
         System.out.println("after swaping "+"a = "+ a + " b= "+b); 
    }
    //counting no. of 1's 
    public static void countOnes(int n){
        int c=0;
        while(n>0){
            n = n & (n - 1);
            c++;
        }
        System.out.println("The no. of ones are: "+c);
    }
    /*
     * 5. Given a number n and an index i,
   check if the i-th bit is set (i.e., is 1).
     */
    public static void isSet(int n,int ind){
        int mask=1<<ind;
        if((n&mask)==0){
            System.out.println("No, it is not set");
        }
        else{
            System.out.println("Yes, it is set");
        }

    }
    /*
     * 6. *HW Given a number n and an index i, 
   unset the i-th bit (set it to 0).
   not just that this code is toggling the bit
     */
    public static void unSet(int n, int ind){
        int mask = 1<<ind;
        int ans=n^mask;
        System.out.println("BEfore set bit: "+n);
        System.out.println("After set bit: "+ans);
    }
    /*7. Find missing number using bit manipulation */
    public static void findMissingNum(int[] a,int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum=sum^i;
        }
        int sum2=0;
        for(int j=0;j<a.length;j++){
            sum2=sum2^a[j];
        }

        int missNum = sum^sum2;
        System.out.println("The missing number is: "+missNum);
    }
    /*
     * 8. find the position of 1 in a given number which is power of 2
     */
    public static void findPosOfOne(int n){
        if(n%2!=0){
            System.out.println("Given number is not power of 2");
        }
        else{
            int pos=0;
            while(n!=1){ //n>1
                n=n>>1;
                pos++;
            }
            System.out.println("one is at position: "+pos);
        }
    }
    //reversing a string
    public static void ReverseBits(int n) {
      int result=0;
      for (int i = 0; i < 32; i++) {
          result = (result << 1) | (n & 1);
          n >>= 1;
      }
      System.out.println("Reversed bits: " + result);
   }
    public static void main(String[] args) {
        //leftShift(5,3);
        //rightShift(100, 2);
        Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        // evenOrOdd(n);
        //swap(5,10);
        //countOnes(17);
        //isSet(8,3);
        //unSet(10,3);
        //int arr[]= {1,3,6,4,0,5,2,8};
        //findMissingNum(arr,9);
        findPosOfOne(32);
        sc.close();
    }
}

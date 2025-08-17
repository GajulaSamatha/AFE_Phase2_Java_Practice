import java.util.Scanner;
public class SearchAlgos {
    //Linear Search Algo
    public static void LinearSearchAlgo(Scanner sc,int[] arr){
        System.out.println("Enter the target to find..: ");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Yahoo! we found it!!");
                return;
            }
        }
        System.out.println("sorry! we didn't find it!!");

    }

    //count frequencies
    public static void countFreq(Scanner sc,int arr[]){
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int freq=0;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                freq++;
            }
        }
        System.out.println("The frequency of the target is: "+ freq);
    }

    //binary Search
    public static int binarySearch(Scanner sc,int arr[]){
        System.out.println("Enter your target number: ");
        int target=sc.nextInt();
        int f=0,l=arr.length,mid=(f+l)/2;
        while(f<l){
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                l=mid-1;
                mid=(f+l)/2;
            }
            else{
                f=mid+1;
                mid=(f+l)/2;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        
        int[] arr={97,249,35,65,22,367,83,23,13};

        //LinearSearchAlgo(sc,arr);

        countFreq(sc, arr);
        int isFound= binarySearch(sc,arr);
        if(isFound==-1){
            System.out.println("Entered number is not found!!");
        }
        else{
            System.out.println("Entered number is found!! at "+ isFound);
        }

        sc.close();
    }
}

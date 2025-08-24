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
    //search in matrix
    public static void searchInMatrix(){

    }
    //find the first and last occurence of a key element
    public static void freqKey(Scanner sc){
        int arr[]={2,4,4,5,6,7,7,7,7,8,9,9,9,9};
        System.out.println("Enter your key: ");
        int key = sc.nextInt();
        int l=0,h=arr.length-1,mid=(l+h)/2;
        int ans[]=new int[2];
        while(l<h){
            if(arr[mid]==key){
                arr[0]=mid;arr[1]=mid;
                for(int i=mid-1;i>=0;i++){
                    if(arr[i]==key){
                        arr[0]=i;
                    }
                    else{
                        break;
                    }
                }
                for(int j=mid+1;j<=h;j++){
                    if(arr[j]==key){
                        arr[1]=j;
                    }
                    else{
                        break;
                    }
                }
            }
            else if(arr[mid]<key){
                l=mid+1;
                mid=(l+h)/2;
            }
            else{
                h=mid-1;
                mid=(l+h)/2;
            }
        }
        System.out.println(ans);
    }
    //finding missing number from the sorted arry
    public static void FindMissingNo(int[] arr) {  // find missing no between 1 to N.
        int low = 0, high = arr.length - 1, missing = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == mid + 1) {
                low = mid + 1;
            }
            else {
                missing = arr[mid] - 1;
                high = mid - 1;
            }
        }
        System.out.println("Missing Number = " + missing);
    }
    //finding the floor in an sorted array
    public static void findFloor(Scanner sc){
        int arr[]={2,4,6,7,8,9};
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        int l=0,h=arr.length-1,mid=(l+h)/2;
        int floorInd=-1;
        while(l<=h){
            if(arr[mid]==target){
                System.out.println("Floor found at "+mid);
                break;
            }
            else if(arr[mid]<target){
                floorInd=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        System.out.println("Floor found at "+floorInd);
    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        
        int[] arr={97,249,35,65,22,367,83,23,13};

        //LinearSearchAlgo(sc,arr);

        // countFreq(sc, arr);
        // int isFound= binarySearch(sc,arr);
        // if(isFound==-1){
        //     System.out.println("Entered number is not found!!");
        // }
        // else{
        //     System.out.println("Entered number is found!! at "+ isFound);
        // }

        //freqKey(sc);
        findFloor(sc);
        sc.close();
    }
}

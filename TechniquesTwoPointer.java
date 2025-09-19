public class TechniquesTwoPointer {
    public  static void findTarget(int[] arr,int t){
        int l=0,r=arr.length-1;
        while(l<r){
            int sum= arr[l]+arr[r];
            if(sum==t){
                System.out.println("The indecies of the elements: "+ (l+1)+" "+(r+1));
                return;
            }
            else if(sum>t){
                r--;
            }
            else{
                l++;
            }
        }
        System.out.println("There are no indecies the elements: ");
    }
    //return triplets equal to 0
    public static void triplets(int[] arr){
        int i=0,j=0,k=arr.length-1;
        //Arrays.sort(arr);
        for(i=0;i<arr.length;i++){
            j=i+1;
            while(j<k){
                int sum=arr[k]+arr[j];
                int val=(arr[i]*(-1));
                if(sum==val){
                    System.out.println("The indices are: "+i+" "+j+" "+k);return;
                }
                else if(sum<val){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,5,6,-4,-4,9,-3,-6,0};
        triplets(arr);
    }
}

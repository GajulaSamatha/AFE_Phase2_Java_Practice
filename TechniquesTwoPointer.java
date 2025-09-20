import java.util.Arrays;
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
        Arrays.sort(arr);
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
    /*
     * save the people who stucked in the middle of the ocean
     * we have few boats which can carry a fixed weightage.
     * we have an array of people with some weights
     * so now find how many needs to save the people.
     * we can atmost two people until their weightage reaches the limit.
     * NOTE: the persons who are more than capability of boats can be ignored.
     */
    public static void FindBoats(int[] arr,int l){
        int i=0,j=arr.length-1,c=0;
        Arrays.sort(arr);
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum>l){
                j--;
            }
            else if(arr[i]==l){
                c++;i++;
            }
            else if(arr[j]==l){
                c++;j--;
            }
            if(sum<=l){
                i++;c++;
            }
        }
        System.out.println("No. of boats: "+c);
    }
    /*
     * fast and slow pointers or reader and writer pointers
     * Remove duplicates from the array inplace
     */
    public static void removeDuplicates(int[] arr){
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
            i++;
        }
        for(int m=0;m<=j;m++){
            System.out.println(arr[m]+" ");
        }
    }
    public static void removeVal(int[] arr,int val){
        int i=0,j=0,c=0;
        while(i<arr.length && j<arr.length){
            if(arr[i]!=val){
                arr[j]=arr[i];
                j++;c++;
            }
            i++;
        }
        System.out.println(c);
    }
    public static void main(String[] args){
        int[] arr = {2,1,3,1,2};
        //triplets(arr);
        //FindBoats(arr,3);
        //removeDuplicates(arr);
        removeVal(arr,1);
    }
}

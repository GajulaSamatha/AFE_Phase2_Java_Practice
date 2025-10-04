public class slidingWindow {
    //sliding window calculate consecutive sum of k elements
    public static void calConsSum(int[] arr,int k){
        int sum=0,maxSum=0,l=0,r=k-1;
        for(int i=0;i<arr.length;i++){
            if(i<k){
                sum+=arr[i];
                continue;
            }
            r=r+1;
            System.out.println("Sum so far:"+sum+" "+(sum+arr[i]-arr[l]));
            sum=(sum+arr[i]-arr[l]);
            maxSum=Math.max(maxSum,sum);
            System.out.println("Sum so far:"+sum+" "+(sum+arr[i]-arr[l]));
            l=l+1;
        }
        System.out.println("Max Average:"+maxSum/k);//8 9
    }
    //two sum II- Input array is sorted
    public int[] twoSum(int[] numbers, int target) {
        int f=0,l=numbers.length-1,sum=0;
        int[] ans= new int[2];
        while(f<l){
            sum= numbers[f]+numbers[l];
            if(sum == target){
                ans[0]=f+1;
                ans[1]=l+1;
                break;
            }
            else if(sum<target){
                f++;
            }
            else{
                l--;
            }
        }
        return ans;
    }
    // palindrome  
    public static void pal(String s){
        int f=0,l=s.length()-1;
        while(f<l){
            if(!Character.isLetterOrDigit(s.charAt(f))){
                f++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(l))){
                l--;
            }
            else if(s.charAt(f)==s.charAt(l)){
                f++;l--;
            }
            else{
                System.out.println("This is not a palindrome!!");
                return;
            }
        }
        System.out.println("This is a palindrome!!");
    }
    
    
 public int removeDuplicates(int[] arr) {
        int max=0,i=0,j=0;
        while(i<arr.length){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
            i++;
        }
        return j+1;
    }
    public static void main(String argd[]){
        int[] arr= { 2,1,5,0,0,12};
        //calConsSum(arr,3);
        pal("sam1mus");
    }
}

public class Assesment2 {

    /*
     * comparing arrays 
     */
    public static void compArr(){
        int[] arr1={0,1,2,3};
        int[] arr2 = {0,1,2,3};
        if(arr1 == arr2){
            System.out.println("equal arr1=arr2");
        }
        System.out.println("not equal arr1=arr2");
    }
    //second largest element in the array
    public int secLarg(int[] arr){
        int firLarge=Integer.MIN_VALUE,secLarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firLarge){
                secLarge=firLarge;
                firLarge=arr[i];
            }
            else if(arr[i]>secLarge && firLarge>arr[i]){
                secLarge=arr[i];
            }
        }
        if(secLarge<0){
            return -1;
        }
        return secLarge;
    }
    /*rotate by n the array */
    public static void rotateArr(int[] arr,int n){
        int mid=(arr.length-2)-1;
        int l=arr.length;
        for(int i=0;i<l;i++){
            if(i<=mid){
                arr[i+n-1]=arr[i];
            }
            else{
                arr[(i+n)%l]=arr[i];
            }
        }
        for(int i=0;i<l;i++){
            System.out.println(arr[i]+" ");
        }
    }
    /*move all zeros to the last in an array 
     * we need to keep the order as it is but move the zeroes to the end, 
     * so here we need to take care of the non-zero values at last we can mark remainaing elements to zero
     * so to swift elements to front we need to maintain a pointer that keeps track of the position of an 
     * element as if there are no zeroes upto that position.
     *  lets take [5 8 0 4 9 0 2 0 3]
     * now lets initialise 'j' to 0. the pointer that track the position .
     * now we need to iterate through the array 
     * at index 0 we have found a non-zero value so update array[j] with array[0] value === array[0] = array[0]
     *  then update j to j+1
     * now at index 1, we have found again a non-zero value so update array[j] with array[1] value === array[1] = array[1] 
     *  after updation j++
     * now at index 2, we have found a zero, we don't care , just continue;
     *  at this iteraation j didn't updated so it is still at index 2
     * now at index 3, we have found non zero value so update j, array[j] with array[3] value === array[2] = array[3]
     * here we have eleminated the non zero value and moved the element to the same position as if there are no zeros
     * in this way all non-zero elements move forward
     * and finally we need to make all remaining values to zero -- j will track that position too
     * 
    */
    public static void moveAllZeros(int[] a){

        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[j]=a[i];
                j++;
            }
        }
        while(j<a.length){
            a[j]=0;
            j++;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        //compArr();
        int arr[] = new int[]{2,4,6,8,7,9};
        int[] a = {5,8,0,4,9,0,2,0,3};
        //rotateArr(arr,3);
        moveAllZeros(a);
    }
}

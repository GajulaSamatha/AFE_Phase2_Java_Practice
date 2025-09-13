public class SortingAlgos {
    //bubble sort
    /*
     * by keeping a.length - 1 in i loop will reduce one extra iteration, as n-1 elements fits in their corresponding places
     * then automatically last element will be in its place.
     * by placing a.length-i will reduce extra iteration from checking again with sorted elements
     */
    public static void bubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    //selection sort
    /*
     * assume an element as minimum and go through the array to check whether what we assumed is true or not.
     * then at last we came with minimum and swap it with corresponding index element
     */
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min == i){
                System.out.println("No Swap!!");
            }
            else{
                int t= arr[min];
                arr[min]=arr[i];
                arr[i]=t;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    /*
     * insertion sort
     * so we are supposed to insert the element at its correst place.
     * so we took an element and check with elements before to it backwards one by one 
     * where we find the element is greater than its back element we insert there, 
     * if we found an element that is greater than the current element we just shift it to next index
     * to do so we also need to keep the current element in a variable
     */
    public static void InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];int j=i-1;
            while(j>=0){
                if(arr[i]<arr[j]){
                    arr[j+1]=arr[j];j--;
                }
                else{
                    break;
                }
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] a={2,8,3,6,9,5,3};
        //bubbleSort(a);System.out.println();
        // selectionSort(a);
        InsertionSort(a);
    }
}

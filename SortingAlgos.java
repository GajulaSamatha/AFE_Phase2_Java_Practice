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
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=0;
            for(int j=i;j<arr.length;j++){
                if(arr[min]<arr[i]){
                    min=i;
                }
            }
            int t= arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] a={2,8,3,6,9,5,0};
        bubbleSort(a);System.out.println();
        selectionSort(a);
    }
}

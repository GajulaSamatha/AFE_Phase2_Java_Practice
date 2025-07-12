import java.util.Scanner;
class Arrays2{
    //given array of integers and print all its elements
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //calculate sum of all elements
    public int sumOfElements(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    //find the largest element
    public int findLargest(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        else if(arr.length==2){
            return arr[0]>arr[1]?arr[0]:arr[1];
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //check an element present in the array
    public int indexOf(int tar,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
    //return count of an element present in the array
    public int countOf(int tar,int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                c++;
            }
        }
        return c;
    }
     //return count of an element present in the array
    public int above(int tar,double[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>tar){
                c++;
            }
        }
        return c;
    }

    public static void main(String args[]){
        Arrays2 obj = new Arrays2();

        int arr1[] = {1,2,3,4,5};

        Scanner sc=new Scanner(System.in);

        obj.printArray(arr1);

        int sum=obj.sumOfElements(arr1);
        System.out.println("Sum is:"+sum);

        int max=obj.findLargest(arr1);
        System.out.println("Largest element is:"+max);

        System.out.println("Now enter the target to find index of it: ");
        int target=sc.nextInt();
        int index=obj.indexOf(target,arr1);
        if(index<0){
            System.out.println(target+" is not found!!");
        }
        else
            System.out.println("Index of "+target+" is: "+index);

        System.out.println("Now enter the target to count : ");
        int element=sc.nextInt();
        int count = obj.countOf(element,arr1);
        System.out.println("count of "+element+" is: "+count);

        double temperatures[] = {29.4,24.5,29.5,23.4,28.9,30.9};
        int above29 = obj.above(29,temperatures);
        System.out.println("No. of Temperatures above 29 is: "+above29);
    }
}
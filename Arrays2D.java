class Arrays2D{

    //print the given 2D array
    public void print2DArr(int[][] arr2d){
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
    }
    /*
    * Sum of all elements in the 2d array
    * i -- represents no. of rows
    * j -- represents no. of columns
    * so j should iterate all the columns of the i which iterate all the rows
    */
    public void sumOfElements(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum :"+sum);
    }
    /**
     * find the largest element from the 2d array
     * take a variable to maintain the largest value upto where the cursor is
     * it is better to initialise the large variable to the arr[0][0]
     * then it will work for negative numbers also
     */
    public void largest(int[][] arr){
        int large=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>large){
                    large=arr[i][j];
                }
            }
        }
        System.out.println("Largest element is: "+large);
    }
    /**
     * print the sum of all elements in each row
     */
    public void sumOfEachRow(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int large=arr[i][0];
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>large){
                    large=arr[i][j];
                }
            }
            System.out.println("Sum of each row is: "+large);
        }
        
    }
    /* 12)find if there exists a pair of elements in the array that add up to the target sum.*/
    public void findPair(int target,int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int diff=target-arr[i][j];
                for(int k=0;k<arr.length;k++){
                    for(int l=0;l<arr.length;l++){
                        if(diff==arr[k][l]){
                            System.out.println("Pair exists!!");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Pair doesn't exists!!");
    }
    /* 10)Given an array with duplicate elements, create a new array with only unique elements.*/
    public void conToSet(int[][] arr){
        int[][] setArr = new int[arr.length][arr[0].length];int setI=0,setJ=0;
        setArr[0][0]=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                int tar=arr[i][j];boolean isPresent=false;
                for(int k=0;k<setArr.length;k++){
                    for(int l=1;l<setArr[k].length;l++){
                        if(tar==arr[k][l]){
                            isPresent=true;
                        }
                    }
                }
                if(isPresent){
                    continue;
                }
                else{
                    setArr[setI][setJ]=tar;
                    if(setJ==setArr[setI].length-1){
                        setJ=0;
                        setI++;
                    }
                }
            }
        }
        for(int i=0;i<setArr.length;i++){
            for(int j=0;j<setArr[i].length;j++){
                System.out.print(setArr[i][j]+" ");
            }
            System.out.println();
        }
    }
/* 11)Write a program to rotate an array to the left by one position.
    temp=00  3 3
    00  01  02              01  02  10  
    10  11  12      ==>     11  12  20
    20  21  22              21  22  00
*/
public void rotateLeft(int arr[][]){
    Arrays2D objTemp=new Arrays2D();
    int temp=arr[0][0];
    int i=0,j=1;
    while(i<arr.length && j<arr[i].length){
        if(i==arr.length-1 && j==arr[i].length-1){
            arr[i][j]=temp;
        }
        if(j==arr[i].length-1){
            arr[i][j-1] = arr[i][j];
            i++;j=0;
        }
        else if(j==0){
            arr[i-1][arr[i].length-1] = arr[i][j];
        }
        else{
            arr[i][j-1] = arr[i][j];
            j++;
        }
        objTemp.print2DArr(arr);
    }
}
/*16)Given an array of integers, count the number of even and odd numbers in it.*/
public void countOddEven(int[][] arr){
    int evenC=0,oddC=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]%2==0){
                evenC++;
            }
            else{
                oddC++;
            }
        }
    }
    System.out.println("Even Count: "+ evenC);
    System.out.println("Odd Count: "+oddC);
}
/*sum of two matrices*/
public void matrixSum(int[][] a,int[][]b){
    int[][] sumMat = new int[a.length][a[0].length];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            sumMat[i][j]=a[i][j]+b[i][j];
        }
    }
    for(int i=0;i<sumMat.length;i++){
            for(int j=0;j<sumMat[i].length;j++){
                System.out.print(sumMat[i][j]+" ");
            }
            System.out.println();
        }
}
/* 15)Count the frequency of each element in an array.*/
public void freqCount(int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            int count=0;
            for(int a=0;a<arr.length;a++){
                for(int b=0;b<arr[a].length;b++){
                    if(arr[a][b]==arr[i][j]){
                        count++;
                    }
                }
            }
            System.out.println("Frequency Count of "+arr[i][j]+" is: "+count);
        }
    }
}
/* 14)Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing.*/
void findMissNum(int[][] arr){
    for(int i=0;i<=arr.length*arr[0].length;i++){
        boolean isThere=false;
        for(int j=0;j<arr.length;j++){
            for(int k=0;k<arr[j].length;k++){
                if(arr[j][k]==i){
                    isThere=true;
                }
            }
        }
        if(isThere==false){
            System.out.println("Missing number is: "+i);
            break;
        }
    }

}
    public static void main(String args[]){
        int arr2D[][] = {{1,2,3},{4,5,4},{1,8,3}};
         int arr22D[][] = {{1,2,3},{4,5,6},{0,8,9}};
        Arrays2D obj = new Arrays2D();
        // obj.print2DArr(arr2D);
        // obj.sumOfElements(arr2D);
        obj.largest(arr2D);
        // obj.sumOfEachRow(arr2D);
        // obj.findPair(12,arr2D);
        // obj.conToSet(arr2D);
        // // obj.rotateLeft(arr2D);
        // // obj.print2DArr(arr2D);
        // obj.countOddEven(arr2D);
        // obj.matrixSum(arr2D,arr22D);
        // obj.freqCount(arr2D);
        obj.findMissNum(arr22D);
    }
}
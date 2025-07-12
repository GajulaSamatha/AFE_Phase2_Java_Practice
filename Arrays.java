import java.util.Scanner;
class Arrays{
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the marks: ");
    //     int[] marksOfTen = new int[10] ;
    //     for(int i=0;i<marksOfTen.length;i++){
    //         marksOfTen[i]=sc.nextInt();
    //     }
    //     int s=0,min=0;
    //     for(int i=0;i<marksOfTen.length;i++){
    //         s+=marksOfTen[i];
    //         if(marksOfTen[min]>marksOfTen[i]){
    //             min=i;
    //         }
    //     }
    //     System.out.println("Average marks: "+s/marksOfTen.length);
    //     System.out.print("Smallest number is: "+marksOfTen[min]);

        
    //     sc.close();
    // }
    public static int GetAverageMarks (int[] marksArray){
        
        int totalMarks = 0;//stores in stack
        for (int i = 0 ; i < marksArray.length; i++ ){
            totalMarks = totalMarks + marksArray[i];
        }
      
        int averageMarks = totalMarks/marksArray.length;

        return averageMarks;
    }

     public static int GetLowestMarks (int[] marksArray){
        int lowest = marksArray[0];
       
        for( int i=1;i<marksArray.length;i++){
            if(lowest > marksArray[i]){
                lowest=marksArray[i];
            }
        }
        return lowest;
     }

     public static int GetThirdLowestMarks (int[] marksArray){
        int flowest = marksArray[0],slowest,tlowest; 
       
        for( int i=1;i<marksArray.length;i++){
            if(lowest > marksArray[i]){
                lowest=marksArray[i];
            }
        }
        return lowest;
     }



    public static void main(String[] args) {

       /*
        * 1. Create an array that can store marks of 10 students, you can intialize the marks to some value
        * 2. Get the input from the user and store the marks in this array.
        * 3. Print the average marks
        * 4. Print the lowest mark
        * 5. Print the 3rd lowest mark
        */

     
        int[] studentMarks = new int[10];//stores in heap
        Scanner sc = new Scanner(System.in);
        System.out.println("--Enter the marks of the students --");
        for(int i=0;i<studentMarks.length;i++){
            System.out.print("Enter Student-" + i + " marks: ");
            studentMarks[i] = sc.nextInt();
        }

        // 3. Get  the average marks
        int avg = GetAverageMarks(studentMarks);
        System.out.println("The average marks is = " + avg);

        // 4. Print the lowerst mark
        int low = GetLowestMarks(studentMarks);
        System.out.println("The Lowest marks is = " + low);
 
        



        sc.close();
    }
  


//}
}
import java.util.*;
class calculate_Rectangle_Area{
    public int calculate_Area(int width,int height){
        return width*height;
    }
    public static void  main(String[] ar){
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter width and height seperate by a space: ");
        int w=sc.nextInt();
        int h = sc.nextInt();
        claculate_Rectangle_Area obj =new claculate_Rectangle_Area();
        int a = obj.calculate_Area(w,h);
        System.out.println("Area of the rectangle is: "+a);
        sc.close();
    }
}
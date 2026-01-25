public class classObject {
    public static void main(String[] args) {
        /*Book b1=new Book();
        b1.title="Book1";
        b1.author="A1";
        b1.price=100;

        Book b2=new Book();
        b2.title="Book2";
        b2.author="A2";
        b2.price=200;

        b1.display();
        b2.display();

        //updating
        b1.price=200;
        b2.price=100;

        b1.display();
        b2.display();

        Rectangle rect=new Rectangle(3,4);
        rect.area(3,4);
        rect.perimeter(3,4);*/

        StudentGrade sg1=new StudentGrade(101, "sam");
        StudentGrade sg2=new StudentGrade(101, "sami");

        sg1.setSubject1Marks(70);
        sg1.setSubject2Marks(98);
        sg1.setSubject3Marks(34);

        sg2.setSubject1Marks(80);
        sg2.setSubject2Marks(88);
        sg2.setSubject3Marks(47);

        
        sg2.setSubject3Marks(-47);

        sg1.display();

        sg2.display(true);
    }
}
class Book{
    String title;
    String author;
    int price;
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }
}
class Rectangle{
    int length;
    int width;
    Rectangle(int l,int b){
        this.length=l;
        this.width=b;
    }
    public void area(int l,int b){
        System.out.println(l*b);
    }
    public void perimeter(int l,int b){
        System.out.println(2*(l+b));
    }
}
class StudentGrade{
    private String studentName;
    private int rollNumber;
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    StudentGrade(int rollNumber,String name){
        this.rollNumber=rollNumber;
        this.studentName=name;
        this.subject1Marks=0;
        this.subject2Marks=0;
        this.subject3Marks=0;
        
    }

    public void setSubject1Marks(int marks){
        if(marks>=0 && marks<=100){
            this.subject1Marks=marks;
        }
        else{
            System.out.println("Marks are out of hundred!!");
        }
    }
    public void setSubject2Marks(int marks){
        if(marks>=0 && marks<=100){
            this.subject2Marks=marks;
        }
        else{
            System.out.println("Marks are out of hundred!!");
        }
    }
    public void setSubject3Marks(int marks){
        if(marks>=0 && marks<=100){
            this.subject3Marks=marks;
        }
        else{
            System.out.println("Marks are out of hundred!!");
        }
    }
    public int getSubject1Marks(){
        return this.subject1Marks;
    }
    public int getSubject2Marks(){
        return this.subject2Marks;
    }
    public int getSubject3Marks(){
        return this.subject3Marks;
    }
    public String getName(){
        return this.studentName;
    }
    public int getRollNumber(){
        return this.rollNumber;
    }
    public int average(){
        return (this.subject1Marks + this.subject2Marks + this.subject3Marks)/3;
    }
    public String getGrade(){
        int marks= this.subject1Marks + this.subject2Marks + this.subject3Marks;
        if(marks>=90) return "A+";
        else if(marks>=80) return "A";
        else if(marks>=70) return "B";
        else if(marks>=60) return "C";
        else if(marks>=50) return "D";
        else return "F";
    }
    public void display(){
        System.out.println("Roll Number: "+this.rollNumber);
        System.out.println("Name : "+this.studentName);
        System.out.println("Grade : "+this.getGrade());
    }
    public void display(boolean showMarks){
        System.out.println("Roll Number: "+this.rollNumber);
        System.out.println("Name : "+this.studentName);
        if(showMarks){
        System.out.println("Subject1 : "+this.subject1Marks);
        System.out.println("Subject2 : "+this.subject2Marks);
        System.out.println("Subject3 : "+this.subject3Marks);
        }
        System.out.println("Grade : "+this.getGrade());
    }
}

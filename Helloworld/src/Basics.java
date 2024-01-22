import java.lang.reflect.Array;
import java.util.Arrays;

public class Basics {
    public static void main(String args[]) {

        System.out.println("this is new message");
        Student[] students = new Student[5];

        //declare reference to the object

        Student tharishith = new Student();

        tharishith.changeName("Purini ");
        Student random = new Student();
        System.out.println(tharishith.rollno);
        System.out.println(tharishith.marks);


        System.out.println(random.rollno);
        System.out.println(random.marks);


        Student one = new Student();
        Student two = one;
        one.name = "same same";

        System.out.println(two.name);
    }

}

class Student{
    int rollno = 76;
    String name;

    float marks = 90;



    void greeting(){
        System.out.println("my name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }
    Student(){
        this.marks = 71;
        this.name = "Tharishith Reddy";
        this.rollno = 45;
    }

    Student (int roll,String name,float marks){
        this.rollno = roll;
        this.name = name;
        this.marks = marks;
    }

}


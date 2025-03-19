import java.util.ArrayList;

class Student {
    String name;
    int marks;

    // Constructor to initialize Student object
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Ques6 {
    public static void main(String[] args) {
       // Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

         // Add 5 Student objects to the list
        students.add(new Student("inshafa", 85));
        students.add(new Student("poos", 78));
        students.add(new Student("akee", 90));
        students.add(new Student("fahm", 88));
        students.add(new Student("hamee", 76));

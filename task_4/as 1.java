
import java.util.Scanner;
//create class student
class Student {
    int rollno;
    String name;
    int age;
    String course;

    public Student(int rollno, String name, int age, String course) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
//create exception class for InvalidAge
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
//create exception class for Invalidname
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}
public  class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //create try catch statement
        try {
            System.out.print("Enter Roll No: ");
            int rollno = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            validateName(name);
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            validateAge(age);
            System.out.print("Enter Course: ");
            String course = sc.next();
            //create object for class
            Student student = new Student(rollno, name, age, course);
            //print student details
            System.out.println("student details is :"+student.rollno+" "+student.name+" "+student.age+" "+student.course);
        } catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    //method to check name valid or not
    private static void validateName(String name) throws InvalidNameException {
        if (!name.matches("[a-zA-Z]+")) {
            throw new InvalidNameException("Name should only contain letters and cannot be empty.");
        }
    }
    //method to check age valid or not
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 15 || age > 21) {
            throw new InvalidAgeException("Age must be between 15 and 21.");
        }
    }
}

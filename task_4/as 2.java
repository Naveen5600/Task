import java.util.Scanner;
//create class voter
class Voter {
    int voterId;
    String name;
    int age;
    public Voter(int voterId, String name, int age) {
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
//method to display 
    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
//create exception class for InvalidAge
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public  class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //accept user information
        System.out.println("Enter voter ID : ");
        int voterId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter voter name : ");
        String name = sc.nextLine();
        int age = 0;
        //create try catch statement
        try {
            System.out.println("Enter voter age : ");
            age = sc.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        //create object for voter class
        Voter voter = new Voter(voterId, name, age);
        voter.display();
    }
    //method to check age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 18) {
            throw new InvalidAgeException("Age must be greater than or equal to 18.");
        }
    }
}






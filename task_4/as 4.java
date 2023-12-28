import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//create class student
class student {
    //create map 
    private static Map<String, Integer> student = new HashMap<>();
//create add method
    public void add() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        String name = userInput.nextLine();
        System.out.println("Enter the student's grade: ");
        int grades = userInput.nextInt();

        student.put(name, grades);
    }
//create remove method
    public void remove(String name) {
        student.remove(name);
    }
//create display method
    public void display() {
        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            System.out.println("student details"+" "+entry.getKey() + " " + entry.getValue());
        }
        System.out.println(" ");

    }
}
public  class Main {
    public static void main(String[] args) {
        //create object for class
        student object = new student();
        Scanner user = new Scanner(System.in);
//create while loop
        while (true) {
            System.out.println("Enter what action you perform like\n 1. add\n 2. remove\n 3. display\n 4. exit");
            String value = user.next();
 //create switch to accept user choice
            switch (value) {
                case "add":
                    object.add();
                    break;

                case "remove":
                    System.out.println("Enter the name to remove: ");
                    String removeValue = user.nextLine();
                    object.remove(removeValue);
                    break;

                case "display":
                    object.display();
                    break;

                case "exit":
                    System.out.println("Exiting the program.");
                   
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}








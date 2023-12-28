import java.util.*;
public  class Main {
    public static void main(String[] args) {
        // Create a list of student names
        List<String> studentNames = Arrays.asList("arun", "mani", "balu", "kannan", "tamil", "asta", "kumar", "Angel");
        // Use the Stream API with lambda expression
        List<String> aStudents = studentNames.stream().filter(name -> name.toLowerCase().startsWith("a")).toList();
        // print the name with a
        System.out.println("Students whose names start with 'a':");
        for (String student:aStudents) {
            System.out.println(student);
        }
    }
}








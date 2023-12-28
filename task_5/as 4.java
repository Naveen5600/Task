import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public  class Main {
    public static void main(String[] args) {

        //accept the user information
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateString = scanner.next();
      //use try catch statement to handle exception
        try {
            LocalDate birthdate = LocalDate.parse(birthdateString);
            LocalDate currentDate = LocalDate.now();
            //calculate age
            Period age = Period.between(birthdate, currentDate);
            //print age
            System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
        } catch (Exception e) {
            // Handle invalid input (non-conforming date format)
            System.out.println("Invalid date format. Please use the yyyy-mm-dd format.");
        }
    }
}








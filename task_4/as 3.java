import java.util.Scanner;
public  class Main {
    public static void main(String[] args) {
        //create array weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);
        //accept user input
        System.out.println("Enter the index position to check the weekdays : ");
        int value = sc.nextInt();
        //create try catch statement and handle exception
        try {
            System.out.println("Day at index " + value + ": " + weekdays[value]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index " + value + " is out of bounds and index"  + value + "value your array is null");
        }
    }
}


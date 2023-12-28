import java.util.Scanner;
import java.util.List;
import java.util.stream.Stream;
public  class Main {
    public static void main(String[] args)
    {
        //create Stream with values
        Stream<String> names = Stream.of("aBc", "d", "ef");
        //convert lowercase string to uppercase string
        List<String> uppercaseList = names.map(String::toUpperCase).toList();
        System.out.println("original list is: " + List.of("aBc", "d", "ef"));
        //print output
        System.out.println("uppercase list is : " + uppercaseList);

    }
}
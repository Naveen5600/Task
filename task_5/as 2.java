import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public  class Main {
    public static void main(String[] args)
    {
        //create list with values
        List<String> stringList = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        // Filter strings
        List<String> nonEmpty = stringList.stream().filter(s -> !s.isEmpty()).toList();
         System.out.println("original list is : " + stringList);
         //print output
        System.out.println("non-empty strings list is : " + nonEmpty);
    }
}
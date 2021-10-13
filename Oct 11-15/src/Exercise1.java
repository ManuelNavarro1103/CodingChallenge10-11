import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {

    public static boolean rotateCheck(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        if ((s1 + s1).indexOf(s2) != -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");

        //Exercise 1
        System.out.println(" ");
        System.out.println("Exercise 1:");
        System.out.println(" ");

        System.out.println("Using while loop:");
        Iterator iterator = numbers.entrySet().iterator();
        while (iterator.hasNext()) {

            Map.Entry<Integer, String> map = (Map.Entry<Integer, String>) iterator.next();
            System.out.println(map.getKey() + " = " +map.getValue());
        }

        System.out.println("");
        System.out.println("Using enhanced for loop: ");
        for (Map.Entry<Integer, String> map : numbers.entrySet()) {

            System.out.println(map.getKey() + " = " +map.getValue());
        }

        System.out.println(" ");
        //Exercise 2
        System.out.println("Exercise 2");
        System.out.println(" ");
        System.out.println("Please enter String 1");
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        System.out.println("Please enter String 2");
        String string2 = scan.nextLine();

        if (rotateCheck(string1, string2) == true) {
            System.out.println(" ");
            System.out.println("Strings are rotations of each other.");
        }
        else {
            System.out.println(" ");
            System.out.println("Strings are not rotations of each other.");
        }
    }

}

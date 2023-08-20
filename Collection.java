import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Collection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        names.add("Yousuf");
        names.add("Hasan");
        names.add("Riyad");
        names.add("Shadow");
        names.add("Light");

        System.out.println("Array size: " + names.size());
        names.remove("Riyad");
        System.out.println(names.get(0));


        System.out.println("Enter a name: ");
        String checkName = scanner.next();
        if (names.contains(checkName)){
            System.out.println(checkName + " is store in the array.");
        } else {
            System.out.println(checkName + " is not store in array.");
        }

    }
}
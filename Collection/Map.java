import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.Map<String, String> email_List = new HashMap<>();

        email_List.put("Yousuf", "yousufh291@gmail.com");
        email_List.put("Hasan", "yousuf35-671@diu.edu.bd");
        email_List.put("Riyad", "personal@gmail.com");

        System.out.println("\nLength of " + email_List.size());
//        System.out.println("Email: " + email_List.get("Riyad"));
//        email_List.remove("Riyad");

        while (true) {
            System.out.print("\nEnter a name for checking his email: ");
            String check_Email = scanner.next();
            if (email_List.containsKey(check_Email)) {
                System.out.println(check_Email + "'s email is: " + email_List.get(check_Email));
            } else {
                System.out.println(check_Email + " is not in the list.");
            }
        }
    }
}

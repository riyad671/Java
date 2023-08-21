import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Yousuf");
        names.add("Hasan");
        names.add("Riyad");
        names.add("Shadow");
        names.add("Light");

        System.out.println("Array size: " + names.size());
//        names.remove("Riyad");
//        System.out.println(names.get(0));

        System.out.println("\nAvailable name: ");
        for (int i=0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.print("\nEnter a name for finding info: ");
        String checkName = scanner.next();
        if (names.contains(checkName)){
            System.out.println(checkName + " are store in the array.\n");
        } else {
            System.out.println(checkName + " are not store in array.\n");
        }

        // Array for student
        java.util.ArrayList<Student> students = new java.util.ArrayList<>();

        students.add(new Student("YHR",671));
        students.add(new Student("JFJ", 2321));
        students.add(new Student("YJ", 534));

        // For each loop
        for (Student student:students){
            System.out.println("Name: " + student.getName() +" ; ID: " + student.getId());
        }

    }
}
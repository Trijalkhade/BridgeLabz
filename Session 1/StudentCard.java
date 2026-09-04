import java.util.*;
class StudentCard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scn.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scn.nextLine());
        System.out.println("Enter your PRN: ");
        String prn = scn.nextLine();
        System.out.println("Enter your Division: ");
        String div = scn.next();

        System.out.println("=".repeat(8) + "Student Card" + "=".repeat(8));
        System.out.printf("| Name: %s%n", name , " |");
        System.out.printf("| Age : %d%n", age , " |");
        System.out.printf("| PRN : %s%n", prn , " |");
        System.out.printf("| Div : %s%n", div , " |");
        System.out.println("=".repeat(8) + "=".repeat(12) + "=".repeat(8));
    }
}
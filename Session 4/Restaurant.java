import java.util.*;

public class Restaurant {
    static void menu() {
        System.out.println();
        System.out.println("1. Burger Rs. 120");
        System.out.println("2. Pizza Rs. 250");
        System.out.println("3. Pasta Rs. 180");
        System.out.println("4. exit");
        System.out.print("Enter your choice: ");
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int choice;
        do {
            menu();
            choice = sc.nextInt();
            char c;
            switch(choice) {
                case 1:
                    total += 120;
                    System.out.print("Do you want to continue? ");
                    c = sc.next().charAt(0);
                    if (c == 'n' || c == 'N') choice = 4;
                    break;
                case 2:
                    total += 250;
                    System.out.print("Do you want to continue? ");
                    c = sc.next().charAt(0);
                    if (c == 'n' || c == 'N') choice = 4;
                    break;
                case 3:
                    total += 180;
                    System.out.print("Do you want to continue? ");
                    c = sc.next().charAt(0);
                    if (c == 'n' || c == 'N') choice = 4;
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter valid choice!");
            }
        } while (choice != 4);
        System.out.println();
        System.out.println("Total bill: " + (1.05*total));
        sc.close();
    }
}
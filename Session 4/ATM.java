import java.util.*;
class ATM {
    public static void main(String[] args) {
        final int correct_pin = 1234;
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        for (int i= 0; i < 3; i++) {
            System.out.print("Enter your pin: ");
            int pin = sc.nextInt();
            if (pin != correct_pin) {
                attempts++;
                System.out.println("Wrong pin!! Try again.");
            }
            else {
                System.out.println("You are in!");
                break;
            }
            if (attempts == 3) break;
        }
        sc.close();
    }
}
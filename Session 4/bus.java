import java.util.*;

public class bus {
    public static void main(String[] args) {
        ArrayList<Boolean> arr = new ArrayList<>(40);
        for (int i = 0; i < 40; i++) {
            arr.add(false);
        }

        Scanner sc = new Scanner(System.in);
        int cnt = 40;
        while (cnt > 0) {
            System.out.print("Enter your seat to book: ");
            int seat = sc.nextInt();
            if (arr.get(seat) == false) {
                cnt--;
                arr.set(seat, true);
                System.out.println("Remaining seats: " + cnt);
            }
            else {
                System.out.println("Seat " + seat + " is already booked!");
            }
        }
    }
}
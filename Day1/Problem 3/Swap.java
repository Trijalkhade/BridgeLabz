import java.util.Scanner;

class Swap {
    public void swap(String s1, String s2) {
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("String1: " + s1 + " String2: " + s2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String name1 = scn.nextLine();
        String name2 = scn.nextLine();

        Swap obj = new Swap();
        obj.swap(name1, name2);

        scn.close();
    }
}
import java.util.Scanner;

    void main() {
        
        // Parsing Input lines in prefered Datatypes
        {
            Scanner scn = new Scanner(System.in);
            System.out.print("Your Name: ");
            String sent = scn.nextLine();
            System.out.print("Enter Your BirthYear: ");
            int a = Integer.parseInt(scn.nextLine());
            System.out.print("Enter Your BirthMonth: ");
            float b = Float.parseFloat(scn.nextLine());
            System.out.print(sent + " is ");
            System.out.println((2026-a) + (8-b)/12 + " as of Today!");
            scn.close();
        }
    }

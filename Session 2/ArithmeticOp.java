import java.util.*;

public class ArithmeticOp {
    static double Add(double a, double b) {
        return a+b;
    }
    static double Subtract(double a, double b) {
        return a-b;
    }
    static double Multiply(double a, double b) {
        return a*b;
    }
    static double Divide(double a, double b){
        try {
            double res = a/b;
            return res;
        } catch (Exception e) {
            System.err.print("Zero division Error!" + e.getMessage());
            return 0;
        }
    }
    static double Modulo(double a, double b){
        try {
            double res = a%b;
            return res;
        } catch (Exception e) {
            System.err.print("Zero division Error!" + e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two number: ");
        double a = scn.nextDouble(), b = scn.nextDouble();

        System.out.println();
        System.out.println("Addition: " + Add(a,b));
        System.out.println("Subtraction: " + Subtract(a,b));
        System.out.println("Multiplication: " + Multiply(a,b));
        System.out.println("Division: " + Divide(a,b));
        System.out.println("Modulus: " + Modulo(a,b));
    }
}
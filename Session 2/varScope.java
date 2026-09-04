public class varScope {
    static int a = 100; // Gobal static variable
    int inst = 123;
    public void temp() {
        int b = 5000; // Local Variable
        System.out.println("Inside temp: " + a);
        System.out.println("Inside temp: " + b);
    }
    public static void main(String[] args) {
        int b = 200;
        varScope obj = new varScope();
        obj.temp();
        System.out.println("Instance var: " + obj.inst);
        System.out.println("Inside main: " + a);
        System.out.println("Inside main: " + b);
    }
}
class TempConv {
    public static double Convertor(double C) {
        double Fahrenheit = (C*9/5) + 32;
        return Fahrenheit;
    }
    public static void main(String[] args) {
        double Celsius = 37;
        double Fahrenheit = Convertor(Celsius);
        System.out.println(Fahrenheit);
    }
}
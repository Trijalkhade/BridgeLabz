class typeLimit {
    public static void main(String[] args) {
        byte MIN_VALUE_byte = -128;
        byte MAX_VALUE_byte = 127;
        System.out.println(++MAX_VALUE_byte);
        System.out.println(--MIN_VALUE_byte);

        System.out.println();

        short MIN_VALUE_short = -32768;
        short MAX_VALUE_short = 32767;
        System.out.println(++MAX_VALUE_short);
        System.out.println(--MIN_VALUE_short);

        System.out.println();

        int MIN_VALUE_int = -2147483648;
        int MAX_VALUE_int = 2147483647;
        System.out.println(++MAX_VALUE_int);
        System.out.println(--MIN_VALUE_int);

        System.out.println();
        
        long MIN_VALUE_long = -9223372036854775807L;
        long MAX_VALUE_long = 9223372036854775806L;
        System.out.println(++MAX_VALUE_long);
        System.out.println(--MIN_VALUE_long);
    }
}
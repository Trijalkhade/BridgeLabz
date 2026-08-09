public class ImplicitCast {
    public static void main(String[] args) {
        // Implicit Cast
        {
            byte b = 127;
            short s = b;
            int i = s;
            long l = i;
            double d = l;
            System.out.println(d);
        }
        // Explicit Cast
        {
            double d = 123122353244.241242341412;
            System.out.println(d);
            float f = (float)d;
            System.out.println(f);
            long l = (long)f;
            System.out.println(l);
            int i = (int)l;
            System.out.println(i);
            short s = (short)i;
            System.out.println(s);
            byte b = (byte)s;
            System.out.println(b);
        }
    }
}
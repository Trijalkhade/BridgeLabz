import java.util.*;
class Max3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt(), c = scn.nextInt();
        System.out.println(((a>b)?(a>c)?a:c:(b>c)? b:c));
        scn.close();      
    }
}
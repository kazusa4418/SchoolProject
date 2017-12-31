public class Rei9_3_1 {
    public static void main(String[] args) {
        int i, j;
        i = 0;
        try {
            j = 10 / i;
        } catch(ArithmeticException e) {
            System.out.println("—áŠO‚ª”­¶‚µ‚Ü‚µ‚½B");
            System.out.println(e);
            j = 0;
        }
        System.out.println("®”’l: " + i);
    }
}

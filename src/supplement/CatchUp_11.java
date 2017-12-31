package supplement;

public class CatchUp_11 {
    public static void main(String[] args) {
        System.out.print("‚¢‚­‚Â‚Ü‚Å‰ÁZ‚µ‚Ü‚·‚©H > ");
        int num = new java.util.Scanner(System.in).nextInt();

        int sum = 0;
        while(num > 0) {
            sum += num;
            num--;
        }
        System.out.println(sum);
    }
}

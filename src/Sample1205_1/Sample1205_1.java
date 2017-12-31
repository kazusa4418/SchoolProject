package Sample1205_1;
import java.util.Scanner;

public class Sample1205_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("®”‚P‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢\n> ");
        int num1 = sc.nextInt();
        System.out.print("®”‚Q‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢\n> ");
        int num2 = sc.nextInt();
        System.out.println(Compare.large(num1, num2) + "‚Ì•û‚ª‘å‚«‚¢‚Å‚·");
        System.out.println(Compare.small(num1, num2) + "‚Ì•û‚ª¬‚³‚¢‚Å‚·");
    }
}

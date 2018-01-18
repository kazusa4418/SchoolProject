import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam09_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        int num;

        System.out.print("‹àŠz‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
        try {
            money = check(sc.nextInt());
        }
        catch (InputMismatchException e) {
            System.out.println("‹àŠz‚É®”ˆÈŠO‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
            return;
        }
        catch (ValueOfMinusException e) {
            System.out.println("‹àŠz‚É‚OˆÈ‰º‚Ì’l‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
            return;
        }

        System.out.print("l”‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
        try {
            num = check(sc.nextInt());
        }
        catch (InputMismatchException e) {
            System.out.println("l”‚É®”ˆÈŠO‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
            return;
        }
        catch (ValueOfMinusException e) {
            System.out.println("l”‚É‚OˆÈ‰º‚Ì’l‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
            return;
        }

        int price = money / num;
        int rem = money % num;

        System.out.println((num - rem) + "–¼ : " + price + "‰~‚Ì‚¨Žx•¥‚¢");
        if (rem > 0) {
            System.out.println(rem + "–¼ : " + (price + 1) + "‰~‚Ì‚¨Žx•¥‚¢");
        }
    }

    private static int check(int num) {
        if (num <= 0)
            throw new ValueOfMinusException();
        return num;
    }
}

class ValueOfMinusException extends RuntimeException {
    ValueOfMinusException() {
        super("Negative value specified");
    }
}

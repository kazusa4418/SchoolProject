package Sample1205_2;

import java.util.Scanner;

public class Sample1205_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("®”‚P‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢\n> ");
        int num1 = sc.nextInt();
        System.out.print("®”‚Q‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢\n> ");
        int num2 = sc.nextInt();
        System.out.println(num1 + "‚Æ" + num2 + "‚Ì•½‹Ï‚Í" + Average.average(num1, num2) + "‚Å‚·");

    }
}

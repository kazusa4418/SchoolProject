package Exam08_03_02;

import java.util.Scanner;

public class Exam08_03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("’ê•Ó‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
        int base = sc.nextInt();
        System.out.print("‚‚³‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
        int high = sc.nextInt();

        double area = new Area().triangle(base, high);
        errorCheck(area);
        System.out.println("OŠpŒ`‚Ì–ÊÏ‚Í" + area + "‚Å‚·");
    }

    private static void errorCheck(double area) {
        if (area >= 0) return;
        if (area == -1) System.out.println("’ê•Ó‚Í‚PˆÈã‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        if (area == -2) System.out.println("‚‚³‚Í‚PˆÈã‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        if (area == -3) System.out.println("’ê•ÓE‚‚³‚Í‚PˆÈã‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        System.exit(1);
    }
}

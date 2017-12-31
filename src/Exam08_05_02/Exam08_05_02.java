package Exam08_05_02;

import java.util.Scanner;

public class Exam08_05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("•¶Žš—ñ‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
        String text = sc.nextLine();

        System.out.print("ŒŸõ‚·‚é•¶Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
        char ch = sc.nextLine().charAt(0);

        int num = new Moji().count(text, ch);
        if (num == 0)
            System.out.println(text + " ‚É " + ch + " ‚ÍŠÜ‚Ü‚ê‚Ä‚¢‚Ü‚¹‚ñ");
        else
            System.out.println(text + " ‚É " + ch + " ‚Í " + num + " •¶ŽšŠÜ‚Ü‚ê‚Ä‚¢‚Ü‚·");
    }
}

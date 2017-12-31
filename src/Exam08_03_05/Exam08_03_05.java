package Exam08_03_05;

import java.util.Scanner;

public class Exam08_03_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("•cš‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
        String name = sc.nextLine();

        int number = new NameData().searchFamilyName(name);
        if (number == 0) {
            System.out.println(name + "‚Æ‚¢‚¤•cš‚Í“ú–{‚É‘¶İ‚µ‚Ü‚¹‚ñ");
        } else {
            System.out.println(name + "‚³‚ñ‚Í‘S‘‚É" + number + "l‚¢‚Ü‚·");
        }
    }
}

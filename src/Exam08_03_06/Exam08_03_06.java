package Exam08_03_06;

import java.util.Scanner;

public class Exam08_03_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("�_������͂��Ă������� > ");
        int score = sc.nextInt();

        if (new Check().checkNumber(score) == 1) {
            System.out.println("�͈͊O�ł�");
            System.exit(1);
        }

        char result = new Test().judge(score);
        System.out.println("�]����" + result + "�ł�");
    }
}

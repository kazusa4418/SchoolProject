package Exam08_05_02;

import java.util.Scanner;

public class Exam08_05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���������͂��Ă������� > ");
        String text = sc.nextLine();

        System.out.print("�������镶������͂��Ă������� > ");
        char ch = sc.nextLine().charAt(0);

        int num = new Moji().count(text, ch);
        if (num == 0)
            System.out.println(text + " �� " + ch + " �͊܂܂�Ă��܂���");
        else
            System.out.println(text + " �� " + ch + " �� " + num + " �����܂܂�Ă��܂�");
    }
}

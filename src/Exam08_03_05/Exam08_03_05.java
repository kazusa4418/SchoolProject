package Exam08_03_05;

import java.util.Scanner;

public class Exam08_03_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("�c������͂��Ă������� > ");
        String name = sc.nextLine();

        int number = new NameData().searchFamilyName(name);
        if (number == 0) {
            System.out.println(name + "�Ƃ����c���͓��{�ɑ��݂��܂���");
        } else {
            System.out.println(name + "����͑S����" + number + "�l���܂�");
        }
    }
}

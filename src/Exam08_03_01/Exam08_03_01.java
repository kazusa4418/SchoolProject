package Exam08_03_01;

import java.util.Scanner;

public class Exam08_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���i����͂��Ă�������\n> ");
        int price = sc.nextInt();
        price = Tax.include(price);
        if (price >= 0) {
            System.out.println("�ō��݉��i��" + price + "�~�ł�");
        } else {
            System.out.println("�}�C�i�X�̒l�����͂���܂����B");
        }
    }
}

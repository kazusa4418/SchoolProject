package Exam08_03_02;

import java.util.Scanner;

public class Exam08_03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("��ӂ���͂��Ă������� > ");
        int base = sc.nextInt();
        System.out.print("��������͂��Ă������� > ");
        int high = sc.nextInt();

        double area = new Area().triangle(base, high);
        errorCheck(area);
        System.out.println("�O�p�`�̖ʐς�" + area + "�ł�");
    }

    private static void errorCheck(double area) {
        if (area >= 0) return;
        if (area == -1) System.out.println("��ӂ͂P�ȏ����͂��Ă�������");
        if (area == -2) System.out.println("�����͂P�ȏ����͂��Ă�������");
        if (area == -3) System.out.println("��ӁE�����͂P�ȏ����͂��Ă�������");
        System.exit(1);
    }
}

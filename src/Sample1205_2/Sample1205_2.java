package Sample1205_2;

import java.util.Scanner;

public class Sample1205_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�����P����͂��Ă�������\n> ");
        int num1 = sc.nextInt();
        System.out.print("�����Q����͂��Ă�������\n> ");
        int num2 = sc.nextInt();
        System.out.println(num1 + "��" + num2 + "�̕��ς�" + Average.average(num1, num2) + "�ł�");

    }
}

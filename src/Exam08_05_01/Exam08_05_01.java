package Exam08_05_01;

import java.util.Scanner;

public class Exam08_05_01 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++ ){
            System.out.print("����" + (i + 1) + "����͂��Ă������� > ");
            numbers[i] = sc.nextInt();
        }
        int max = new Compare().max(numbers);
        System.out.println("�ő�l��" + max + "�ł�");
    }
}

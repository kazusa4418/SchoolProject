package Exam08_05_03;

import java.util.Scanner;

public class Exam08_05_03 {
    public static void main(String[] args) {
        double[] info = new double[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("�g��(cm)����͂��Ă������� > ");
        info[0] = sc.nextDouble();
        System.out.print("�̏d(kg)����͂��Ă������� > ");
        info[1] = sc.nextDouble();

        Bmi bmi = new Bmi();
        for (double val : info) {
            if (!bmi.check(val)) {
                System.out.println("�G���[�ł��B");
                return;
            }
        }
        double bmiVal = bmi.result(info[0], info[1]);
        String result = obesityCheck(bmiVal);
        System.out.println("�얞�x��" + result + "�ł�");
        System.out.println("���z�̏d��" + bmi.idealWeight(info[0]) + "kg �ł�");
    }

    private static String obesityCheck(double bmiVal) {
        System.out.println(bmiVal);
        if (bmiVal >= 26.4)
            return "���肷��";
        else if (bmiVal >= 24.2)
            return "����C��";
        else if (bmiVal > 19.9)
            return "�W��";
        else if (bmiVal > 17.7)
            return "�₹�C��";
        else return "�₹����";
    }
}

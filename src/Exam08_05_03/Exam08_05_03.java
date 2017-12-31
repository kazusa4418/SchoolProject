package Exam08_05_03;

import java.util.Scanner;

public class Exam08_05_03 {
    public static void main(String[] args) {
        double[] info = new double[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("身長(cm)を入力してください > ");
        info[0] = sc.nextDouble();
        System.out.print("体重(kg)を入力してください > ");
        info[1] = sc.nextDouble();

        Bmi bmi = new Bmi();
        for (double val : info) {
            if (!bmi.check(val)) {
                System.out.println("エラーです。");
                return;
            }
        }
        double bmiVal = bmi.result(info[0], info[1]);
        String result = obesityCheck(bmiVal);
        System.out.println("肥満度は" + result + "です");
        System.out.println("理想体重は" + bmi.idealWeight(info[0]) + "kg です");
    }

    private static String obesityCheck(double bmiVal) {
        System.out.println(bmiVal);
        if (bmiVal >= 26.4)
            return "太りすぎ";
        else if (bmiVal >= 24.2)
            return "太り気味";
        else if (bmiVal > 19.9)
            return "標準";
        else if (bmiVal > 17.7)
            return "やせ気味";
        else return "やせすぎ";
    }
}

package Sample1205_2;

import java.util.Scanner;

public class Sample1205_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数１を入力してください\n> ");
        int num1 = sc.nextInt();
        System.out.print("整数２を入力してください\n> ");
        int num2 = sc.nextInt();
        System.out.println(num1 + "と" + num2 + "の平均は" + Average.average(num1, num2) + "です");

    }
}

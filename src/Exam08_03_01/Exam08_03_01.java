package Exam08_03_01;

import java.util.Scanner;

public class Exam08_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("価格を入力してください\n> ");
        int price = sc.nextInt();
        price = Tax.include(price);
        if (price >= 0) {
            System.out.println("税込み価格は" + price + "円です");
        } else {
            System.out.println("マイナスの値が入力されました。");
        }
    }
}

import keyin.KeyIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rei9_2_1 {
    public static void main(String[] args) {
        String shimei;
        String namae;
        String seibetsu;
        int toshi;

        KeyIn ki = new KeyIn();

        shimei = ki.readString("名字を入力:");
        namae = ki.readString("名前を入力:");

        while (true) {
            seibetsu = ki.readString("性別を入力(M,F):");
            if (seibetsu.equals("M")) {
                seibetsu = "男性";
                break;
            } else if (seibetsu.equals("F")) {
                seibetsu = "女性";
                break;
            } else {
                System.out.println("性別の入力に誤りがあります");
            }
        }

        while (true) {
            try {
                toshi = Integer.parseInt(ki.readString("年齢を入力:"));
                break;
            } catch (NumberFormatException e) {
                System.out.println("文字列を整数型に解析できませんでした");
            }
        }

        System.out.print("氏名" + shimei + " " + namae + " 性別:" + seibetsu +
                                    " 年齢:" + toshi + "歳");
    }
}


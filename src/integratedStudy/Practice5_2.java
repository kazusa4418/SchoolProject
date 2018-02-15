package integratedStudy;

import keyin.KeyIn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice5_2 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        String fileName = ki.readString("成績ファイル名: > ");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String input;

            List<String> infoList = new ArrayList<>();
            while (reader.ready()) {
                infoList.add(reader.readLine());
            }

            List<Integer> numList = new ArrayList<>();
            for (String anInfoList : infoList) {
                String[] s = anInfoList.split(",");
                numList.add(Integer.parseInt(s[0]));
            }

            while (!(input = ki.readString("検索対象番号: > ")).isEmpty()) {
                int searchNumber = Integer.parseInt(input);

                if (!numList.contains(searchNumber)) {
                    System.out.println("指定した学籍番号のデータは見つかりませんでした");
                }
                else {
                    for (int i = 0; i < infoList.size(); i++ ) {
                        if (searchNumber == numList.get(i)) {
                            showInfo(infoList.get(i));
                        }
                    }
                }
            }
            System.out.println("---- プログラム終了 ----");
        }
        catch (IOException e) {
            printErrMsg("入出力エラーです");
        }
    }

    private static void showInfo(String info) {
        String[] infos = info.split(",");
        System.out.println("学籍番号: " + infos[0]);
        System.out.println("氏名　　: " + infos[1]);
        System.out.println("点数　　: " + infos[2]);
    }

    private static void printErrMsg(String msg) {
        System.err.println("---- error ----");
        System.err.println(msg);
        System.err.println("---------------");
    }
}

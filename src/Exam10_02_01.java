import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exam10_02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ファイル名を入力してください > ");
        String fileName = sc.nextLine();
        //すみません。Dドライブがありません。
        File file = new File("C:\\" + fileName + ".txt");

        try (FileWriter fw = new FileWriter(file)) {
            int i = 1;

            System.out.println("ファイルに出力する文字を入力してください");
            while (true) {
                System.out.print(i + ": ");
                String s = sc.nextLine();
                if (s.isEmpty()) {
                    break;
                }
                fw.write(s + "\n");
                fw.flush();
                i++;
            }
            System.out.println(i + "件のデータを" + fileName + "に書き込みました");
        }
        catch (IOException e) {
            System.out.println("入出力エラーです: " + e);
        }
    }
}

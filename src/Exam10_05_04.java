import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exam10_05_04 {
    private Scanner sc = new Scanner(System.in);
    private File file;
    private String path;

    public static void main(String[] args) {
        Exam10_05_04 exam = new Exam10_05_04();
        exam.start();
    }

    private void start() {
        System.out.print("ファイル名を入力してください > ");
        path = sc.nextLine();

        file = new File(path);
        if (file.exists()) {
            boolean flag = askOverWrite();
            if (flag) {
                overWrite();
            }
            else {
                System.out.println("ファイル作成を中止しました");
            }
        }
        else {
            if (createNewFile())
                System.out.println(path + "を作成しました。");
            else
                System.out.println(path + "の作成に失敗しました。");
        }
    }
    private boolean askOverWrite() {
        System.out.println(path + "はすでに存在しています");
        System.out.println("上書き保存しますか？ (y / n)");
        String rep = sc.nextLine();
        return rep.equalsIgnoreCase("y");
    }

    private void overWrite() {
        if (file.delete()) {
            if (createNewFile())
                System.out.println("上書き保存しました");
            else
                System.out.println("上書き保存に失敗しました");
        }
        else
            System.out.println("");
    }

    private boolean createNewFile() {
        try {
            return file.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

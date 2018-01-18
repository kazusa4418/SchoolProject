import java.io.File;

public class Exam10_05_01 {
    public static void main(String[] args) {
        String path = "C:\\Exam10_05_01";
        File file = new File(path);
        if (file.mkdir())
            System.out.println("新規フォルダ" + path + "を作成しました。");
        else
            System.out.println("新規フォルダ" + path + "の作成に失敗しました。");
    }
}

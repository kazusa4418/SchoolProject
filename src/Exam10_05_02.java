import java.io.File;

public class Exam10_05_02 {
    public static void main(String[] args) {
        String path = "C:\\Exam10_05_01";
        File file = new File(path);

        if (file.delete())
            System.out.println("フォルダ" + path + "を削除しました。");
        else
            System.out.println("フォルダ" + path + "の削除に失敗しました。");
    }
}

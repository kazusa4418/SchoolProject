import java.io.File;
import java.util.Scanner;

public class Exam10_05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("PATH > ");
        String path = sc.nextLine();
        File file = new File(path);
        boolean flag = file.mkdirs();
        if (flag)
            System.out.println("新規フォルダ" + path + "を作成しました。");
        else
            System.out.println("新規フォルダ" + path + "の作成に失敗しました。");
    }
}

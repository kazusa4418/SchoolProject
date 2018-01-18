import java.io.File;
import java.util.Date;

public class Rei10_4_1 {
    public static void main(String[] args) {
        File f;
        String path = "src\\abc.txt";

        f = new File(path);
        if (f.exists()) {
            System.out.println("ファイル名       : " + f.getName());
            System.out.println("絶対パス名       : " + f.getAbsolutePath());
            System.out.println("パス名           : " + f.toString());
            System.out.println("親ディレクトリ名 : " + f.getParent());
            System.out.println("ファイルの長さ   : " + f.length());
            System.out.println("読み込み可能     : " + f.canRead());
            System.out.println("編集可能         : " + f.canWrite());
            System.out.println("隠しファイル     : " + f.isHidden());
            Date d = new Date(f.lastModified());
            System.out.print("最終更新時刻       : " + d.toString());
        }
        else {
            System.out.println("指定されたファイルは存在しません : " + path);
        }
    }
}

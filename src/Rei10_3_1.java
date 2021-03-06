import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Rei10_3_1 {
    public static void main(String[] args) {
        String buf;
        BufferedReader br = null;
        int i = 0;
        boolean flag = true;
        String fileName = "src\\abc.txt";

        try {
            br = new BufferedReader(new FileReader(fileName));

            while (flag) {
                buf = br.readLine();
                if (buf != null) {
                    i++;
                    System.out.println(i + ": " + buf);
                }
                else {
                    flag = false;
                }
            }
        }
        catch (IOException e) {
            System.out.println("ファイルアクセスエラー");
        }
        finally {
            try {
                br.close();
            }
            catch (IOException e) {
                System.out.println("ファイルクローズエラー: " + e);
            }
        }
    }
}

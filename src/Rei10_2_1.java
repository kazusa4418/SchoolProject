import keyin.KeyIn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Rei10_2_1 {
    public static void main(String[] args) {
        String buf;
        BufferedWriter bw = null;
        int i = 0;
        boolean flag = true;

        final String fileName = "src\\abc.txt";
        KeyIn ki = new KeyIn();

        try {
            bw = new BufferedWriter(new FileWriter(fileName));

            while (flag) {
                buf = ki.readString((i+ 1) + ":");
                if (buf.length() != 0) {
                    bw.write(buf);
                    bw.newLine();
                    i++;
                } else {
                    flag = false;
                }
            }
            System.out.print(i + "件のデータを" + fileName + "に書き込みました");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ファイル名を指定してください");
            System.exit(1);
        }
        catch (IOException e) {
            System.out.println("ファイルアクセスエラー:" + e);
        }
        finally {
            try {
                bw.close();
            }
            catch (IOException e) {
                System.out.println("ファイルクローズエラー:" + e);
            }
        }
    }
}

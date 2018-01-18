import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam09_03_02 {
    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("整数を入力してください > ");
        try {
            Integer.parseInt(reader.readLine());
            System.out.println("整数が入力されました");
        }
        catch (IOException e) {
            System.out.println("入出力エラーです");
        }
        catch (NumberFormatException e) {
            System.out.println("整数以外が入力されました。");
        }

    }
}

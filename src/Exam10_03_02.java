import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exam10_03_02 {
    public static void main(String[] args) {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("src\\Rei10_3_1.java"))) {
            while (reader.ready())
                System.out.println(reader.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam10_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ƒtƒ@ƒCƒ‹–¼‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢ > ");
        String fileName = sc.nextLine();

        try (BufferedReader reader =
                    new BufferedReader(new FileReader(fileName))) {
            while (reader.ready())
                System.out.println(reader.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

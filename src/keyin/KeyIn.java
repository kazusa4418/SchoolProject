package keyin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyIn {
    private BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public String readString(String text) {
        String s = null;

        System.out.print(text);
        try {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println("���o�̓G���[���������܂����B");
            e.printStackTrace();
        }
        return s;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam09_03_02 {
    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("��������͂��Ă������� > ");
        try {
            Integer.parseInt(reader.readLine());
            System.out.println("���������͂���܂���");
        }
        catch (IOException e) {
            System.out.println("���o�̓G���[�ł�");
        }
        catch (NumberFormatException e) {
            System.out.println("�����ȊO�����͂���܂����B");
        }

    }
}

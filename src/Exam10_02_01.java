import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exam10_02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("�t�@�C��������͂��Ă������� > ");
        String fileName = sc.nextLine();
        //���݂܂���BD�h���C�u������܂���B
        File file = new File("C:\\" + fileName + ".txt");

        try (FileWriter fw = new FileWriter(file)) {
            int i = 1;

            System.out.println("�t�@�C���ɏo�͂��镶������͂��Ă�������");
            while (true) {
                System.out.print(i + ": ");
                String s = sc.nextLine();
                if (s.isEmpty()) {
                    break;
                }
                fw.write(s + "\n");
                fw.flush();
                i++;
            }
            System.out.println(i + "���̃f�[�^��" + fileName + "�ɏ������݂܂���");
        }
        catch (IOException e) {
            System.out.println("���o�̓G���[�ł�: " + e);
        }
    }
}

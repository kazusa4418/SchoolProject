import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exam10_05_04 {
    private Scanner sc = new Scanner(System.in);
    private File file;
    private String path;

    public static void main(String[] args) {
        Exam10_05_04 exam = new Exam10_05_04();
        exam.start();
    }

    private void start() {
        System.out.print("�t�@�C��������͂��Ă������� > ");
        path = sc.nextLine();

        file = new File(path);
        if (file.exists()) {
            boolean flag = askOverWrite();
            if (flag) {
                overWrite();
            }
            else {
                System.out.println("�t�@�C���쐬�𒆎~���܂���");
            }
        }
        else {
            if (createNewFile())
                System.out.println(path + "���쐬���܂����B");
            else
                System.out.println(path + "�̍쐬�Ɏ��s���܂����B");
        }
    }
    private boolean askOverWrite() {
        System.out.println(path + "�͂��łɑ��݂��Ă��܂�");
        System.out.println("�㏑���ۑ����܂����H (y / n)");
        String rep = sc.nextLine();
        return rep.equalsIgnoreCase("y");
    }

    private void overWrite() {
        if (file.delete()) {
            if (createNewFile())
                System.out.println("�㏑���ۑ����܂���");
            else
                System.out.println("�㏑���ۑ��Ɏ��s���܂���");
        }
        else
            System.out.println("");
    }

    private boolean createNewFile() {
        try {
            return file.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

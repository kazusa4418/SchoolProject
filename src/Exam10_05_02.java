import java.io.File;

public class Exam10_05_02 {
    public static void main(String[] args) {
        String path = "C:\\Exam10_05_01";
        File file = new File(path);

        if (file.delete())
            System.out.println("�t�H���_" + path + "���폜���܂����B");
        else
            System.out.println("�t�H���_" + path + "�̍폜�Ɏ��s���܂����B");
    }
}

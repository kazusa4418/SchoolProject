import java.io.File;

public class Exam10_05_01 {
    public static void main(String[] args) {
        String path = "C:\\Exam10_05_01";
        File file = new File(path);
        if (file.mkdir())
            System.out.println("�V�K�t�H���_" + path + "���쐬���܂����B");
        else
            System.out.println("�V�K�t�H���_" + path + "�̍쐬�Ɏ��s���܂����B");
    }
}

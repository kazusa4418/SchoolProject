import java.io.File;
import java.util.Date;

public class Rei10_4_1 {
    public static void main(String[] args) {
        File f;
        String path = "src\\abc.txt";

        f = new File(path);
        if (f.exists()) {
            System.out.println("�t�@�C����       : " + f.getName());
            System.out.println("��΃p�X��       : " + f.getAbsolutePath());
            System.out.println("�p�X��           : " + f.toString());
            System.out.println("�e�f�B���N�g���� : " + f.getParent());
            System.out.println("�t�@�C���̒���   : " + f.length());
            System.out.println("�ǂݍ��݉\     : " + f.canRead());
            System.out.println("�ҏW�\         : " + f.canWrite());
            System.out.println("�B���t�@�C��     : " + f.isHidden());
            Date d = new Date(f.lastModified());
            System.out.print("�ŏI�X�V����       : " + d.toString());
        }
        else {
            System.out.println("�w�肳�ꂽ�t�@�C���͑��݂��܂��� : " + path);
        }
    }
}

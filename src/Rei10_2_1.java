import keyin.KeyIn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Rei10_2_1 {
    public static void main(String[] args) {
        String buf;
        BufferedWriter bw = null;
        int i = 0;
        boolean flag = true;

        final String fileName = "src\\abc.txt";
        KeyIn ki = new KeyIn();

        try {
            bw = new BufferedWriter(new FileWriter(fileName));

            while (flag) {
                buf = ki.readString((i+ 1) + ":");
                if (buf.length() != 0) {
                    bw.write(buf);
                    bw.newLine();
                    i++;
                } else {
                    flag = false;
                }
            }
            System.out.print(i + "���̃f�[�^��" + fileName + "�ɏ������݂܂���");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("�t�@�C�������w�肵�Ă�������");
            System.exit(1);
        }
        catch (IOException e) {
            System.out.println("�t�@�C���A�N�Z�X�G���[:" + e);
        }
        finally {
            try {
                bw.close();
            }
            catch (IOException e) {
                System.out.println("�t�@�C���N���[�Y�G���[:" + e);
            }
        }
    }
}

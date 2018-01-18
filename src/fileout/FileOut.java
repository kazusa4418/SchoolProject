package fileout;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOut {
    private BufferedWriter bw = null;

    public boolean open(String fname) {
        boolean sts = true;
        try {
            bw = new BufferedWriter(new FileWriter(fname));
        }
        catch (IOException e) {
            System.out.println("�t�@�C�����Ɍ�肪����܂�\n" + e);
            sts = false;
        }
        return sts;
    }

    public boolean writeln(String str) {
        boolean sts = true;
        try {
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        catch (IOException e) {
            System.out.println("�������݃G���[\n" + e);
            sts = false;
        }
        return sts;
    }

    public boolean close() {
        boolean sts = true;
        try {
            bw.close();
        }
        catch (IOException e) {
            System.out.println("�t�@�C���N���[�Y�G���[\n" + e);
            sts = false;
        }
        return sts;
    }
}

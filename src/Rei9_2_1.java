import keyin.KeyIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rei9_2_1 {
    public static void main(String[] args) {
        String shimei;
        String namae;
        String seibetsu;
        int toshi;

        KeyIn ki = new KeyIn();

        shimei = ki.readString("���������:");
        namae = ki.readString("���O�����:");

        while (true) {
            seibetsu = ki.readString("���ʂ����(M,F):");
            if (seibetsu.equals("M")) {
                seibetsu = "�j��";
                break;
            } else if (seibetsu.equals("F")) {
                seibetsu = "����";
                break;
            } else {
                System.out.println("���ʂ̓��͂Ɍ�肪����܂�");
            }
        }

        while (true) {
            try {
                toshi = Integer.parseInt(ki.readString("�N������:"));
                break;
            } catch (NumberFormatException e) {
                System.out.println("������𐮐��^�ɉ�͂ł��܂���ł���");
            }
        }

        System.out.print("����" + shimei + " " + namae + " ����:" + seibetsu +
                                    " �N��:" + toshi + "��");
    }
}


package integratedStudy;

import keyin.KeyIn;

public class Practice2_1 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] arrayScode = { 102, 800, 201, 101, 283, 430, 181, 550 };
        String[] arraySname = { "������B�^", "���ڊ�", "��c�p��", "������A�^"
                                , "�܂��݊�", "�ؐ���", "�e��", "�w����" };

        int code = ki.readInt("���i�R�[�h: ");
        int idx = 0;
        while (idx < arrayScode.length && code != arrayScode[idx]) {
            idx++;
        }
        if (idx < arrayScode.length) {
            System.out.println(arraySname[idx]);
        }
        else {
            System.out.println("�o�^����Ă��Ȃ����i�R�[�h�ł�");
        }
    }
}

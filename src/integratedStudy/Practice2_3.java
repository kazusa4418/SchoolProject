package integratedStudy;

import keyin.KeyIn;

public class Practice2_3 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] arrayScode = { 101, 102, 181, 201, 283, 430, 550, 800 };
        String[] arraySname = { "������A�^", "������B�^", "�e��", "��c�p��"
                                , "�܂��݊�", "�ؐ���", "�w����", "���ڊ�" };
        int mid;
        int hi, lo;
        boolean found;
        int code;

        found = false;
        code = ki.readInt("���i�R�[�h: ");
        lo = 0;
        hi = arrayScode.length - 1;

        while (lo <= hi) {
            mid = (lo + hi) / 2;

            if (code == arrayScode[mid]) {
                found = true;
                break;
            }
            else {
                if (code < arrayScode[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
        }
        if (found) {
            System.out.println(arraySname[(lo + hi) / 2]);
        }
        else {
            System.out.println("�o�^����Ă��Ȃ����i�R�[�h�ł�");
        }
    }
}
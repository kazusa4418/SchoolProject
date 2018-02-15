package integratedStudy;

import keyin.KeyIn;

public class Practice4_3 {
    public static void main(String[] args) {
        int[] arrayBango = { 20, 40, 10, 0, 30, 0, 0, 0 };
        int[] arrayTensu = { 22, 44, 11, 0, 33, 0, 0, 0 };
        int[] arrayNext = { 4, -1, 0, 5, 1, 6, 7, -1 };
        int lip = 2;
        int eip = 3;

        final int END_OF_LIST = -1;
        KeyIn ki = new KeyIn();

        int num;
        while ((num = ki.readInt("”Ô†(I—¹=0):")) > 0) {
            int idx = lip;

            while ((idx != END_OF_LIST) && (num != arrayBango[idx])) {
                idx = arrayNext[idx];
            }

            if (idx != END_OF_LIST) {
                System.out.println(arrayTensu[idx]);
            }
            else {
                System.out.println("Œ©‚Â‚©‚è‚Ü‚¹‚ñ‚Å‚µ‚½");
            }
        }
    }
}

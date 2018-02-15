package integratedStudy;

import keyin.KeyIn;

public class Practice4_4 {
    public static void main(String[] args) {
        final int END_OF_TREE = -1;
        int[] arrayBango = {5, 2, 7, 9, 1, 3, 0, 0};
        int[] arrayTensu = {50, 20, 70, 90, 10, 30, 0, 0};
        int[] arrayLeft = {1, 4, -1, -1, -1, -1, -1, -1};
        int[] arrayRight = {2, 5, 3, -1, -1, -1, -1, -1};
        int pt = 0;
        int num;

        KeyIn ki = new KeyIn();
        while ((num = ki.readInt("学籍番号(終了=0):> ")) > 0) {
            int idx = pt;
            while (idx != END_OF_TREE && arrayBango[idx] != num) {
                if (arrayBango[idx] < num) {
                    idx = arrayRight[idx];
                } else {
                    idx = arrayLeft[idx];
                }
            }
            if (idx != -1) {
                System.out.println("点数=" + arrayTensu[idx]);
            } else {
                System.out.println("見つかりませんでした");
            }
        }
        System.out.println("---- プログラム終了 ----");
    }
}

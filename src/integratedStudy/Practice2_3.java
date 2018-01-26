package integratedStudy;

import keyin.KeyIn;

public class Practice2_3 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] arrayScode = { 101, 102, 181, 201, 283, 430, 550, 800 };
        String[] arraySname = { "事務机A型", "事務机B型", "脇机", "会議用机"
                                , "折り畳み机", "木製机", "学生机", "応接机" };
        int mid;
        int hi, lo;
        boolean found;
        int code;

        found = false;
        code = ki.readInt("商品コード: ");
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
            System.out.println("登録されていない商品コードです");
        }
    }
}

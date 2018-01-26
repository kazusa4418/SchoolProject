package integratedStudy;

import keyin.KeyIn;

public class Practice2_2 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] arrayScode = { 102, 800, 201, 101, 283, 430, 181, 550, -1 };
        String[] arraySname = { "事務机B型", "応接机", "会議用机", "事務机A型"
                                , "折り畳み机", "木製机", "脇机", "学生机" , "" };
        int idx;
        int code;

        code = ki.readInt("商品コード: ");
        arrayScode[arrayScode.length - 1] = code;

        idx = 0;
        while (code != arrayScode[idx])
            idx++;
        if (idx != arrayScode.length - 1)
            System.out.println(arraySname[idx]);
        else
            System.out.println("登録されていない商品コードです");

    }
}

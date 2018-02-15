package integratedStudy;

public class Practice3_1 {
    public static void main(String[] args) {
        int[] arrayScode = { 102, 800, 201, 101, 283, 430, 181, 550 };
        String[] arraySname = { "––±Š÷BŒ^", "‰ÚŠ÷", "‰ï‹c—pŠ÷", "––±Š÷AŒ^"
                                , "Ü‚èô‚İŠ÷", "–Ø»Š÷", "˜eŠ÷", "Šw¶Š÷" };
        int tempCode;
        String tempName;

        int i = 0;
        while (i < (arrayScode.length - 1)) {
            int j = i + 1;

            while (j < arrayScode.length) {
                if (arrayScode[i] > arrayScode[j]) {
                    tempCode = arrayScode[i];
                    tempName = arraySname[i];
                    arrayScode[i] = arrayScode[j];
                    arraySname[i] = arraySname[j];
                    arrayScode[j] = tempCode;
                    arraySname[j] = tempName;
                }
                j++;
            }
            i++;
        }
        i = 0;
        while (i < arrayScode.length) {
            System.out.println(arrayScode[i] + "\t" + arraySname[i]);
            i++;
        }
    }
}

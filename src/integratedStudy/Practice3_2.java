package integratedStudy;

public class Practice3_2 {
    public static void main(String[] args) {
        int[] arrayScode = { 102, 800, 201, 101, 283, 430, 181, 550 };
        String[] arraySname = { "––±Š÷BŒ^", "‰ÚŠ÷", "‰ï‹c—pŠ÷", "––±Š÷AŒ^"
                                , "Ü‚èô‚İŠ÷", "–Ø»Š÷", "˜eŠ÷", "Šw¶Š÷" };
        int i, j;
        int tempCode;
        String tempName;

        i = 1;
        while (i < arrayScode.length) {
            j = i;
            while (0 < j) {
                if (arrayScode[j - 1] > arrayScode[j]) {
                    tempCode = arrayScode[j];
                    tempName = arraySname[j];
                    arrayScode[j] = arrayScode[j - 1];
                    arraySname[j] = arraySname[j - 1];
                    arrayScode[j - 1] = tempCode;
                    arraySname[j - 1] = tempName;
                }
                else {
                    break;
                }
                j--;
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

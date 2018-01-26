package integratedStudy;

public class Practice1_1 {
    public static void main(String[] args) {
        int[] arrayMark = { 90, 75, 100, 60, 95, 70, 85, 80, 90, 80 };
        int[] arrayRank = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int i;
        int j;

        i = 0;
        while (i < arrayMark.length) {
            j = 0;
            while (j < arrayRank.length) {
                if (arrayMark[i] < arrayMark[j])
                    arrayRank[i]++;
                j++;
            }
            i++;
        }

        i = 0;
        while (i < arrayMark.length) {
            System.out.println((i + 1) + "l–Ú\t" + arrayMark[i] + "“_\t"
                                    + arrayRank[i] + "ˆÊ");
            i++;
        }
    }
}

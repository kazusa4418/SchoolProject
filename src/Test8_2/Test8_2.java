package Test8_2;

public class Test8_2 {
    public static void main(String[] args) {
        int[] arrayTensu = { 70, 85, 60, 65, 75 };
        Search sh = new Search();

        for (int i = 0; i < arrayTensu.length; i++) {
            System.out.print("�z��[" + i + "]=" + arrayTensu[i] + " ");
        }
        System.out.println();

        System.out.println("�z��v�f���̍ŏ��l -> " + sh.minimum(arrayTensu));
        System.out.println("�z��v�f���̍ő�l -> " + sh.maximum(arrayTensu));
    }
}

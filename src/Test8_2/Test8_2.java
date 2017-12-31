package Test8_2;

public class Test8_2 {
    public static void main(String[] args) {
        int[] arrayTensu = { 70, 85, 60, 65, 75 };
        Search sh = new Search();

        for (int i = 0; i < arrayTensu.length; i++) {
            System.out.print("配列[" + i + "]=" + arrayTensu[i] + " ");
        }
        System.out.println();

        System.out.println("配列要素中の最小値 -> " + sh.minimum(arrayTensu));
        System.out.println("配列要素中の最大値 -> " + sh.maximum(arrayTensu));
    }
}

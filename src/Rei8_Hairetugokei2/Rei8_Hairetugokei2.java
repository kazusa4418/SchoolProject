package Rei8_Hairetugokei2;

public class Rei8_Hairetugokei2 {
    public static void main(String[] args) {
        int[] arrayTensu2 = { -1, 70, 85, 60, 65, 75 };
        HairetuGokei2 gk2 = new HairetuGokei2();

        gk2.yosoGokeiToLead(arrayTensu2);
        System.out.println("配列の要素の合計は" + arrayTensu2[0]);
    }
}

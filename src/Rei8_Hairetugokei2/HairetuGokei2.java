package Rei8_Hairetugokei2;

public class HairetuGokei2 {
    public void yosoGokeiToLead(int[] element) {
        element[0] = 0;
        for (int i = 0; i < element.length; i++) {
            element[0] += element[i];
        }
    }
}

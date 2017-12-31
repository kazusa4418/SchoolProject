package Rei8_HairetsuGokei;

@SuppressWarnings("all")
public class Rei8_HairetsuGokei {
    public static void main(String[] args) {
        int[] arrayTensu = { 70, 85, 60, 65, 75 };
        HairetsuGokei gk = new HairetsuGokei();

        int gokei = gk.yosoGokei(arrayTensu);
        System.out.println("”z—ñ—v‘f‚Ì‡Œv‚Í" + gokei);
    }
}

@SuppressWarnings("all")
class HairetsuGokei {
    public int yosoGokei(int[] element) {
        int sum = 0;
        for (int i = 0; i < element.length; i++) {
            sum += element[i];
        }
        return sum;
    }
}

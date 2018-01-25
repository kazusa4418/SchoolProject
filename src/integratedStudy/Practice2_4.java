package integratedStudy;

import keyin.KeyIn;

public class Practice2_4 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] section = { 50, 75, 100, 150, 200, 250, 500, 750, 1000, 2000, 3000, 4000 };
        int[] price = { 120, 140, 160, 200, 240, 270, 390, 580, 700, 950, 1150, 1350 };

        int weight = ki.readInt("d—Ê > ");

        if (weight <= 0 || weight > 4000) {
            System.out.println("Žæ‚èˆµ‚¢‚Å‚«‚Ü‚¹‚ñ");
        }
        else {
            int i;
            for (i = 0; i < section.length; i++ ) {
                if (weight <= section[i])
                    break;
            }
            System.out.println(price[i] + "‰~");
        }
    }
}

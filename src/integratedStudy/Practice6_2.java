package integratedStudy;

import keyin.KeyIn;

public class Practice6_2 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int range;
        int end;
        int i,j;
        int num = 0;

        range = ki.readInt("‚¢‚­‚Â‚Ü‚Å: ");
        end = (int) Math.sqrt((double) range);

        boolean[] array = new boolean[range + 1];

        array[2] = true;
        i = 3;

        while (i < array.length) {
            array[i] = true;
            i = i + 2;
        }

        while (i <= end) {
            if (array[i]) {
                j = i * 2;

                while (j < array.length) {
                    array[j] = false;
                    j += i;
                }
            }
            i = i + 2;
        }

        int k;
        for (k = 1; k < array.length; k++ ) {
            if (array[k]) {
                System.out.print(k + "\t");
                num++;
            }
        }
        System.out.println("ŒÂ”: " + num);

    }
}

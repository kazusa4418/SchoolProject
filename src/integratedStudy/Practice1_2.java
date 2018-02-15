package integratedStudy;

import keyin.KeyIn;

public class Practice1_2 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();

        int degree = ki.readInt("Šï”‚Ì–‚–@w: ");
        if (degree < 0 || degree % 2 == 0) {
            System.err.println("ƒGƒ‰[‚Å‚·");
        }
        else {
            int[][] magicSquare = new int[degree][degree];
            int i = 0;
            int j = degree / 2;
            magicSquare[i][j] = 1;

            for (int k = 2; k <= Math.pow(degree, 2); k++ ) {
                if (k % degree == 1) {
                    i++;
                }
                else {
                    j = (i == 0 || !(j == degree - 1)) ? ++j : 0;
                    i = (i == 0) ? degree - 1 : --i;
                }
                magicSquare[i][j] = k;
            }
            for (int[] aMagicSquare : magicSquare) {
                for (int square : aMagicSquare) {
                    System.out.print(square + "\t");
                }
                System.out.println();
            }
        }
    }
}

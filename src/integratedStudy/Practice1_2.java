package integratedStudy;

import keyin.KeyIn;

public class Practice1_2 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int degree;
        int i;
        int j;

        degree = ki.readInt("Šï”‚Ì–‚–@w: ");
        if (degree < 0 || degree % 2 == 0) {
            System.err.println("ƒGƒ‰[‚Å‚·");
            System.exit(1);
        }
        else {
            int[][] magicSquare = new int[degree][degree];
            i = 0;
            j = degree / 2;
            magicSquare[i][j] = 1;
            int k = 2;

            while (k <= Math.pow(degree, 2)) {
                if (k % degree == 1) {
                    i++;
                }
                else {
                    if (i == 0) {
                        i = degree - 1;
                        j++;
                    }
                    else {
                        if (j == degree - 1) {
                            i--;
                            j = 0;
                        }
                        else {
                            i--;
                            j++;
                        }
                    }
                }
                magicSquare[i][j] = k;
                k++;
            }
            for (int l = 0; l < magicSquare.length; l++ ) {
                for (int m = 0; m < magicSquare[l].length; m++ ) {
                    System.out.print(magicSquare[l][m] + "\t");
                }
                System.out.println();
            }
        }
    }
}

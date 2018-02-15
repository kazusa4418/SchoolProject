package integratedStudy;

import keyin.KeyIn;

public class Practice6_1 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int a, b;
        int div;
        int rem;
        int gcd;
        int lcm;

        a = ki.readInt("a: ");
        b = ki.readInt("b: ");
        gcd = a;
        div = b;

        while (div > 0) {
            rem = gcd % div;
            gcd = div;
            div = rem;
        }
        lcm = (a * b) / gcd;
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}

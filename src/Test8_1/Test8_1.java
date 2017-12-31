package Test8_1;

public class Test8_1 {
    public static void main(String[] args) {
        Arithmetic ar = new Arithmetic();

        System.out.println("absolute(10) -> " + ar.absolute(10));
        System.out.println("absolute(-10.0) -> " + ar.absolute(-10.0));
        System.out.println("round(1,49) -> " + ar.round(1.49));
        System.out.println("round(1.50) -> " + ar.round(1.50));
        System.out.println("round(-1.49) -> " + ar.round(-1.49));
        System.out.println("round(-1.50) -> " + ar.round(-1.50));
    }
}

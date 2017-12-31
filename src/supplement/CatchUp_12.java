package supplement;

public class CatchUp_12 {
    public static void main(String[] args) {
        System.out.print("何回ループしますか？ > ");
        int num = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= num; i++ ) {
            System.out.println(i + "回目のループです");
        }
    }
}

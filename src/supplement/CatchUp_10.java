package supplement;

public class CatchUp_10 {
    public static void main(String[] args) {
        int i = 0;
        System.out.print("何回ループするか入力してください > ");
        int number = new java.util.Scanner(System.in).nextInt();

        while(i < number) {
            System.out.println(i + "回目のループです");
            i++;
        }
    }
}

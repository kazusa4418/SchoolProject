package Sample1205_1;
import java.util.Scanner;

public class Sample1205_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数１を入力してください\n> ");
        int num1 = sc.nextInt();
        System.out.print("整数２を入力してください\n> ");
        int num2 = sc.nextInt();
        System.out.println(Compare.large(num1, num2) + "の方が大きいです");
        System.out.println(Compare.small(num1, num2) + "の方が小さいです");
    }
}

package Sample1205_1;
import java.util.Scanner;

public class Sample1205_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("�����P����͂��Ă�������\n> ");
        int num1 = sc.nextInt();
        System.out.print("�����Q����͂��Ă�������\n> ");
        int num2 = sc.nextInt();
        System.out.println(Compare.large(num1, num2) + "�̕����傫���ł�");
        System.out.println(Compare.small(num1, num2) + "�̕����������ł�");
    }
}

import java.util.Scanner;

public class Exam08_02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�����P����͂��Ă�������\n> ");
        int num1 = sc.nextInt();
        System.out.print("�����Q����͂��Ă�������\n> ");
        int num2 = sc.nextInt();
        System.out.println(Math.max(num1, num2) + "�̕����傫���ł�");
    }
}

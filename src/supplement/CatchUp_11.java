package supplement;

public class CatchUp_11 {
    public static void main(String[] args) {
        System.out.print("いくつまで加算しますか？ > ");
        int num = new java.util.Scanner(System.in).nextInt();

        int sum = 0;
        while(num > 0) {
            sum += num;
            num--;
        }
        System.out.println(sum);
    }
}

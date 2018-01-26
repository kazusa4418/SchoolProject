package integratedStudy;

import java.util.Scanner;

public class Practice4_1 {
    private Stack stack;
    private Scanner sc = new Scanner(System.in);
    private boolean flag = true;

    public static void main(String[] args) {
        Practice4_1 p = new Practice4_1();
        p.start();
    }

    private Practice4_1() {
        System.out.print("スタックの要素数 > ");
        stack = new Stack(sc.nextInt());
    }

    private void start() {
        while (flag) {
            select();
        }
    }
    private void select() {
        System.out.print("種別(0:表示, 1:push, 2:pop) :> ");
        int in = sc.nextInt();

        switch (in) {
            case -1:
                System.out.println("---- プログラム終了 ----");
                flag = false;
                break;
            case 0:
                if (stack.getSP() == 0) {
                    System.out.println("スタックされていません");
                }
                else {
                    stack.show();
                }
                break;
            case 1:
                if (stack.canPush()) {
                    System.out.print("データ:> ");
                    stack.push(sc.nextInt());
                }
                else {
                    System.out.println("スタックがいっぱいです");
                }
                break;
            case 2:
                if (stack.canPop()) {
                    System.out.println(stack.pop());
                }
                else {
                    System.out.println("スタックされていません");
                }
                break;
        }
    }
}

package integratedStudy.Practice4_2;

import java.util.Scanner;

public class Practice4_2 {
    /* キュー */
    private Queue queue;
    /* 標準入力 */
    private Scanner sc = new Scanner(System.in);
    /* 処理を続行するか管理するフラグ */
    private boolean flag = true;

    public static void main(String[] args) {
        Practice4_2 p = new Practice4_2();
        p.start();
    }

    private Practice4_2() {
        System.out.println("(指定した数 - 1)個のキューバッファが用意されます");
        System.out.print("配列要素数 > ");
        int size = sc.nextInt();
        System.out.println((size - 1) + "個の要素を格納できます");
        queue = new Queue(size);
    }

    private void start() {
        while (flag) {
            select();
        }
    }

    private void select() {
        System.out.print("種別(0:表示,1:格納,2:取出) :> ");
        int command = sc.nextInt();

        switch (command) {
            case -1:
                System.out.println("---- プログラム終了 ----");
                flag = false;
                break;
            case 0:
                /* キューが空でなければ内容を表示し、空ならばメッセージを表示する */
                if (!queue.isEmpty()) {
                    queue.show();
                }
                else {
                    System.out.println("データが格納されていません");
                }
                break;
            case 1:
                /* キューがいっぱいでなければデータをエンキューし、いっぱいならメッセージを表示 */
                if (!queue.isFull()) {
                    System.out.print("データ > ");
                    queue.enqueue(sc.nextInt());
                }
                else {
                    System.out.println("キューがいっぱいです");
                }
                break;
            case 2:
                /* キューが空でなければデキューをし、空ならばメッセージを表示する */
                if (!queue.isEmpty()) {
                    System.out.println(queue.dequeue());
                }
                else {
                    System.out.println("データが格納されていません");
                }
                break;
            default:
                System.out.println("種別の入力エラーです");
                break;
        }
    }
}

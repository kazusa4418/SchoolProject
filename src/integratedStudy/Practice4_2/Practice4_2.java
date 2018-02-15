package integratedStudy.Practice4_2;

import java.util.Scanner;

public class Practice4_2 {
    /* �L���[ */
    private Queue queue;
    /* �W������ */
    private Scanner sc = new Scanner(System.in);
    /* �����𑱍s���邩�Ǘ�����t���O */
    private boolean flag = true;

    public static void main(String[] args) {
        Practice4_2 p = new Practice4_2();
        p.start();
    }

    private Practice4_2() {
        System.out.println("(�w�肵���� - 1)�̃L���[�o�b�t�@���p�ӂ���܂�");
        System.out.print("�z��v�f�� > ");
        int size = sc.nextInt();
        System.out.println((size - 1) + "�̗v�f���i�[�ł��܂�");
        queue = new Queue(size);
    }

    private void start() {
        while (flag) {
            select();
        }
    }

    private void select() {
        System.out.print("���(0:�\��,1:�i�[,2:��o) :> ");
        int command = sc.nextInt();

        switch (command) {
            case -1:
                System.out.println("---- �v���O�����I�� ----");
                flag = false;
                break;
            case 0:
                /* �L���[����łȂ���Γ��e��\�����A��Ȃ�΃��b�Z�[�W��\������ */
                if (!queue.isEmpty()) {
                    queue.show();
                }
                else {
                    System.out.println("�f�[�^���i�[����Ă��܂���");
                }
                break;
            case 1:
                /* �L���[�������ς��łȂ���΃f�[�^���G���L���[���A�����ς��Ȃ烁�b�Z�[�W��\�� */
                if (!queue.isFull()) {
                    System.out.print("�f�[�^ > ");
                    queue.enqueue(sc.nextInt());
                }
                else {
                    System.out.println("�L���[�������ς��ł�");
                }
                break;
            case 2:
                /* �L���[����łȂ���΃f�L���[�����A��Ȃ�΃��b�Z�[�W��\������ */
                if (!queue.isEmpty()) {
                    System.out.println(queue.dequeue());
                }
                else {
                    System.out.println("�f�[�^���i�[����Ă��܂���");
                }
                break;
            default:
                System.out.println("��ʂ̓��̓G���[�ł�");
                break;
        }
    }
}

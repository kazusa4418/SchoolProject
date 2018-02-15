package integratedStudy.Practice5_1;

import integratedStudy.input.InputNotIntegerException;
import integratedStudy.input.InputScanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Practice5_1 {
    private InputScanner is = new InputScanner();
    private TestRecord[] records;

    public static void main(String[] args) {
        Practice5_1 p = new Practice5_1();
        p.start();
    }

    private void start() {
        /* ���s�ǂݍ��ނ����͂����� */
        int record_num = inputRecord_num();
        /* ���͂��ꂽ�l���̗v�f����������TestRecord�^�z��𐶐� */
        records = new TestRecord[record_num];

        /* ���͂��ꂽ�l���̊w�Дԍ��A�����A�_������ǂݍ��݁A�z��Ɋi�[ */
        inputTestRecords();

        /* �z����w�Дԍ����Ƀ\�[�g���� */
        Arrays.sort(records, TestRecord.getSorter());

        /* �o�͂���t�@�C�����̓��͂��󂯕t���� */
        System.out.print("�o�͂���t�@�C�������w�肵�Ă������� > ");
        String fileName = is.input();

        /* �󂯕t�����t�@�C����Writer�𐶐��A�z��̒��g�����ׂď������� */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (TestRecord record : records) {
                writer.write(record.getCSV() + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("���o�̓G���[�ł�");
            System.exit(1);
        }
    }

    private int inputRecord_num() {
        while (true) {
            try {
                int record_num = is.inputInt("�L�^���錏������͂��Ă�������(1~100) > ");
                rangeCheck(record_num);
                return record_num;
            }
            catch (InputNotIntegerException e) {
                printErrMsg("�����ł͂���܂���\n�ē��͂��Ă�������");
            }
            catch (RangeOverException e) {
                printErrMsg("�l���͈͂𒴂��Ă��܂�\n1 ~ 100 �܂ł̒l����͂��Ă�������");
            }
        }
    }

    private static void rangeCheck(int record_num) {
        if (record_num <= 0 || record_num > 100) {
            throw new RangeOverException();
        }
    }

    private void inputTestRecords() {
        for (int i = 0; i < records.length; i++) {
            /* ����while���₾ */
            while (true) {
                try {
                    System.out.print("�w�Дԍ��A�����A�_������͂��Ă�������(�X�y�[�X��؂�)\n> ");
                    String info = is.input();

                    checkInfo(info);

                    records[i] = createTestRecord(info);
                    break;
                }
                catch (ScoreRangeOverException e) {
                    printErrMsg("�_���̒l���s���ł�\n0 ~ 100 �܂ł̒l�œ��͂��Ă�������");
                }
                catch (RangeOverException e) {
                    printErrMsg("�w�Дԍ��̒l���s���ł�\n�V���ȓ��̐����œ��͂��Ă�������");
                }
                catch (IllegalNameLengthException e) {
                    printErrMsg("�����̒������s���ł�\n�P�U�����ȓ��œ��͂��Ă�������");
                }
                catch (IllegalFormatException e) {
                    printErrMsg("�w�Дԍ��A�����A�_�����������w�肳��Ă��܂���\n�ē��͂��Ă�������");
                }
            }
        }
    }

    private void checkInfo(String info) {
        /* �������Ƃ��x����ĂĂ�����
         * �v���t�@�N�^�����O
         */
        String[] infos = info.split(" ");
        if (infos.length != 3) {
            throw new IllegalFormatException();
        }
        int number = Integer.parseInt(infos[0]);
        String name = infos[1];
        int score = Integer.parseInt(infos[2]);

        /* 7���ȓ��̐������`�F�b�N */
        if (number < 0 || number >= 10000000) {
            throw new RangeOverException();
        }
        /* 16�����ȓ��̖��O���`�F�b�N */
        if (name.length() > 16) {
            throw new IllegalNameLengthException();
        }
        /* �_����0~100���`�F�b�N */
        if (score < 0 || score > 100) {
            throw new ScoreRangeOverException();
        }
    }

    private static TestRecord createTestRecord(String info) {
        /* �������Ƃ��x����ĂĂ�����
         * �v���t�@�N�^�����O
         */
        String[] infos = info.split(" ");
        /* �w�Дԍ���INT�^�ɕϊ� */
        int number = Integer.parseInt(infos[0]);
        /* ���O�Ƃ��Ă킩��₷���悤�ɕϐ��ɗ��Ƃ� */
        String name = infos[1];
        /* �_����INT�^�ɕϊ� */
        int score = Integer.parseInt(infos[2]);

        /* �w�Дԍ��A���O�A�_����������TestRecord�^�I�u�W�F�N�g�𐶐� */
        return new TestRecord(number, name, score);
    }

    private void printErrMsg(String msg) {
        System.out.println("---- error ----");
        System.out.println(msg);
        System.out.println("---------------");

    }
}

class RangeOverException extends RuntimeException {
    RangeOverException() {
        super("out of range");
    }
    RangeOverException(String msg) {
        super(msg);
    }
}

class IllegalNameLengthException extends RuntimeException {
    IllegalNameLengthException() {
        super("out of name length");
    }
}

class ScoreRangeOverException extends RangeOverException {
    ScoreRangeOverException() {
        super("out of range of score");
    }
}

class IllegalFormatException extends RuntimeException {
    IllegalFormatException() {
        super("IllegalFormat");
    }
}

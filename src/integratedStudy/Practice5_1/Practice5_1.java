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
        /* 何行読み込むか入力させる */
        int record_num = inputRecord_num();
        /* 入力された値分の要素数をもったTestRecord型配列を生成 */
        records = new TestRecord[record_num];

        /* 入力された値分の学籍番号、氏名、点数情報を読み込み、配列に格納 */
        inputTestRecords();

        /* 配列を学籍番号順にソートする */
        Arrays.sort(records, TestRecord.getSorter());

        /* 出力するファイル名の入力を受け付ける */
        System.out.print("出力するファイル名を指定してください > ");
        String fileName = is.input();

        /* 受け付けたファイルのWriterを生成、配列の中身をすべて書き込む */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (TestRecord record : records) {
                writer.write(record.getCSV() + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("入出力エラーです");
            System.exit(1);
        }
    }

    private int inputRecord_num() {
        while (true) {
            try {
                int record_num = is.inputInt("記録する件数を入力してください(1~100) > ");
                rangeCheck(record_num);
                return record_num;
            }
            catch (InputNotIntegerException e) {
                printErrMsg("整数ではありません\n再入力してください");
            }
            catch (RangeOverException e) {
                printErrMsg("値が範囲を超えています\n1 ~ 100 までの値を入力してください");
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
            /* このwhileがやだ */
            while (true) {
                try {
                    System.out.print("学籍番号、氏名、点数を入力してください(スペース区切り)\n> ");
                    String info = is.input();

                    checkInfo(info);

                    records[i] = createTestRecord(info);
                    break;
                }
                catch (ScoreRangeOverException e) {
                    printErrMsg("点数の値が不正です\n0 ~ 100 までの値で入力してください");
                }
                catch (RangeOverException e) {
                    printErrMsg("学籍番号の値が不正です\n７桁以内の整数で入力してください");
                }
                catch (IllegalNameLengthException e) {
                    printErrMsg("氏名の長さが不正です\n１６文字以内で入力してください");
                }
                catch (IllegalFormatException e) {
                    printErrMsg("学籍番号、氏名、点数が正しく指定されていません\n再入力してください");
                }
            }
        }
    }

    private void checkInfo(String info) {
        /* 同じことを二度やっててださい
         * 要リファクタリング
         */
        String[] infos = info.split(" ");
        if (infos.length != 3) {
            throw new IllegalFormatException();
        }
        int number = Integer.parseInt(infos[0]);
        String name = infos[1];
        int score = Integer.parseInt(infos[2]);

        /* 7桁以内の整数かチェック */
        if (number < 0 || number >= 10000000) {
            throw new RangeOverException();
        }
        /* 16文字以内の名前かチェック */
        if (name.length() > 16) {
            throw new IllegalNameLengthException();
        }
        /* 点数が0~100かチェック */
        if (score < 0 || score > 100) {
            throw new ScoreRangeOverException();
        }
    }

    private static TestRecord createTestRecord(String info) {
        /* 同じことを二度やっててださい
         * 要リファクタリング
         */
        String[] infos = info.split(" ");
        /* 学籍番号をINT型に変換 */
        int number = Integer.parseInt(infos[0]);
        /* 名前としてわかりやすいように変数に落とす */
        String name = infos[1];
        /* 点数をINT型に変換 */
        int score = Integer.parseInt(infos[2]);

        /* 学籍番号、名前、点数を引数にTestRecord型オブジェクトを生成 */
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

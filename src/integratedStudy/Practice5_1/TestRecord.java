package integratedStudy.Practice5_1;

import java.util.Comparator;

public class TestRecord {
    private int studentNumber;
    private String studentName;
    private int testScore;

    public TestRecord(int number, String name, int score) {
        studentNumber = number;
        studentName = name;
        testScore = score;
    }

    public int getNumber() {
        return studentNumber;
    }

    public String getName() {
        return studentName;
    }

    public int getScore() {
        return testScore;
    }

    public String getCSV() {
        return studentNumber + "," + studentName + "," + testScore;
    }

    public static Comparator getSorter() {
        return new TestRecordSorter();
    }
}

class TestRecordSorter implements Comparator<TestRecord> {
    public int compare(TestRecord tr1, TestRecord tr2) {
        if (tr1.getNumber() == tr2.getNumber()) {
            return 0;
        }
        return tr1.getNumber() > tr2.getNumber() ? 1 : -1;
    }
}

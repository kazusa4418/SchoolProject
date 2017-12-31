package Exam08_03_06;

public class Test {
    //Checkクラスですでに引数が0~100の値に収まっていることを前提として作っています。
    public char judge(int score) {
        char result;

        if (score >= 90) result = 'S';
        else if (score >= 80) result = 'A';
        else if (score >= 70) result = 'B';
        else if (score >= 60) result = 'C';
        else result = 'D';

        return result;
    }
}

package Exam08_03_06;

public class Test {
    //Check�N���X�ł��łɈ�����0~100�̒l�Ɏ��܂��Ă��邱�Ƃ�O��Ƃ��č���Ă��܂��B
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

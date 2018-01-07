package Exam08_03_01;

class Tax {
    static int include(int price) {
        return (price >= 0) ? (int) (price * 1.08) : -1;
    }
}

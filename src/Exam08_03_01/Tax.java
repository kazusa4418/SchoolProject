package Exam08_03_01;

class Tax {
    static int include(int price) {
        if (price >= 0) {
            return (int)(price * 1.08);
        } else {
            return -1;
        }
    }
}

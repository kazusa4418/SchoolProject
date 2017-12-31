package Exam08_03_02;

class Area {
    double triangle(int base, int high) {
        if (base >= 1 && high >= 1) return base * high / 2.0;

        if (base <= 0 && high <= 0) return -3;
        else if (high <= 0) return -2;
        else return -1;
    }
}

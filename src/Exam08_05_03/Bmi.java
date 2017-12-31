package Exam08_05_03;

class Bmi {
    boolean check(double info) {
        return info >= 0.0;
    }

    double result(double height, double weight) {
        return weight / height / height * 10000;
    }

    double idealWeight(double height) {
        return (height - 100) * 0.9;
    }
}

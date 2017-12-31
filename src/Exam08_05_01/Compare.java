package Exam08_05_01;

class Compare {
    int max(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            max = Math.max(number, max);
        }
        return max;
    }
}

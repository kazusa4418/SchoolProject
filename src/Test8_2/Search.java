package Test8_2;

class Search {
    public int minimum(int[] arrayData) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] < minValue)
                minValue = arrayData[i];
        }
        return minValue;
    }

    public int maximum(int[] arrayData) {
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] > maxValue)
                maxValue = arrayData[i];
        }
        return maxValue;
    }
}

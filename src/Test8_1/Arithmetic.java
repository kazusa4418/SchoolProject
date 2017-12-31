package Test8_1;

public class Arithmetic {
    public double absolute(double value) {
        if (value < 0)
            value *= -1.0;
        return value;
    }

    public int absolute(int value) {
        return (int) absolute((double) value);
    }

    public int round(double value) {
        int sign = 1;
        if (value < 0)
            sign = -1;
        value += (0.5 * sign);
        return (int) value;
    }
}

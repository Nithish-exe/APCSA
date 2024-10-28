package COW5;

public class StatisticalCalculator {
    public static double sumArray(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }

    public static double getAverageValue(double[] values) {
        if (values.length == 0) return 0;
        return sumArray(values) / values.length;
    }

    public static double getMedianValue(double[] values) {
        if (values.length % 2 == 1) {
            return values[values.length / 2];
        } else {
            return (values[values.length / 2 - 1] + values[values.length / 2]) / 2.0;
        }
    }

    public static double standardDeviation(double[] values) {
        double mean = getAverageValue(values);
        double sumOfSquares = 0;
        for (double value : values) {
            sumOfSquares += Math.pow(value - mean, 2);
        }
        return Math.sqrt(sumOfSquares / values.length);
    }

    public static double[] getDeviations(double[] values) {
        double mean = getAverageValue(values);
        double[] deviations = new double[values.length];
        double stdDev = standardDeviation(values);
        for (int i = 0; i < values.length; i++) {
            deviations[i] = (values[i] - mean) / stdDev;
        }
        return deviations;
    }

    public static double getCorrelation(double[] xValues, double[] yValues) {
        return 0;
    }
}

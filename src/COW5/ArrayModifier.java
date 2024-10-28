package COW5;

public class ArrayModifier {
    public static double[] flip(double[] data) {
        double[] flippedData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            flippedData[i] = -data[i];
        }
        return flippedData;
    }

    public static double[] amplify(double[] data, double multiplier) {
        double[] amplifiedData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            amplifiedData[i] = data[i] * multiplier;
        }
        return amplifiedData;
    }

    public static double[] cap(double[] data, int min, int max) {
        double[] cappedData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) cappedData[i] = min;
            else if (data[i] > max) cappedData[i] = max;
            else cappedData[i] = data[i];
        }
        return cappedData;
    }

    public static double[] averageElements(double[] data1, double[] data2) {
        double[] averagedData = new double[data1.length];
        for (int i = 0; i < data1.length; i++) {
            averagedData[i] = (data1[i] + data2[i]) / 2;
        }
        return averagedData;
    }

    public static double[] evenOut(double[] data) {
        double[] evenedOutData = new double[data.length];
        if (data.length > 0) evenedOutData[0] = (data[0] + data[1]) / 2;
        for (int i = 1; i < data.length - 1; i++) {
            evenedOutData[i] = (data[i - 1] + data[i] + data[i + 1]) / 3;
        }
        if (data.length > 1) evenedOutData[data.length - 1] = (data[data.length - 2] + data[data.length - 1]) / 2;
        return evenedOutData;
    }

    public static double[] compress(double[] data) {
        return new double[1];
    }

}

package COW5;

public class ArrayPrinter {
    public static void print(int[] array, Intake feed) {
        for (int i = 0; i < array.length; i++) {
            feed.give(array[i]);
        }
    }

    public static void printReverse(int[] array, Intake feed) {
        for (int i = array.length - 1; i >= 0; i--) {
            feed.give(array[i]);
        }
    }

    public static void printEveryOtherElement(int[] array, Intake feed) {
        for (int i = 0; i < array.length; i += 2) {
            feed.give(array[i]);
        }
    }

    public static void printFirstHalf(int[] array, Intake feed) {
        int mid = array.length / 2;
        for (int i = 0; i < mid; i++) {
            feed.give(array[i]);
        }
    }

    public static void printSecondHalf(int[] array, Intake feed) {
        int mid = array.length / 2 + (array.length % 2 == 0 ? 0 : 1);
        for (int i = mid; i < array.length; i++) {
            feed.give(array[i]);
        }
    }

    public static void printSection(int[] array, Intake feed, int startIndex, int endIndex) {

    }
}

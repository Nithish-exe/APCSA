package COW5;

public class ArrayCounter {
    public static int countPositives(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num > 0) count++;
        }
        return count;
    }

    public static int countNegativeOdds(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0 && num % 2 != 0) count++;
        }
        return count;
    }

    public static int countInRange(int[] numbers, int min, int max) {
        int count = 0;
        for (int num : numbers) {
            if (num >= min && num <= max) count++;
        }
        return count;
    }

    public static int countPairs(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static int countUniqueElements(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) count++;
        }
        return count;
    }

    public static int countNonUniqueElements(int[] numbers) {
        int count = 0;

        return count;
    }

}

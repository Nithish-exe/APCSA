package COW5;

public class ArrayAnalyzer {
    public boolean hasValue(int[] array, int value) {
        boolean hasVal = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                hasVal = true;
                break;
            }
        }
        return hasVal;
    }

    public boolean allTheSame(int[] array) {
        int firstElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != firstElement){
                return false;
            }
        }
        return true;
    }

    public boolean isDecending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) return false;
        }
        return true;
    }

    public boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) return false;
        }
        return true;
    }

    public boolean inOrder(int[] array) {
        boolean ascending = true;
        boolean descending = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]){
                descending = false;
            }if (array[i] < array[i - 1]){
                ascending = false;
            }if (!ascending && !descending){
                return false;
            }
        }
        return ascending || descending;
    }

    public boolean equal(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public boolean hasTwoUniquePairs(int[] array) {
        return false;
    }
}

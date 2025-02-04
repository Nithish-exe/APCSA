package COW_11;

import java.util.ArrayList;

public class ListPractice1 {
    public static void print(ArrayList<Integer> numbers, Intake feed) {
        for (int i = 0; i < numbers.size(); i++) {
            feed.give(numbers.get(i));
        }
    }

    public static void printReverse(ArrayList<Integer> numbers, Intake feed) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            feed.give(numbers.get(i));
        }
    }

    public static void printPositives(ArrayList<Integer> numbers, Intake feed) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                feed.give(numbers.get(i));
            }
        }
    }

    public static void printNegativeOdds(ArrayList<Integer> numbers, Intake feed) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0 && numbers.get(i) % 2 != 0) {
                feed.give(numbers.get(i));
            }
        }
    }

    public static void printMultiples(ArrayList<Integer> numbers, Intake feed, int num) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % num == 0) {
                feed.give(numbers.get(i));
            }
        }
    }
}

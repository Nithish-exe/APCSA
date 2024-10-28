package COW2;

public class NumberAnalyzer {
    public boolean isItEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isItASingleDigit(int number) {
        if (number >= -9 && number <= 9) {
            return true;
        } else {
            return false;
        }
    }

    public String whatTypeOfNumberIsIt(int number) {
        if (number == 0) {
            return "zero";
        } else if (number > 0 && number % 2 == 0) {
            return "positive even";
        } else if (number > 0) {
            return "positive odd";
        } else if (number < 0 && number % 2 == 0) {
            return "negative even";
        } else {
            return "negative odd";
        }
    }

    public int howManyAreTheSame(int num1, int num2, int num3, int num4) {
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            return 4;
        } else if ((num1 == num2 && num2 == num3) || (num1 == num2 && num2 == num4) ||
                (num1 == num3 && num3 == num4) || (num2 == num3 && num3 == num4)) {
            return 3;
        } else if ((num1 == num2 && num3 == num4) || (num1 == num3 && num2 == num4) || (num1 == num4 && num2 == num3)) {
            return 2;
        } else if (num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int getMostCommonNumber(int num1, int num2, int num3, int num4, int num5) {
        return 0;
    }

}

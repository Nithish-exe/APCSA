import java.util.ArrayList;

public class RandomStuffLev2Tester {
    public static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    public static String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String specials = "~`!@#$%^&*()_-+=[]{};:'|<,>.?/";
    public static String numbers = "0123456789";
    public static String all = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~`!@#$%^&*()_-+=[]{};:'|<,>.?/";
    public static String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

    public static void main(String[] args) {
        testLevel2();
    }

    public static boolean testLevel2() {
        boolean result1 = testLowerCase();

        boolean result2 = testUpperCase();
        boolean result3 = testSpecialCharacter();
        boolean result4 = testNumberCharacter();
        boolean result5 = testLetter();
        boolean result6 = testState();
        if (result1 && result2 && result3 && result4 && result5 && result6) {
            System.out.println("Level 2 success!");
            return true;
        } else {
            System.out.println("Level 2 error.");
            return false;
        }
    }

    public static boolean testLowerCase() {
        boolean success = true;
        int size = lowerCase.length();
        double multiples = 2000;
        int[] results = new int[lowerCase.length()];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            char result = RandomStuff.randomLowerCaseLetter();
            if (!lowerCase.contains("" + result)) {
                System.out.println("randomLowerCaseLetter fails");
                return false;
            }
            results[lowerCase.indexOf("" + result)] += 1;
        }
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("randomLowerCaseLetter fails");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testUpperCase() {
        boolean success = true;
        int size = upperCase.length();
        double multiples = 2000;
        int[] results = new int[upperCase.length()];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            char result = RandomStuff.randomUpperCaseLetter();
            if (!upperCase.contains("" + result)) {
                System.out.println("randomUpperCaseLetter fails");
                return false;
            }
            results[upperCase.indexOf("" + result)] += 1;
        }
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("randomUpperCaseLetter fails");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testSpecialCharacter() {
        boolean success = true;
        int size = specials.length();
        double multiples = 2000;
        int[] results = new int[specials.length()];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            char result = RandomStuff.randomSpecialCharacter();
            if (!specials.contains("" + result)) {
                System.out.println("randomSpecialCharacter fails");
                return false;
            }
            results[specials.indexOf("" + result)] += 1;
        }
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("randomSpecialCharacter fails");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testNumberCharacter() {
        boolean success = true;
        int size = numbers.length();
        double multiples = 2000;
        int[] results = new int[numbers.length()];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            char result = RandomStuff.randomNumberCharacter();
            if (!numbers.contains("" + result)) {
                System.out.println("randomNumberCharacter fails");
                return false;
            }
            results[numbers.indexOf("" + result)] += 1;
        }
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("randomNumberCharacter fails");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testLetter() {
        boolean success = true;
        int size = all.length();
        double multiples = 2000;
        int[] results = new int[all.length()];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            char result = RandomStuff.randomLetter();
            if (!all.contains("" + result)) {
                System.out.println("randomLetter() fails");
                return false;
            }
            results[all.indexOf("" + result)] += 1;
        }
        for (int i = 0; i < results.length; i++) {
            //System.out.println("randomLetter(): " + results[i]);
            if (results[i] < multiples / 2) {
                System.out.println("randomLetter() fails");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testState() {
        int size = states.length;
        double multiples = 2000;
        int[] results = new int[states.length];
        ArrayList<String> statesList = new ArrayList<String>();
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
            statesList.add(states[i]);
        }
        for (int n = 1; n < size * multiples; n++) {
            String result = RandomStuff.randomState();
            if (!statesList.contains(result)) {
                System.out.println("randomState() fails");
                return false;
            }
            results[statesList.indexOf(result)] += 1;
        }
        boolean success = true;
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("randomState() fails");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }
}

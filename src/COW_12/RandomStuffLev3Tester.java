/**
 * Write a description of class RandomStuffLev3Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomStuffLev3Tester {
    public static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    public static String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String specials = "~`!@#$%^&*()_-+=[]{};:'|<,>.?/";
    public static String numbers = "0123456789";
    public static String all = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~`!@#$%^&*()_-+=[]{};:'|<,>.?/";
    public static String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

    public static void main(String[] args) {
        testLevel3();
    }

    public static boolean testLevel3() {
        boolean result1 = testRandomString();
        boolean result2 = testRandomStringN();
        boolean result3 = testRandomStringNumber();
        if (result1 && result2 && result3) {
            System.out.println("Level 3 success!");
            return true;
        } else {
            System.out.println("Level 3 error.");
            return false;
        }
    }

    public static boolean testRandomString() {
        boolean success = true;
        int size = all.length();
        double multiples = 2000;
        int[] results = new int[all.length()];
        double letterCount = 0;
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            String result = RandomStuff.randomString();
            letterCount += 3;
            if (result.length() != 3) {
                System.out.println("randomString() fails");
                return false;
            }
            for (int i = 0; i < result.length(); i++) {
                char letter = result.charAt(i);
                if (!all.contains("" + letter)) {
                    System.out.println("randomString() fails");
                    return false;
                }
                results[all.indexOf("" + letter)] += 1;
            }
        }

        for (int i = 0; i < results.length; i++) {
            if (results[i] < letterCount / (size * 10)) {
                System.out.println("randomString() fails");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testRandomStringN() {
        boolean success = true;
        int size = all.length();
        double multiples = 1000;
        int[] results = new int[all.length()];
        double letterCount = 0;
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            int len = (int) (Math.random() * 30);
            String result = RandomStuff.randomString(len);
            letterCount += len;
            if (result.length() != len) {
                System.out.println("randomStringN() fails - length fault");
                return false;
            }
            for (int i = 0; i < result.length(); i++) {
                char letter = result.charAt(i);
                if (!all.contains("" + letter)) {
                    System.out.println("randomStringN() fails - letter fault");
                    return false;
                }
                results[all.indexOf("" + letter)] += 1;
            }
        }

        for (int i = 0; i < results.length; i++) {
            if (results[i] < letterCount / (size * 10)) {
                System.out.println("randomStringN() fails - dist fault");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testRandomStringNumber() {
        boolean success = true;
        int size = numbers.length();
        double multiples = 1000;
        int[] results = new int[numbers.length()];
        double letterCount = 0;
        double numNegatives = 0;
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            int len = 1 + (int) (Math.random() * 30);
            String result = RandomStuff.randomStringNumber(len);
            if (result.charAt(0) == '-') {
                numNegatives += 1;
                result = result.substring(1);
            }
            letterCount += len;
            if (result.length() != len) {
                System.out.println("randomStringNumber() fails - length fault");
                //System.out.println("Len: " + len + ", result: " + result);
                return false;
            }
            for (int i = 0; i < result.length(); i++) {
                char letter = result.charAt(i);
                if (!numbers.contains("" + letter)) {
                    System.out.println("randomStringNumber() fails - letter fault");
                    return false;
                }
                results[numbers.indexOf("" + letter)] += 1;
            }
        }
        if (Math.abs(numNegatives / (size * multiples) - .5) > .1) {
            System.out.println("randomStringNumber() fails - negatives count fault");
            return false;
        }
        for (int i = 0; i < results.length; i++) {
            if (results[i] < letterCount / (size * 10)) {
                System.out.println("randomStringNumber() fails - dist fault");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }
}
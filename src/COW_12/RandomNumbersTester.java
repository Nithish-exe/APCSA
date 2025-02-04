public class RandomNumbersTester {
    public static void main(String[] args) {
        testLevel1();
    }

    public static boolean testLevel1() {
        boolean result1 = test1();
        boolean result2 = test2();
        boolean result3 = test3();
        boolean result4 = test4();
        boolean result5 = test5();
        boolean result6 = test6();
        if (result1 && result2 && result3 && result4 && result5 && result6) {
            System.out.println("Level 1 success!");
            return true;
        } else {
            System.out.println("Level 1 error.");
            return false;
        }
    }

    public static boolean test1() {
        int size = 11;
        double multiples = 2000;
        int[] results = new int[size];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            int result = RandomNumbers.random1();
            if (result < 0 || result > 10) {
                System.out.println("random1 fails");
                return false;
            }
            results[result] += 1;
        }
        boolean success = true;
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("random1 fails");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean test2() {
        int size = 101;
        double multiples = 2000;
        int[] results = new int[size];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            int result = RandomNumbers.random2();
            if (result < 0 || result > 100) {
                System.out.println("random2 fails");
                return false;
            }
            results[result] += 1;
        }
        boolean success = true;
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("random2 fails");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean test3() {
        int size = 101;
        double multiples = 2000;
        int[] results = new int[size];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            int result = RandomNumbers.random3();
            if (result < 10 || result > 110) {
                System.out.println("random3 fails");
                return false;
            }
            results[result - 10] += 1;
        }
        boolean success = true;
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("random3 fails");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean test4() {
        int size = 567;
        double multiples = 2000;
        int[] results = new int[size];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            int result = RandomNumbers.random4();
            if (result < 12 || result > 578) {
                System.out.println("random4 fails");
                return false;
            }
            results[result - 12] += 1;
        }
        boolean success = true;
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("random4 fails");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean test5() {
        int size = 130;
        double multiples = 2000;
        int[] results = new int[size];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            int result = RandomNumbers.random5();
            if (result < -142 || result > -13) {
                System.out.println("random5 fails");
                return false;
            }
            results[result + 142] += 1;
        }
        boolean success = true;
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("random5 fails");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean test6() {
        int size = 713;
        double multiples = 2000;
        int[] results = new int[size];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            int result = RandomNumbers.random6();
            if (result < -300 || result > 412) {
                System.out.println("random6 fails");
                return false;
            }
            results[result + 300] += 1;
        }
        boolean success = true;
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("random6 fails");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }
}

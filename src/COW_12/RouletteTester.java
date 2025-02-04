import java.util.ArrayList;

public class RouletteTester {
    public static void main(String[] args) {
        testLevel5();
    }

    public static boolean testLevel5() {
        boolean result1 = testWheel1();
        boolean result2 = testWheel2();
        boolean result3 = testAddRandomNumber();
        boolean result4 = testGetWinnings();
        if (result1 && result2 && result3 && result4) {
            System.out.println("Level 5 success!");
            return true;
        } else {
            System.out.println("Level 5 error.");
            return false;
        }
    }

    public static boolean testWheel1() {
        int size = 37;
        double multiples = 2000;
        int[] results = new int[size];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            Wheel theWheel = new Wheel();
            theWheel.spin();
            int result = theWheel.getResult();
            if (result < 0 || result > 36) {
                System.out.println("wheel fails - range");
                return false;
            }
            results[result] += 1;
        }
        boolean success = true;
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("wheel fails - distribution");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testWheel2() {
        Wheel theWheel = new Wheel();
        int[] settings = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        boolean[] oddResults = {false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false};
        boolean[] evenResults = {false, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false};
        boolean[] firstThird = {false, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        boolean[] secondThird = {false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false};
        boolean[] thirdThird = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true};
        for (int i = 0; i < settings.length; i++) {
            theWheel.setResult(settings[i]);
            if (theWheel.isOdd() != oddResults[i]) {
                System.out.println("isOdd error");
                return false;
            }
            if (theWheel.isEven() != evenResults[i]) {
                System.out.println("isEven error");
                return false;
            }
            if (theWheel.whichThird() == 1 && !firstThird[i] || theWheel.whichThird() != 1 && firstThird[i]) {
                System.out.println("firstThird error");
                return false;
            }
            if (theWheel.whichThird() == 2 && !secondThird[i] || theWheel.whichThird() != 2 && secondThird[i]) {
                System.out.println("secondThird error");
                return false;
            }
            if (theWheel.whichThird() == 3 && !thirdThird[i] || theWheel.whichThird() != 3 && thirdThird[i]) {
                System.out.println("thirdThird error");
                return false;
            }
        }
        return true;
    }

    public static boolean testAddRandomNumber() {
        int size = 36;
        double multiples = 2000;
        int[] results = new int[size];
        Roulette table = new Roulette();
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n <= size * multiples; n++) {
            table.addRandomNumber();
        }
        ArrayList<Integer> bets = table.getNumberBets();
        if (bets.size() != size * multiples) {
            System.out.println("AddRandomNumber fails - list size");
            return false;
        }
        for (int i = 0; i < bets.size(); i++) {
            int result = bets.get(i);
            if (result < 1 || result > 36) {
                System.out.println("AddRandomNumber fails - range");
                return false;
            }
            results[result - 1] += 1;
        }
        boolean success = true;
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("AddRandomNumber fails - distribution");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testGetWinnings() {
        Roulette table = new Roulette();
        table.setBetAmounts(311, 2312, 2784, 131, 5325, new ArrayList<Integer>());
        table.setWheel(0);
        if (table.getWinnings() != 0) {
            System.out.println("getWinnings fails - 0");
            return false;
        }
        table.setBetAmounts(311, 2312, 0, 0, 0, new ArrayList<Integer>());
        table.setWheel(5);
        if (table.getWinnings() != 622) {
            System.out.println("getWinnings fails - odd");
            return false;
        }
        table.setBetAmounts(311, 2312, 0, 0, 0, new ArrayList<Integer>());
        table.setWheel(24);
        if (table.getWinnings() != 4624) {
            System.out.println("getWinnings fails - even");
            return false;
        }
        table.setBetAmounts(0, 0, 42, 184, 87, new ArrayList<Integer>());
        table.setWheel(12);
        if (table.getWinnings() != 126) {
            System.out.println("getWinnings fails - first");
            return false;
        }
        table.setBetAmounts(0, 0, 42, 184, 87, new ArrayList<Integer>());
        table.setWheel(13);
        if (table.getWinnings() != 552) {
            System.out.println("getWinnings fails - second");
            return false;
        }
        table.setBetAmounts(0, 0, 42, 184, 87, new ArrayList<Integer>());
        table.setWheel(25);
        if (table.getWinnings() != 261) {
            System.out.println("getWinnings fails - third");
            return false;
        }
        ArrayList<Integer> bets = new ArrayList<Integer>();
        bets.add(13);
        bets.add(33);
        bets.add(3);
        bets.add(13);
        bets.add(13);
        table.setBetAmounts(0, 0, 0, 0, 0, bets);
        table.setWheel(13);
        if (table.getWinnings() != 108) {
            System.out.println("getWinnings fails - bets");
            return false;
        }
        bets = new ArrayList<Integer>();
        bets.add(21);
        bets.add(5);
        bets.add(26);
        bets.add(26);
        bets.add(24);
        table.setBetAmounts(16, 42, 25, 72, 34, bets);
        table.setWheel(5);
        if (table.getWinnings() != 143) {
            System.out.println("getWinnings fails - all 1 - " + table.getWinnings());
            return false;
        }
        table.setWheel(26);
        if (table.getWinnings() != 258) {
            System.out.println("getWinnings fails - all 2 - " + table.getWinnings());
            return false;
        }
        table.setWheel(24);
        if (table.getWinnings() != 336) {
            System.out.println("getWinnings fails - all 3 - " + table.getWinnings());
            return false;
        }
        table.setWheel(25);
        if (table.getWinnings() != 134) {
            System.out.println("getWinnings fails - all 4 - " + table.getWinnings());
            return false;
        }
        table.setWheel(0);
        if (table.getWinnings() != 0) {
            System.out.println("getWinnings fails - all 5 - " + table.getWinnings());
            return false;
        }
        return true;
    }

}

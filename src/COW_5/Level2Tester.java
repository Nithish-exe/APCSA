package COW5;

public class Level2Tester {
    public static double getLevel2Score() {
        double score = 0;
        if (ArrayPrinterTester.testPrintReverse()) {
            score += .2;
        }
        if (ArrayCounterTester.testCountNegativeOdds()) {
            score += .2;
        }
        if (ArrayModifierTester.testAmplify()) {
            score += .2;
        }
        if (StatisticalCalcTester.testGetAverageValue()) {
            score += .2;
        }
        if (ArrayAnalyzerTester.testAllTheSame()) {
            score += .2;
        }
        return score;
    }

    public static void main(String[] arg) {
        testLevel2();
    }

    public static void testLevel2() {
        boolean printReverse = ArrayPrinterTester.testPrintReverse();
        boolean countNegativeOdds = ArrayCounterTester.testCountNegativeOdds();
        boolean amplify = ArrayModifierTester.testAmplify();
        boolean ave = StatisticalCalcTester.testGetAverageValue();
        boolean allTheSameWorks = ArrayAnalyzerTester.testAllTheSame();

        if (printReverse && countNegativeOdds && amplify && ave && allTheSameWorks) {
            System.out.println("Level 2 works");
        } else {
            System.out.println("Level 2 does NOT work");
        }
    }
}

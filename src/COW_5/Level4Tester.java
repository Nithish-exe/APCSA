package COW5;

public class Level4Tester {
    public static double getLevel4Score() {
        double score = 0;
        if (ArrayPrinterTester.testPrintFirstHalf()) {
            score += .2;
        }
        if (ArrayCounterTester.testCountPairs()) {
            score += .2;
        }
        if (ArrayModifierTester.testAverageElements()) {
            score += .2;
        }
        if (StatisticalCalcTester.testStandardDeviation()) {
            score += .2;
        }
        if (ArrayAnalyzerTester.testEqual()) {
            score += .2;
        }
        return score;
    }

    public static void main(String[] arg) {
        testLevel4();
    }

    public static void testLevel4() {
        boolean printFirstHalf = ArrayPrinterTester.testPrintFirstHalf();
        boolean countPairs = ArrayCounterTester.testCountPairs();
        boolean averageElements = ArrayModifierTester.testAverageElements();
        boolean deviation = StatisticalCalcTester.testStandardDeviation();
        boolean equalWorks = ArrayAnalyzerTester.testEqual();

        if (printFirstHalf && countPairs && averageElements && deviation && equalWorks) {
            System.out.println("Level 4 works");
        } else {
            System.out.println("Level 4 does NOT work");
        }
    }
}

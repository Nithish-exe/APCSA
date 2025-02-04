package COW5;

public class Level3Tester {
    public static double getLevel3Score() {
        double score = 0;
        if (ArrayPrinterTester.testPrintEveryOtherElement()) {
            score += .2;
        }
        if (ArrayCounterTester.testCountInRange()) {
            score += .2;
        }
        if (ArrayModifierTester.testCap()) {
            score += .2;
        }
        if (StatisticalCalcTester.testGetMedianValue()) {
            score += .2;
        }
        if (ArrayAnalyzerTester.testIsAscending() && ArrayAnalyzerTester.testIsDecending()) {
            score += .2;
        }
        return score;
    }

    public static void main(String[] arg) {
        testLevel3();
    }

    public static void testLevel3() {
        boolean printEveryOtherElement = ArrayPrinterTester.testPrintEveryOtherElement();
        boolean countInRange = ArrayCounterTester.testCountInRange();
        boolean cap = ArrayModifierTester.testCap();
        boolean median = StatisticalCalcTester.testGetMedianValue();
        boolean isAscendingWorks = ArrayAnalyzerTester.testIsAscending();
        boolean isDecendingWorks = ArrayAnalyzerTester.testIsDecending();

        if (printEveryOtherElement && countInRange && cap && median && isAscendingWorks && isDecendingWorks) {
            System.out.println("Level 3 works");
        } else {
            System.out.println("Level 3 does NOT work");
        }
    }
}

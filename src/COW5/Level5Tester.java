package COW5;

public class Level5Tester {
    public static double getLevel5Score() {
        double score = 0;
        if (ArrayPrinterTester.testPrintSecondHalf()) {
            score += .2;
        }
        if (ArrayCounterTester.testCountUniqueElements()) {
            score += .2;
        }
        if (ArrayModifierTester.testEvenOut()) {
            score += .2;
        }
        if (StatisticalCalcTester.testGetDeviations()) {
            score += .2;
        }
        if (ArrayAnalyzerTester.testInOrder()) {
            score += .2;
        }
        return score;
    }

    public static void main(String[] arg) {
        testLevel5();
    }

    public static void testLevel5() {
        boolean printSecondHalf = ArrayPrinterTester.testPrintSecondHalf();
        boolean countUniqueElements = ArrayCounterTester.testCountUniqueElements();
        boolean evenOut = ArrayModifierTester.testEvenOut();
        boolean getDeviations = StatisticalCalcTester.testGetDeviations();
        boolean inOrder = ArrayAnalyzerTester.testInOrder();

        if (printSecondHalf && countUniqueElements && evenOut && getDeviations && inOrder) {
            System.out.println("Level 5 works");
        } else {
            System.out.println("Level 5 does NOT work");
        }
    }
}
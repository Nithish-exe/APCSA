package COW5;

public class Level1Tester {
    public static double getLevel1Score() {
        double score = 0;
        if (ArrayPrinterTester.testPrint()) {
            score += .2;
        }
        if (ArrayCounterTester.testCountPositives()) {
            score += .2;
        }
        if (ArrayModifierTester.testFlip()) {
            score += .2;
        }
        if (StatisticalCalcTester.testSumArray()) {
            score += .2;
        }
        if (ArrayAnalyzerTester.testHasValue()) {
            score += .2;
        }
        return score;
    }

    public static void main(String[] arg) {
        testLevel1();
    }

    public static void testLevel1() {
        boolean print = ArrayPrinterTester.testPrint();
        boolean countPositives = ArrayCounterTester.testCountPositives();
        boolean flip = ArrayModifierTester.testFlip();
        boolean sumArray = StatisticalCalcTester.testSumArray();
        boolean hasValueWorks = ArrayAnalyzerTester.testHasValue();

        if (print && countPositives && flip && sumArray && hasValueWorks) {
            System.out.println("Level 1 works");
        } else {
            System.out.println("Level 1 does NOT work");
        }
    }
}

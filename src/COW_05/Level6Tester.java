package COW5;

public class Level6Tester {
    public static double getLevel6Score() {
        double score = 0;
        if (ArrayPrinterTester.testPrintSection()) {
            score += .2;
        }
        if (ArrayCounterTester.testCountNonUniqueElements()) {
            score += .2;
        }
        if (ArrayModifierTester.testCompress()) {
            score += .2;
        }
        if (StatisticalCalcTester.testGetCorrelation()) {
            score += .2;
        }
        if (ArrayAnalyzerTester.testHasTwoUniquePairs()) {
            score += .2;
        }
        return score;
    }

    public static void main(String[] arg) {
        testLevel6();
    }

    public static void testLevel6() {
        boolean printSection = ArrayPrinterTester.testPrintSection();
        boolean countNonUniqueElements = ArrayCounterTester.testCountNonUniqueElements();
        boolean compress = ArrayModifierTester.testCompress();
        boolean correlations = StatisticalCalcTester.testGetCorrelation();
        boolean hasTwoUniquePairsWorks = ArrayAnalyzerTester.testHasTwoUniquePairs();

        if (printSection && countNonUniqueElements && compress && correlations && hasTwoUniquePairsWorks) {
            System.out.println("Level 6 works");
        } else {
            System.out.println("Level 6 does NOT work");
        }
    }
}

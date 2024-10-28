package COW6;

public class Level3Tester
{
    public static double getLevel3Score(){
        double score = 0;
        if(StringPrinterTester.testPrintTwoWordsExact()){
            score += .2;
        }
        if(StringBuilderTester.testHideText()){
            score += .2;
        }
        if(StringBuilderTester.testReverseWord()){
            score += .2;
        }
        if(StringModifierTester.testRespondToAction()){
            score += .2;
        }
        if(StringAnalyzerTester.testCountConsonants()){
            score += .2;
        }
        return score;
    }
    public static void main(String [] arg){
        testLevel3();
    }
    public static void testLevel3(){
        boolean one = StringPrinterTester.testPrintTwoWordsExact();
        boolean two = StringBuilderTester.testHideText();
        boolean three = StringBuilderTester.testReverseWord();
        boolean four = StringModifierTester.testRespondToAction();
        boolean five = StringAnalyzerTester.testCountConsonants();

        if(one && two && three && four && five){
            System.out.println("Level 3 works");
        }else{
            System.out.println("Level 3 does NOT work");
        }
    }
}

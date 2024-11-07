package COW6;

public class Level1Tester
{
    public static double getLevel1Score(){
        double score = 0;
        if(StringPrinterTester.testPrintEachCharExact()){
            score += .2;
        }
        if(StringBuilderTester.testCombineWords()){
            score += .2;
        }
        if(StringModifierTester.testTurnIntoAllCaps()){
            score += .2;
        }
        if(StringModifierTester.testExclaimWord()){
            score += .2;
        }
        if(StringAnalyzerTester.testCountSentences()){
            score += .2;
        }
        return score;
    }
    public static void main(String [] arg){
        testLevel1();
    }
    public static void testLevel1(){
        boolean one = StringPrinterTester.testPrintEachCharExact();
        boolean two = StringBuilderTester.testCombineWords();
        boolean three = StringModifierTester.testTurnIntoAllCaps();
        boolean four = StringModifierTester.testExclaimWord();
        boolean five = StringAnalyzerTester.testCountSentences();

        if(one && two && three && four && five){
            System.out.println("Level 1 works");
        }else{
            System.out.println("Level 1 does NOT work");
        }
    }
}

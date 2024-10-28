package COW6;

public class Level2Tester
{
    public static double getLevel2Score(){
        double score = 0;
        if(StringPrinterTester.testPrintOutInReverseExact()){
            score += .2;
        }
        if(StringBuilderTester.testCombineNumTimes()){
            score += .2;
        }
        if(StringBuilderTester.testCombineWordsInOrder()){
            score += .2;
        }
        if(StringModifierTester.testTwistWord()){
            score += .2;
        }
        if(StringAnalyzerTester.testCountVowels()){
            score += .2;
        }
        return score;
    }
    public static void main(String [] arg){
        testLevel2();
    }
    public static void testLevel2(){
        boolean one = StringPrinterTester.testPrintOutInReverseExact();
        boolean two = StringBuilderTester.testCombineNumTimes();
        boolean three = StringBuilderTester.testCombineWordsInOrder();
        boolean four = StringModifierTester.testTwistWord();
        boolean five = StringAnalyzerTester.testCountVowels();

        if(one && two && three && four && five){
            System.out.println("Level 2 works");
        }else{
            System.out.println("Level 2 does NOT work");
        }
    }
}

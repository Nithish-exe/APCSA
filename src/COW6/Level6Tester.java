package COW6;

public class Level6Tester
{
    public static double getLevel6Score(){
        double score = 0;
        if(StringPrinterTester.testPrintWordsExact()){
            score += .2;
        }
        if(StringBuilderTester.testRepeatedAndReverse()){
            score += .2;
        }
        if(StringModifierTester.testPigLatinateText()){
            score += .2;
        }
        if(StringModifierTester.testStaggerCapitals()){
            score += .2;
        }
        if(StringAnalyzerTester.testFindWords()){
            score += .2;
        }
        return score;
    }
    public static void main(String [] arg){
        testLevel6();
    }
    public static void testLevel6(){
        boolean one = StringPrinterTester.testPrintWordsExact();
        boolean two = StringBuilderTester.testRepeatedAndReverse();
        boolean three = StringModifierTester.testPigLatinateText();
        boolean four = StringModifierTester.testStaggerCapitals();
        boolean five = StringAnalyzerTester.testFindWords();

        if(one && two && three && four && five){
            System.out.println("Level 6 works");
        }else{
            System.out.println("Level 6 does NOT work");
        }
    }
}

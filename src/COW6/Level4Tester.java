package COW6;

public class Level4Tester
{
    public static double getLevel4Score(){
        double score = 0;
        if(StringPrinterTester.testPrintOutBirthdayExact1()){
            score += .1;
        }
        if(StringPrinterTester.testPrintOutBirthdayExact2()){
            score += .1;
        }
        if(StringBuilderTester.testGetStartingLetters()){
            score += .2;
        }
        if(StringBuilderTester.testCombineWordsInOrder2()){
            score += .2;
        }
        if(StringModifierTester.testMakeMoreDramatic()){
            score += .2;
        }
        if(StringAnalyzerTester.testCountOccurences()){
            score += .2;
        }
        return score;
    }
    public static void main(String [] arg){
        testLevel4();
    }
    public static void testLevel4(){        
        boolean one1 = StringPrinterTester.testPrintOutBirthdayExact1();
        boolean one2 = StringPrinterTester.testPrintOutBirthdayExact2();
        boolean two = StringBuilderTester.testGetStartingLetters();
        boolean three = StringBuilderTester.testCombineWordsInOrder2();
        boolean four = StringModifierTester.testMakeMoreDramatic();
        boolean five = StringAnalyzerTester.testCountOccurences();

        if(one1 && one2 && two && three && four && five){
            System.out.println("Level 4 works");
        }else{
            System.out.println("Level 4 does NOT work");
        }
    }
}

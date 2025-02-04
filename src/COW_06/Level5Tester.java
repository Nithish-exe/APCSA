package COW6;

public class Level5Tester
{
    public static double getLevel5Score(){
        double score = 0;
        if(StringPrinterTester.testPrintOutAddressExact1()){
            score += .1;
        }
        if(StringPrinterTester.testPrintOutAddressExact2()){
            score += .1;
        }
        if(StringBuilderTester.testElongateWord()){
            score += .2;
        }
        if(StringModifierTester.testConvertPhoneNumber()){
            score += .2;
        }
        if(StringModifierTester.testPigLatinateWord()){
            score += .2;
        }
        if(StringAnalyzerTester.testCountTotalOccurance()){
            score += .2;
        }
        return score;
    }
    public static void main(String [] arg){
        testLevel5();
    }
    public static void testLevel5(){        
        boolean one1 = StringPrinterTester.testPrintOutAddressExact1();
        boolean one2 = StringPrinterTester.testPrintOutAddressExact2();
        boolean two = StringBuilderTester.testElongateWord();
        boolean three = StringModifierTester.testConvertPhoneNumber();
        boolean four = StringModifierTester.testPigLatinateWord();
        boolean five = StringAnalyzerTester.testCountTotalOccurance();

        if(one1 && one2 && two && three && four && five){
            System.out.println("Level 5 works");
        }else{
            System.out.println("Level 5 does NOT work");
        }
    }
}
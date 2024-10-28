package COW1;

public class COW1Grader
{
    public static void main(String[] args){
        testAllOfCOW1();
    }
    
    public static double testAllOfCOW1(){
        double score = 0;
        score += CalcLevel1Tester.getLevel1Score();
        score += CalcLevel2Tester.getLevel2Score();
        score += CalcLevel3Tester.getLevel3Score();
        score += CalcLevel4Tester.getLevel4Score();
        score += CalcLevel5Tester.getLevel5Score();
        score += CalcLevel6Tester.getLevel6Score();
        System.out.println("COW 1 Score: " + score);
        return score;
    }
}

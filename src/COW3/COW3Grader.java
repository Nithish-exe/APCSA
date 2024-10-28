package COW3;

public class COW3Grader
{
    public static void main(String[] args){
        testAllOfCOW3();
    }
    
    public static double testAllOfCOW3(){
        double score = 0;
        score += Level1Tester.getLevel1Score();
        score += Level2Tester.getLevel2Score();
        score += Level3Tester.getLevel3Score();
        score += Level4Tester.getLevel4Score();
//        score += Level5Tester.getLevel5Score();
//        score += Level6Tester.getLevel6Score();
        System.out.println("COW 3 Score: " + score);
        return score;
    }
}

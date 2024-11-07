package COW2;

public class COW2Grader
{
    public static void main(String[] args){
        testAllOfCOW2();
    }
    
    public static double testAllOfCOW2(){
        double score = 0;
        score += BranchTesterLevel1.getLevel1Score();
        score += BranchTesterLevel2.getLevel2Score();
        score += BranchTesterLevel3.getLevel3Score();
        score += BranchTesterLevel4.getLevel4Score();
        score += BranchTesterLevel5.getLevel5Score();
        score += BranchTesterLevel6.getLevel6Score();
        System.out.println("COW 2 Score: " + score);
        return score;
    }
}

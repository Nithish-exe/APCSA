package COW2;

public class Grader {

    public boolean isItPassing(double percentGrade) {
        if (percentGrade >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isError(double percentGrade) {
        if (percentGrade < 0 || percentGrade > 100) {
            return true;
        } else {
            return false;
        }
    }

    public String getLetter(double percentGrade) {
        if (percentGrade < 60) {
            return "F";
        } else if (percentGrade < 70) {
            return "D";
        } else if (percentGrade < 80) {
            return "C";
        } else if (percentGrade < 90) {
            return "B";
        } else {
            return "A";
        }
    }

    public String getModifier(double percentGrade) {
        int lastDigit = (int) percentGrade % 10;
        if (percentGrade == 100 || (percentGrade >= 60 && lastDigit >= 7)) {
            return "+";
        } else if (lastDigit <= 2 && percentGrade >= 60 && percentGrade < 100) {
            return "-";
        } else {
            return "";
        }
    }

    public double adjustForHonors(double percentGrade) {
        return 0;
    }

    public double adjustForCurve(double percentGrade) {
        return 0;
    }

    public String giveLetterGrade(double percentGrade, boolean isHonors, boolean isPassFail, boolean isCurved){
        return "x";
    }

}
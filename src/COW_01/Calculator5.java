package COW1;

public class Calculator5
{
    public double calcCompoundInterest(double initialDeposit, double interestRate, double numCompounded, double numYears){
        return initialDeposit * Math.pow((1 + (interestRate/numCompounded)), numCompounded * numYears);
    }
    public double calcContinousCompoundInterest(double initialDeposit, double interestRate, double numYears){
        return initialDeposit * Math.pow(Math.E, interestRate * numYears);
    }
    public double calcFirstRootOfQuadratic(double a, double b, double c){
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2 * a);
    }
    public double calcHeight(double angleOfElevation, double distance){
        return 180/Math.PI * (distance * Math.tan(angleOfElevation));
    }
    public double calcAngleOfElevation(double height, double distance){
        return 180/Math.PI * (Math.atan(height/distance));
    }
}

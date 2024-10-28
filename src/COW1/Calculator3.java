package COW1;

public class Calculator3
{
    public double calcDifference(double x1, double x2){
        return Math.abs(x1 - x2);
    }
    
    public double calcAreaOfCircle(double lengthOfRadius){
        return Math.PI * Math.pow(lengthOfRadius, 2);
    }
    
    public double calcVolOfSphere(double lengthOfRadius){
        return 4.0/3 * Math.PI * Math.pow(lengthOfRadius, 3);
    }
    
    public double calcGravity(double mass1, double mass2, double radius){
        return ((6.67408 * Math.pow(10, -11)) * (mass1 * mass2))/Math.pow(radius,2);
    }
    
    public double calcVolumeOfCone(double height, double radius){
        return height/3 * Math.PI * Math.pow(radius, 2);
    }

}

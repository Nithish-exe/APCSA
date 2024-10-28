package COW1;

public class Calculator4
{
    
    public double calcLengthOfRadius(double areaOfCircle){
        return Math.sqrt(areaOfCircle/Math.PI);
    }
    
    public double calcResistanceInParallel(double res1, double res2){
        return 1.0/(1.0/res1 + 1.0/res2);
    }
    
    public double calcDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
    
    public static double calcIntercept(double x1, double y1, double x2, double y2){
        double m = (y2-y1)/(x2-x1);
        return y1 - (m * x1);
    }
    
    public double calcSurfaceAreaOfCone(double height, double radius){
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }
}

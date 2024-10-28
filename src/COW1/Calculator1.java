package COW1;

public class Calculator1
{
    public static double calcAreaOfSquare(double length){
        return length * length;
    }
    
    public static double calcResistanceInSeries(double r1, double r2){
        return r1 + r2;
    }
    
    public static double calcAreaOfRectangle(double length, double width){
        return length * width;
    }
    
    public static double calcMilesPerHour(double miles, double hour){
        return miles/hour;
    }
    
    public static double getProfit(double income, double expenses){
        return income - expenses;
    }
}

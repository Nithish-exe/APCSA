package COW1;

public class Calculator2
{
    public double calcVolOfRectPrism(double length, double width, double height){
        return length * width * height;
    }
    
    public double calcAreaOfTriangle(double base, double height){
        return 0.5 * (base * height);
    }
    
    public static double calcFahrenheitToCelsius(double fahrenheitTemp){
        return (fahrenheitTemp - 32) * 5.0/9;
    }
    
    public static double calcCelsiusToFahrenheit(double celciusTemp){
        return (celciusTemp * 9.0/5) + 32;
    }
    
    public static double calcSlope(double x1, double y1, double x2, double y2){
        return (y2 - y1)/(x2-x1);
    } 
    
}

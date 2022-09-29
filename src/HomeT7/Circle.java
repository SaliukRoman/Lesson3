package HomeT7;

public class Circle {
    double radius = 6;
    double diameter = 12;
    double pi = 3.14;
    public double getArea(){
        return pi * (diameter/2 * diameter/2);
    }
    public double getCircleLength(){
        return 2 * pi * radius;
    }
}

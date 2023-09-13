package part02;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        radius = 1.0;
        color = "white";
    }
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        return "Radius = " + radius + ",color = " + color;
    }
}

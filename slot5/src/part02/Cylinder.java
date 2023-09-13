package part02;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + ",height = " + height;
    }
}

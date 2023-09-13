package part02;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0,"blue",3.0);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println(cylinder.toString());
    }
}

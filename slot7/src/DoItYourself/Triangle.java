package DoItYourself;

public class Triangle {
    private double a, b, c;

    public Triangle() {

    }

    public Triangle(double a, double b, double c) throws InvalidTriangleException {
        if (a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new InvalidTriangleException("Invalid length of 3 sides entered");
        }
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

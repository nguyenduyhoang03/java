package part02.Exercise1;

class Triangle extends Shape  {
    private double base;
    private double height;
    public Triangle(double base, double height){
        this.height = height;
        this.base = base;
    }
    @Override
    double getArea(){
        return (base * height) / 2;
    }
}

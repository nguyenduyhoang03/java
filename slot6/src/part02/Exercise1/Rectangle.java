package part02.Exercise1;

 class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double getArea(){
        return length * width;
    }
}

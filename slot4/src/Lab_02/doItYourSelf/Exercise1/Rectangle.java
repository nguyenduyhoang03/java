package Lab_02.doItYourSelf.Exercise1;

public class Rectangle {
    private int width;
    private int height;
    public Rectangle(){

    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void display(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getArea(){
        return width * height;
    }
    public int getPerimeter(){
        return (width + height) * 2;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

}

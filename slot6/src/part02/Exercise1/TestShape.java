package part02.Exercise1;

public class TestShape {
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle(7,3);
        Triangle htg = new Triangle(6,4);

        System.out.println(hcn.getArea());
        System.out.println(htg.getArea());
    }
}

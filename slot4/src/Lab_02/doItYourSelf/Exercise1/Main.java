package Lab_02.doItYourSelf.Exercise1;

public class Main {
    public static void main(String[] args) {
        // khoi tao doi tuong rectangle
        Rectangle rectangle = new Rectangle(7,3);
        // hien thi hinh chu nhan tren console
        rectangle.display();
        //thay doi width va height
        rectangle.setHeight(5);
        rectangle.setWidth(20);
        //hien thi dien tich va chu vi cua hcn
        System.out.println("dien tich hcn la: " + rectangle.getArea());
        System.out.println("chu vi hcn la: " + rectangle.getPerimeter());
        rectangle.display();
    }
}

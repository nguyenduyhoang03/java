package Lab_02.Exercise_1;

public class Client {
    public static void main(String[] args) {
        Student A = new Student();
        Student B = new Student(01,"Nguyen Duy Hoang", true);
        B.printInfo();
        B.setName("Nguyễn Duy Hoàng");
        B.printInfo();
    }
}
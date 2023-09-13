package part01.ex2;

public class Main {
    public static void main(String[] args) {
        Car c = new LuxuryCar();
        //can not use c.service
        //but can user downcasing to use
        ((LuxuryCar) c).service();
    }
}

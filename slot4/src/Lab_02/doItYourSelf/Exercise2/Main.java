package Lab_02.doItYourSelf.Exercise2;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.setCTemp(25);
        System.out.println(temperature.getFTemp());
        System.out.println(temperature.getKTemp());
    }
}

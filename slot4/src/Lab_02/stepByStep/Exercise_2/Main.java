package Lab_02.stepByStep.Exercise_2;

public class Main {
    public static void main(String[] args){
        // khoi tao ob battery va flash lamp
        Battery battery = new Battery();
        FlashLamp flashLamp = new FlashLamp();
        //gan pin vao den pin
        flashLamp.setBattery(battery);
        //bat va tat den pin 10 lan
        for (int i = 0; i < 10; i++){
            flashLamp.turnOn();
            System.out.println("Bat den pin");
            flashLamp.turnOff();
            System.out.println("Tat den pin");
        }
        //hien thi so pin con lai
        System.out.println("So pin con lai la: " + flashLamp.getBatteryInfo());
    }
}

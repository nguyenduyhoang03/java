package Lab_02.doItYourSelf.Exercise3;

public class Main {
    public static void main(String[] args) {
        // khoi tao doi tuong
        SwitchButton switchButton = new SwitchButton();
        ElectricLamp electricLamp = new ElectricLamp();
        //ket noi electricL va switchB
        switchButton.connectToLamp(electricLamp);
        //tat 10 lan
        for(int i = 0; i < 10; i++){
            switchButton.switchOff();
        }
    }
}

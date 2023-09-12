package Lab_02.doItYourSelf.Exercise2;

public class Temperature {
    private double cTemp;
    public Temperature(){}
    public Temperature(double cTemp){
        this.cTemp = cTemp;
    }

    public void setCTemp(double cTemp){
        this.cTemp = cTemp;
    }
    public double getCtemp(){
        return cTemp;
    }
    public double getFTemp(){
        return (cTemp * 9/5) + 32;
    }
    public double getKTemp(){
        return cTemp + 273.15;
    }
}

package Lab_02.stepByStep.Exercise_2;

public class Battery {
    private int energy;
    public Battery(){
        energy = 100;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public int getEnergy(){
        return energy;
    }
    public void decreaseEnergy(){
        energy--;
    }
}

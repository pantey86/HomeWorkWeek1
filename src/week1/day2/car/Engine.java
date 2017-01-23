package week1.day2.car;

public class Engine {

    private double engineCapasity;
    private int enginePower;

    public Engine(double engineCapasity, int enginePower) {
        this.engineCapasity = engineCapasity;
        this.enginePower = enginePower;
    }

    public double getEngineCapasity() {
        return engineCapasity;
    }

    public void setEngineCapasity(double engineCapasity) {
        this.engineCapasity = engineCapasity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}

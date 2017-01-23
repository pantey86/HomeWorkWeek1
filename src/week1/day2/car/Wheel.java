package week1.day2.car;

public class Wheel {

    private int radius;
    private String wheelBrend;

    public Wheel(int radius) {
        this.radius = radius;
    }

    public Wheel(int radius, String wheelBrend) {
        this.radius = radius;
        this.wheelBrend = wheelBrend;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String printWheel (){
        return String.format("wheel radius - %d, wheel brend - %10s",radius,wheelBrend);
    }
}

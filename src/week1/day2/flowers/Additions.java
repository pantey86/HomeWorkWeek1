package week1.day2.flowers;

/**
 * Created by User on 24.01.2017.
 */
public class Additions implements Price {

    protected String name;
    protected double price;
    protected double size;
    protected String color;

    public Additions(double price, double size, String color) {
        this.price = price;
        this.size = size;
        this.color = color;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

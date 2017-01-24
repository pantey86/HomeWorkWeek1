package week1.day2.flowers;

/**
 * Created by User on 24.01.2017.
 */
public class Wrapping extends Additions {

    public Wrapping(double price, double size, String color) {
        super(price, size, color);
        name = color + " wrapping";
    }
}

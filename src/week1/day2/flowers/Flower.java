package week1.day2.flowers;

/**
 * Created by User on 24.01.2017.
 */
public class Flower implements Price {

    protected String name;
    protected double price;
    protected int daysOfLifeLeft;
    protected int length;

    public Flower(double price, int daysOfLifeLeft, int length) {
        this.price = price;
        this.daysOfLifeLeft = daysOfLifeLeft;
        this.length = length;
    }

    public void showFlower(Flower flower) {
        System.out.println(String.format("Flower - %15s , Price - %5.1f, Length - %5d, Days of life left - %2d ",
                flower.name, flower.price, flower.length, flower.daysOfLifeLeft));
    }

    @Override
    public double getPrice() {
        return price;
    }
}

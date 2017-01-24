package week1.day2.flowers;

/**
 * Created by User on 24.01.2017.
 */
public class Bouquet {

    Flower[] flowers;
    Additions[] additions;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Bouquet(Flower[] flowers, Additions[] additions) {
        this.flowers = flowers;
        this.additions = additions;
    }

    public void showFlowers(Flower[] flowers) {
        for (int i = 0; i < flowers.length; i++) {
            System.out.println(String.format("Flower - %15s , Price - %5.1f, Length - %5d, Days of life left - %2d ",
                    flowers[i].name, flowers[i].price, flowers[i].length, flowers[i].daysOfLifeLeft));
        }
    }

    public void showAdditions(Additions[] additions) {
        for (int i = 0; i < additions.length; i++) {
            System.out.println(String.format("Addition - %15s , Price - %5.1f, Size - %5.0f ",
                    additions[i].name, additions[i].price, additions[i].size));
        }
    }

    public void showBouquet(Flower[] flowers, Additions[] additions) {
        if (additions == null)
            showFlowers(flowers);
        else {
            showFlowers(flowers);
            System.out.println();
            showAdditions(additions);
        }
    }

    public double getFlowersPrice(Flower[] flowers) {
        double priceLocal = 0;
        for (int i = 0; i < flowers.length; i++) {
            priceLocal += flowers[i].getPrice();
        }
        return priceLocal;
    }

    public double getAdditionsPrice(Additions[] additions) {
        double priceLocal = 0;
        for (int i = 0; i < additions.length; i++) {
            priceLocal += additions[i].getPrice();
        }
        return priceLocal;
    }

    public double getBouquetPrice(Flower[] flowers, Additions[] additions) {
        double totalPrice = 0;
        return totalPrice = additions == null ? getFlowersPrice(flowers) :
                getFlowersPrice(flowers) + getAdditionsPrice(additions);


    }

    //    Провести сортировку цветов в букете на основе уровня свежести.
    public Flower[] sortFlowersByFresh(Flower[] flowers) {
        for (int i = 0; i < flowers.length; i++) {
            for (int j = flowers.length - 1; j > i; j--) {
                if (flowers[j].daysOfLifeLeft < flowers[j - 1].daysOfLifeLeft) {
                    Flower temp = flowers[j];
                    flowers[j] = flowers[j - 1];
                    flowers[j - 1] = temp;
                }
            }
        }
        return flowers;
    }
//Найти цветок в  букете, соответствующий заданному диапазону длин стеблей.

    public void findFlowerOfLength(Flower[] flowers, int lengthFrom, int lengthTo) {

        System.out.println("Found such flowers with length from " + lengthFrom + " to " + lengthTo);
        System.out.println();

        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].length >= lengthFrom && flowers[i].length <= lengthTo) {
                flowers[i].showFlower(flowers[i]);
            }
        }
    }
}

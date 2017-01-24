package week1.day2.flowers;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 4. Цветочница. Определить иерархию цветов. Создать несколько объек-
 * тов-цветов. Собрать букет (используя аксессуары) с  определением его
 * стоимости. Провести сортировку цветов в букете на основе уровня све-
 * жести. Найти цветок в  букете, соответствующий заданному диапазону
 * длин стеблей.
 */
public class MainFlower {

    public static void main(String[] args) {
//Собрать букет (используя аксессуары) с  определением его   стоимости.
        Rose rr1 = new RedRose(45, 6, 70);
        Rose rr2 = new RedRose(45, 7, 70);
        Rose rr3 = new WhiteRose(25, 5, 55);
        Rose rr4 = new WhiteRose(25, 6, 55);
        Rose rr5 = new WhiteRose(25, 3, 55);

        Wrapping wr = new Wrapping(15, 90, "green");

        Ribbion rib1 = new Ribbion(12, 120, "red");
        Ribbion rib2 = new Ribbion(18, 150, "gold");

        Flower[] flowers = {rr1, rr2, rr3, rr4, rr5};
        Additions[] additions = {wr, rib1, rib2};

        Bouquet b1 = new Bouquet(flowers, additions);

        b1.showBouquet(flowers, additions);

        System.out.println("Total price is " + b1.getBouquetPrice(flowers, additions));

       Flower [] sortedFlowersByFresh =  b1.sortFlowersByFresh(flowers);

       b1.showFlowers(sortedFlowersByFresh);
        System.out.println();

       b1.findFlowerOfLength(flowers, 65,90);

    }
}

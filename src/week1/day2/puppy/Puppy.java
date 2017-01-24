package week1.day2.puppy;

/**
 * Создать объект класса Щенок, используя классы Животное, Собака.
 * Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
 */
public class Puppy extends Dog {

    boolean eatMeat;

    public Puppy(String name, int age, int legsNumb, boolean hasTail, boolean eatMeat) {
        super(name, age, legsNumb, hasTail);
        this.eatMeat = eatMeat;
    }

    @Override
    public void jump() {
        System.out.println("The puppy jumps Not very high");
    }

    @Override
    public void move() {
        System.out.println("The puppy runs Not so fast as dog");
    }

    @Override
    public void bite() {
        System.out.println("The puppy bites softy ");
    }
}

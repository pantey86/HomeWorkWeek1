package week1.day2.puppy;

/**
 * Created by User on 23.01.2017.
 */
public class Dog extends Animal {

    private String name;

    public Dog(String name, int age, int legsNumb, boolean hasTail) {
        this.age = age;
        this.name = name;
        this.legsNumb = legsNumb;
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("name - " + name);
    }

    public void voice() {
        System.out.println("gav gav!!!");
    }

    public void jump() {
        System.out.println("The dog jumps high");
    }

    public void move() {
        System.out.println("The dog runs fast ");
    }

    public void bite() {
        System.out.println("The dog bites hard ");
    }
}

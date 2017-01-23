package week1.day2.puppy;

/**
 * Created by User on 23.01.2017.
 */
public class MainPuppy {
    public static void main(String[] args) {

        Puppy jack = new Puppy("Jack", 1, 4, true, false);

        jack.showName();
        jack.move();
        jack.jump();
        jack.bite();

    }

}

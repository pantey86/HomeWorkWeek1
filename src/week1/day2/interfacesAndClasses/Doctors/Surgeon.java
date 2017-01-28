package week1.day2.interfacesAndClasses.Doctors;

/**
 * Created by User on 28.01.2017.
 */
public class Surgeon implements Doctor {

    private String name;
    private int age;
    private int experiance;

    public Surgeon(String name, int age, int experiance) {
        this.name = name;
        this.age = age;
        this.experiance = experiance;
    }

    @Override
    public String giveMedication() {
        String s = "I make surgical operation";
        return s;
    }
}

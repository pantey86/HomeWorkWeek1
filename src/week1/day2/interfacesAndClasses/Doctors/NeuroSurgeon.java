package week1.day2.interfacesAndClasses.Doctors;

/**
 * Created by User on 28.01.2017.
 */
public class NeuroSurgeon extends Surgeon {

    private int operWithGoodResult;
    private int operWithBedResult;

    public NeuroSurgeon(String name, int age, int experiance, int operWithGoodResult, int operWithBedResult) {
        super(name, age, experiance);
        this.operWithGoodResult = operWithGoodResult;
        this.operWithBedResult = operWithBedResult;
    }

    @Override
    public String giveMedication() {
        String s = "I can surgical operation, and I can fix your brain";
        return s;
    }
}

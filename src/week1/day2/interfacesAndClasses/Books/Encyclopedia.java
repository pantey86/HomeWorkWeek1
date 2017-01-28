package week1.day2.interfacesAndClasses.Books;

/**
 * Created by User on 28.01.2017.
 */
public class Encyclopedia extends Book {

    private String branch;
    private String copyRight = "Some text about rights";

    public Encyclopedia(String name, int pagesNumb, int numberOfCopies, String branch, String copyRight) {
        super(name, pagesNumb, numberOfCopies);
        this.branch = branch;
        this.copyRight = copyRight;
    }

    @Override
    public String copyRight() {
        return copyRight;
    }
}

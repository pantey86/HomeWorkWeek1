package week1.day2.interfacesAndClasses.Books;

/**
 * Created by User on 28.01.2017.
 */
public class HandBook extends Book {

    private String copyRight = "Some text about owner and his rights";

    public HandBook(String name, int pagesNumb, int numberOfCopies, String copyRight) {
        super(name, pagesNumb, numberOfCopies);
        this.copyRight = copyRight;
    }

    @Override
    public String copyRight() {
        return copyRight;
    }
}

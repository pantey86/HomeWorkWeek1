package week1.day2.interfacesAndClasses.Books;

import week1.day2.interfacesAndClasses.Books.Publishing;

/**
 * Created by User on 28.01.2017.
 */
public abstract class Book implements Publishing {

    private String name;
    private int pagesNumb;
    private int numberOfCopies;

    public Book(String name, int pagesNumb, int numberOfCopies) {
        this.name = name;
        this.pagesNumb = pagesNumb;
        this.numberOfCopies = numberOfCopies;
    }
}

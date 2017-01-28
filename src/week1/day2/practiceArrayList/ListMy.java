package week1.day2.practiceArrayList;

/**
 * Created by User on 28.01.2017.
 */
public interface ListMy {

    boolean add(Object o);

    boolean add(int index, Object o);

    Object get(int index);

    void remove(int index);

    void remove(Object obj);

    void set(int index, Object obj);

    void clear();

    boolean contains(Object obj);

    int size();
}

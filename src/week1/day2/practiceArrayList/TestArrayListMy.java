package week1.day2.practiceArrayList;

import week1.day2.puppy.*;

/**
 * Created by User on 28.01.2017.
 */
public class TestArrayListMy {
    public static void main(String[] args) {

        ArrayListMy list = new ArrayListMy();

        Puppy p1 = new Puppy("Jack1");
        Puppy p2 = new Puppy("Jack2");
        Puppy p3 = new Puppy("Jack3");
        Puppy p4 = new Puppy("Jack4");
        Puppy p5 = new Puppy("Jack5");
        Puppy p6 = new Puppy("Jack6");
        Puppy p7 = new Puppy("Jack7");
        Puppy p8 = new Puppy("Jack8");

        list.add(p1);
        list.add(p4);
        list.add(p6);
        list.add(p3);
        list.add(p8);

        System.out.println("size - " + list.size());
        System.out.println("capacity - " + list.getCapacity());

        list.add(p1);
        list.add(p4);
        list.add(p6);
        list.add(p3);
        list.add(p1);
        list.add(p7);
        list.add(2, p8);
        list.add(2, p7);
        list.add(2, p6);
        list.add(2, p5);
        list.add(2, p4);
        list.add(2, p3);

        System.out.println("size - " + list.size());
        System.out.println("capacity - " + list.getCapacity());

        list.remove(14);

        System.out.println("size - " + list.size());
        System.out.println("capacity - " + list.getCapacity());

        list.remove(p3);

        System.out.println("size - " + list.size());
        System.out.println("capacity - " + list.getCapacity());

        list.set(1, p8);

        System.out.println(list.contains(p4));
        System.out.println(list.contains(p2));

    }
}

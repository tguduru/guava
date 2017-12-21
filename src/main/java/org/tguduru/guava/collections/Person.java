package org.tguduru.guava.collections;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 11/3/16.
 */
public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

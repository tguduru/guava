package org.tguduru.guava.collections;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 11/3/16.
 */
public class PersonResponse {
    private int id;
    private String name;

    public PersonResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonResponse{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

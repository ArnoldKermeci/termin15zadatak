package rs.aleph.android.example15.model;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private int id;
    private String name;
    private List<Jelo> jelos;

    public Category() {

        jelos = new ArrayList<>();
    }

    public Category(int id, String name) {

        this.id = id;
        this.name = name;

        jelos = new ArrayList<>();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void addJelo(Jelo jelo) {

        jelos.add(jelo);
    }

    public void removeJelo(Jelo jelo) {

        jelos.remove(jelo);
    }

    public Jelo getJelo(int position) {

        return jelos.get(position);
    }

    public List<Jelo> getJelos() {

        return jelos;
    }

    public void setJelos(List<Jelo> jelos) {

        this.jelos = jelos;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jelos=" + jelos +
                '}';
    }
}

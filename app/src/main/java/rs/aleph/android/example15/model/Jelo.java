package rs.aleph.android.example15.model;

public class Jelo {

    private int id;
    private String image;
    private String name;
    private String description;
    private Category category;
    private Sastojci sastojci;
    private int kalorija;


    public Jelo() {

    }

    public Jelo(int id, String image, String name, String description, Category category, Sastojci sastojci, int kalorija) {

        this.id = id;
        this.image = image;
        this.name = name;
        this.description = description;
        this.category = category;
        this.sastojci = sastojci;
        this.kalorija = kalorija;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Sastojci getSastojci() {return sastojci; }

    public void setSastojci(Sastojci sastojci) {this.sastojci = sastojci; }

    public int getKalorija() {return kalorija;}

    public void setKalorija(int kalorija) {this.kalorija = kalorija;}

    @Override
    public String toString() {
        return name;
    }
}

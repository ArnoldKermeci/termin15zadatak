package rs.aleph.android.example15.model;

public class Sastojci {
    private int id;
    private String nazivSastojka;
    Jelo jelo;
    public Sastojci(){

    }

    public Sastojci(int id, String nazivSastojka, Jelo jelo) {
        this.id = id;
        this.nazivSastojka = nazivSastojka;
        this.jelo = jelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }

    @Override
    public String toString() {
        return "Sastojci{" +
                "id=" + id +
                ", nazivSastojka='" + nazivSastojka + '\'' +
                ", jelo=" + jelo +
                '}';
    }
}

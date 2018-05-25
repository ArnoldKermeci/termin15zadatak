package rs.aleph.android.example15.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example15.model.Category;
import rs.aleph.android.example15.model.Jelo;

public class JeloProvider {

    public static List<Jelo> getFruits() {

        Category glavnojelo = new Category(0, "Glavno jelo");
        Category dezert = new Category(1, "Dezert");

        List<Jelo> jelos = new ArrayList<>();
        jelos.add(new Jelo(0, "cevapi.jpg", "cevapi", "Peceno mleveno meso", null, null, 290));
        jelos.add(new Jelo(1, "palacinke.jpg", "palacinke", "Prazne palacinke.", null, null, 440));
        jelos.add(new Jelo(2, "paprikas.jpg", "paprikas", "Juneci paprikas", null, null, 300));
        jelos.add(new Jelo(3, "Sarma.jpg", "sarma", "Meso u kupusu.",null,null, 350));
        jelos.add(new Jelo(4, "sladoled.jpg", "sladoled", "Sladoled vise ukusa", null, null, 540));
        return jelos;
    }

    public static List<String> getFruitNames() {

        List<String> names = new ArrayList<>();
        names.add("cevapi");
        names.add("palacinke");
        names.add("paprikas");
        names.add("Sarma");
        names.add("sladoled");
        return names;
    }

    public static Jelo getJeloById(int id) {

        Category rose = new Category(0, "Glavno jelo");
        Category citrus = new Category(1, "Dezert");

        switch (id) {
            case 0:
                return new Jelo(0, "cevapi.jpg", "cevapi", "Peceno mleveno meso", null, null, 290);
            case 1:
                return new Jelo(1, "palacinke.jpg", "palacinke", "Prazne palacinke.", null, null, 440);
            case 2:
                return new Jelo(2, "paprikas.jpg", "paprikas", "Juneci paprikas", null, null, 300);
            case 3:
                return new Jelo(3, "Sarma.jpg", "sarma", "Meso u kupusu.",null,null, 350);
            case 4:
                return new Jelo(4, "sladoled.jpg", "sladoled", "Sladoled vise ukusa", null, null, 540);

            default:
                return null;
        }
    }

}

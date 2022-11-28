package shopping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sepet {

    static HashMap<String, Sepet> sepet = new HashMap<>();
    static HashMap<Integer, Double> eskiAlisVerisListe = new HashMap<>();
   static Set<Map.Entry<Integer, Double>> eskiListeSet = eskiAlisVerisListe.entrySet();

    static Set<Map.Entry<String, Sepet>> sepetSet = sepet.entrySet();

    private String id;
    private String alinanMiktar;
    private double toplamTurar;

    public Sepet(String alinanMiktar, double toplamTurar) {
        this.alinanMiktar = alinanMiktar;
        this.toplamTurar = toplamTurar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlinanMiktar() {
        return alinanMiktar;
    }

    public void setAlinanMiktar(String alinanMiktar) {
        this.alinanMiktar = alinanMiktar;
    }

    public double getToplamTurar() {
        return toplamTurar;
    }

    public void setToplamTurar(double toplamTurar) {
        this.toplamTurar = toplamTurar;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                "\nAlinan miktar = " + alinanMiktar +
                "\n Toplam Tutar = " + toplamTurar;

    }
}

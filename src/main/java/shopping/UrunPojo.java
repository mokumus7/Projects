package shopping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UrunPojo {

  static   HashMap<String, UrunPojo> urunListesi= new HashMap<>();
  static Set<String> urunListeKeySet = urunListesi.keySet();
  static   Set<Map.Entry<String, UrunPojo>> urunListesiSet= urunListesi.entrySet();

    private  String urunID;
    private  String urunIsmi;
    private  int miktar;
    private  double fiyat;
    private  String bolum;

    public UrunPojo(String urunIsmi, int miktar, double fiyat, String bolum) {
        this.urunIsmi = urunIsmi;
        this.miktar = miktar;
        this.fiyat = fiyat;
        this.bolum = bolum;
    }

    @Override
    public String toString() {

        return urunID + urunIsmi + miktar + fiyat + bolum;
    }

    public String getUrunID() {
        return urunID;
    }

    public void setUrunID(String urunID) {
        this.urunID = urunID;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
}

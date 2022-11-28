package calisma;

public class Calisma1 {


    private String kimlikNumrasi;
    private String adres;
    private  String telNo;
    public String isim;



    public Calisma1(String kimlikNumrasi, String adres, String telNo, String isim) {
        this.kimlikNumrasi = kimlikNumrasi;
        this.adres = adres;
        this.telNo = telNo;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return kimlikNumrasi+ adres + telNo + isim ;
    }

    public String getKimlikNumrasi() {
        return kimlikNumrasi;
    }

    public void setKimlikNumrasi(String kimlikNumrasi) {
        this.kimlikNumrasi = kimlikNumrasi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

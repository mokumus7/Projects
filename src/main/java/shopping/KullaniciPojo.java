package shopping;


public class KullaniciPojo {


    private  String email;
    private  String sifre;
    public  String tamIsim;
    private   String telefonNumarasi;

    public KullaniciPojo(String email, String sifre, String tamIsim, String telefonNumarasi) {
        this.email = email;
        this.sifre = sifre;
        this.tamIsim = tamIsim;
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getTamIsim() {
        return tamIsim;
    }

    public void setTamIsim(String tamIsim) {
        this.tamIsim = tamIsim;
    }

    @Override
    public String toString() {
        return email +sifre + tamIsim + telefonNumarasi ;

    }
}

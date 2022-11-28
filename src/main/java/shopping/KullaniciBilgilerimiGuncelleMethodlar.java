package shopping;

import java.util.Scanner;

public class KullaniciBilgilerimiGuncelleMethodlar {
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);

    public static void mailAdresimiGuncelle(String mailAdersi) throws UrunBulunamadiException {

        System.out.println(yesil + "Yeni mail adresi giriniz : ");
        String yeniMailAdresi = input.next();
        KullaniciAnaMenu.kullaniciListesi.get(mailAdersi).setEmail(yeniMailAdresi);
        KullaniciAnaMenu.kullaniciListesi.put(yeniMailAdresi, KullaniciAnaMenu.kullaniciListesi.get(mailAdersi));
        KullaniciAnaMenu.kullaniciListesi.remove(mailAdersi);

        System.out.println(sari+"Kullanici bilgilerimi guncelleme sayfasina gitmek icin 1'e \n" +
                "Kullanici sayfasina gitmek icin baska bir tusa basiniz");
        String scm = input.next();

        if(scm.equals("1")){
            KullaniciAltMenuMethodlari.bilgilerimiGuncelle();
        }else {
            KullaniciAltMenu.kullaniciAltMenu();
        }

    }

    public static void sifremiGuncelle(String mailAdersi) throws UrunBulunamadiException {
        System.out.println(yesil + "Yeni sifre giriniz : ");
        String yeniSifre = input.next();
        KullaniciAnaMenu.kullaniciListesi.get(mailAdersi).setSifre(yeniSifre);
        System.out.println(sari+"Kullanici bilgilerimi guncelleme sayfasina gitmek icin 1'e \n" +
                "Kullanici sayfasina gitmek icin baska bir tusa basiniz");
        String scm = input.next();

        if(scm.equals("1")){
            KullaniciAltMenuMethodlari.bilgilerimiGuncelle();
        }else {
            KullaniciAltMenu.kullaniciAltMenu();
        }

    }

    public static void adSoyadiGuncelle(String mailAdersi) throws UrunBulunamadiException {
        System.out.println(yesil + "Yeni Ad ve soyad  giriniz : ");
        String yeniAdSoyad = input.next();
        KullaniciAnaMenu.kullaniciListesi.get(mailAdersi).setTamIsim(yeniAdSoyad);
        System.out.println(sari+"Kullanici bilgilerimi guncelleme sayfasina gitmek icin 1'e \n" +
                "Kullanici sayfasina gitmek icin baska bir tusa basiniz");
        String scm = input.next();

        if(scm.equals("1")){
            KullaniciAltMenuMethodlari.bilgilerimiGuncelle();
        }else {
            KullaniciAltMenu.kullaniciAltMenu();
        }

    }

    public static void telefonNumarasiGuncelle(String mailAdersi) throws UrunBulunamadiException {
        System.out.println(yesil + "Yeni telefon numrasini giriniz : ");
        String yeniTelefonNumarasi = input.next();
        KullaniciAnaMenu.kullaniciListesi.get(mailAdersi).setTelefonNumarasi(yeniTelefonNumarasi);
        System.out.println(sari+"Kullanici bilgilerimi guncelleme sayfasina gitmek icin 1'e \n" +
                "Kullanici sayfasina gitmek icin baska bir tusa basiniz");
        String scm = input.next();

        if(scm.equals("1")){
            KullaniciAltMenuMethodlari.bilgilerimiGuncelle();
        }else {
            KullaniciAltMenu.kullaniciAltMenu();
        }

    }

}

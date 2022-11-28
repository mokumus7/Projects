package shopping;

import java.util.HashMap;
import java.util.Scanner;

public class Kullanici {
    /*
    KULLANİCİ

    1. Giris
    1.1.1. Market
       1.1.1. Alisveris yapma
         1.1.1.1. Urunler ve fiyatlar spete ekle
    1.1.2. Manav
       1.1.1. Alisveris yapma
         1.1.1.1. Urunler ve fiyatlar spete ekle
    1.1.3. Sarküteri
       1.1.1. Alisveris yapma
         1.1.1.1. Urunler ve fiyatlar spete ekle
    1.2. Spetten urun cikartma
    1.3. Odeme sayfasi(Urunleri stokdan duselim)
       kasa tanimlanmis olamli.
    1.4. Iade
     1.3.1. Urun iade(ilk 24 saat)
    1.5. Gecmis alis-veris listesi
     1.4.1.. Eski Liste


    2. Sifremi unuttum
    3. Bilgilerimi Guncelle
    4. Kayit ol
    5. Anasayfa
    6. Cikis
     */
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);

    static HashMap<String, KullaniciPojo> kullaniciListesi = new HashMap<>();


    public static void kullaniciMethod() {
        System.out.println(kirmizi + "---------------#  KULLANİCİ SAYFASI  #---------------");

        System.out.println(sari + "1. Kullanici Giris\n" +
                "2. Sifremi Unuttum\n" +
                "3. Bilgilerimi Guncelle\n" +
                "4. Kayit ol\n" +
                "5. Anasayfa\n" +
                "6. Cikis");

        System.out.println(mor + "Yapmak istediginiz secimi giriniz :");
        String secim = input.next();

        boolean durum = true;
        while (durum) {

            switch (secim) {
                case "1":
                    kullaniciGiris();
                    durum = false;
                    break;
                case "2":
                    sifremiUnuttum();
                    durum = false;
                    break;
                case "3":
                    bilgilerimiGuncelle();
                    durum = false;
                    break;
                case "4":
                    kayitOl();
                    durum = false;
                    break;
                case "5":
                    Menuler.anasayfaMethodu();
                    durum = false;
                    break;
                case "6":
                    System.out.println(mavi + "Sayfamizi ziyaret ettiginzi icin tesekkur ederiz\n" +
                            "Iyi gunler dileriz");
                    durum = false;
                    break;
                default:
                    System.out.println(kirmizi + "Yanlis secim yaptiniz. Lutfen tekrar secim yapiniz");
                    secim = input.next();

            }
        }

    }

    public static void kullaniciGiris() {
        System.out.println(kirmizi + "----------------# KULLANİCİ GİRİS SAYFASİ#-----------------------");
        System.out.println(mavi + "Mail adresinizi giriniz : ");
        mailKontrol(kullaniciListesi);


    }

    public static void sifremiUnuttum() {

    }

    public static void bilgilerimiGuncelle() {


    }

    public static void kayitOl() {
        System.out.println(kirmizi + "----------------# KULLANİCİ KAYİT SAYFASİ#-----------------------");
        KayitKontrol.emailKontrol();

    }


    public static void mailKontrol(HashMap<String, KullaniciPojo> kullaniciListesi) {
        String mail = input.next();

        if (kullaniciListesi.containsKey(mail)) {
            System.out.println(mavi + "Sifreyi giriniz : ");

            boolean drm = true;
            while (drm) {
                String sifre = input.next();
                if (kullaniciListesi.get(mail).getSifre().equals(sifre)) {
                    Menuler.kullaniciMenu();
                    drm = false;
                } else {
                    System.out.println(kirmizi + "Yanlis sifre girdiniz\n" + " Tekrar sifre giriniz");

                }
            }

        } else {
            System.out.println(kirmizi + "Bu mail adresi kayitli degildir.\n" + "Tekrar mail adresini giriniz");
            mailKontrol(kullaniciListesi);
        }


    }

    public static void temelGida(){

    }

    public static void manav(){

    }

    public static void sarkuteri(){

    }
    public static void sepettenUrunCikart(){

    }
    public static void odemeSayfasi(){

    }
    public static void iade(){

    }
    public static void gecmisAlisVerislerim(){

    }
}




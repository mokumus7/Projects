package shopping;

import java.util.HashMap;
import java.util.Scanner;

public class Menuler {
    /*
    ALisveris Ana sayfa
1. Admin
2. Kullanici
3. Cikis
     */
    static final String gizliSoru = "ahmet";
    static final String gizliSoruKullanici = "pamuk";
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);

    public static void anasayfaMethodu() {
        System.out.println(kirmizi + "---------------#  ANASAYFA  #---------------");

        System.out.println(sari + "1. Admin\n" +
                "2. Kullanici\n" +
                "3. Cikis\n");

        System.out.println(mor + "Yapmak istediginiz secimi giriniz :");
        String secim = input.next();

        boolean durum = true;
        while (durum) {

            switch (secim) {
                case "1":
                    AdminAnaMenu.adminMethod();
                    durum = false;
                    break;
                case "2":
                    kullaniciMethod();
                    durum = false;
                    break;
                case "3":
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



    public static void kullaniciMethod() {
        System.out.println(kirmizi + "---------------#  KULLANICI SAYFASI  #---------------");

        System.out.println(sari + "1. Kullanici Giris\n" +
                "2. Sifremi Unuttum\n" +
                "3. Bilgilerimi Guncelle\n" +
                "4. Kayit Ol\n" +
                "5. Anasayfa\n" +
                "6. Cikis");

        System.out.println(mor + "Yapmak istediginiz secimi giriniz :");
        String secim = input.next();

        boolean durum = true;
        while (durum) {

            switch (secim) {
                case "1":
                    Kullanici.kullaniciGiris();
                    durum = false;
                    break;
                case "2":

                    durum = false;
                    break;
                case "3":

                    durum = false;
                    break;
                case "4":
                    Kullanici.kayitOl();
                    durum = false;
                    break;
                case "5":
                    anasayfaMethodu();
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



    public static void kullaniciMenu() {
        System.out.println(kirmizi + "---------------#  KULLANİCİ MENU #---------------");

        System.out.println(sari + "1. Temel Gida\n" +
                "2. Manav\n" +
                "3. Sarkuteri\n" +
                "4. Sepetten Urun Cikart\n" +
                "5. Odeme Sayfasi\n" +
                "6. Iade\n" +
                "7. Gecmis Alisverislerim\n" +
                "8. Kullanici Menu\n" +
                "9. Anasayfa\n" +
                "10. Cikis\n");

        System.out.println(mor + "Yapmak istediginiz secimi giriniz :");
        String secim = input.next();

        boolean durum = true;
        while (durum) {
            switch (secim) {
                case "1":
                    Kullanici.temelGida();
                    durum = false;
                    break;
                case "2":
                    Kullanici.manav();
                    durum = false;
                    break;
                case "3":
                    Kullanici.sarkuteri();
                    durum = false;
                    break;
                case "4":
                    Kullanici.sepettenUrunCikart();
                    durum = false;
                    break;
                case "5":
                    Kullanici.odemeSayfasi();
                    durum = false;
                    break;
                case "6":
                    Kullanici.iade();
                    durum = false;
                    break;
                case "7":
                    Kullanici.gecmisAlisVerislerim();
                    durum = false;
                    break;
                case "8":
                    Kullanici.kullaniciMethod();
                    durum = false;
                    break;
                case "9":
                    anasayfaMethodu();
                    durum = false;
                    break;
                case "10":
                    System.out.println(mavi + "Sayfamizi ziyaret ettiginzi icin tesekkur ederiz\n" +
                            "Iyi gunler dileriz");
                    durum = false;
                    break;
                default:
                    System.out.println(kirmizi + "Yanlis secim yaptiniz. Tekrar secim yapiniz.");
                    secim = input.next();
            }

        }
    }

    public static void girisKontrol(HashMap<String, String> adminler) {
        System.out.println(sari + "Mail adresini giriniz");
        String mail = input.next();
        boolean durum = true;
        while (durum)
            if (adminler.containsKey(mail)) {
                System.out.println(sari + "Sifreinizi giriniz");
                String sifre = input.next();
                if (adminler.get(mail).equals(sifre)) {
                    AdminAltMenu.adminAltMenu();
                    break;
                } else {
                    System.out.println(kirmizi + "Sifreyi yanlis girdiniz. ");
                }

            } else {
                System.out.println(kirmizi + "Yanlis mail adresi girdiniz tekrar deneyiniz");
                mail = input.next();
            }


    }


    public static void adminSifreUnuttum(HashMap<String, String> adminler) {
        System.out.println(kirmizi + "------------------# SİFREMİ UNUTTUM #------------------------------");
        System.out.println(yesil + "Mail adresinizi giriniz: ");
        String mailAdresi = input.next();

        boolean durum = true;
        while (durum) {
            if (adminler.containsKey(mailAdresi)) {


                System.out.println(sari + "Ilk okul ogretmeninizin ismini giriniz");
                String ilkOkulOgretmeni = input.next().toLowerCase();
                boolean drm = true;
                while (drm) {
                    if (gizliSoru.equals(ilkOkulOgretmeni)) {
                        System.out.println("Sifreniz = " + AdminAltMenu.adminListesi.get(mailAdresi));
                        drm = false;
                        durum = false;
                        System.out.println(sari + "Giris bolumune gitmek icin herhangi bir tusa basiniz\n");
                        input.next();
                        girisKontrol(AdminAltMenu.adminListesi);
                    } else {
                        System.out.println("Ilk okul ogretmeninizin ismini yanlis girdiniz\n" +
                                "Lutfen tekrar giriniz");
                        ilkOkulOgretmeni = input.next().toLowerCase();
                    }
                }


            } else {
                System.out.println(mor + "Yanlis mail adresi girdiniz\n" +
                        "Lutfen tekrar giris yapiniz");
                mailAdresi = input.next();
            }

        }


    }


}

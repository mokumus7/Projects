package shopping;

import java.util.Scanner;

public class KullaniciAltMenu {
    /*
    KULLANİCİ ALT MENU

     1. Temel Gida
     2. Manav
     3. Sarkuteri
     4. Sepetten Urun Cikart
     5. Odeme Sayfasi
     6. Iade
     7. Gecmis Alisverislerim
     8. Kullanici Menu
     9. AnasayfA
     10. Cikis

     */
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);

    public static void kullaniciAltMenu() throws UrunBulunamadiException {
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
                "10. Bilgilerimi Guncelle\n"+
                "11. Cikis");

        System.out.println(mor + "Yapmak istediginiz secimi giriniz :");
        String secim = input.next();

            switch (secim) {
                case "1":
                    KullaniciAltMenuMethodlari.temelGida();
                    break;
                case "2":
                    KullaniciAltMenuMethodlari.manav();
                    break;
                case "3":
                    KullaniciAltMenuMethodlari.sarkuteri();
                    break;
                case "4":
                    KullaniciAltMenuMethodlari.sepettenUrunCikart();
                    break;
                case "5":
                    KullaniciAltMenuMethodlari.odemeSayfasi();
                    break;
                case "6":
                    KullaniciAltMenuMethodlari.iade();
                    break;
                case "7":
                    KullaniciAltMenuMethodlari.gecmisAlisVerislerim();
                    break;
                case "8":
                    KullaniciAnaMenu.kullaniciAnaMenu();
                    break;
                case "9":
                    Anasayfa.anasayfaMethodu();
                    break;
                case "10":
                   KullaniciAltMenuMethodlari.bilgilerimiGuncelle();
                    break;
                case "11":
                    System.out.println(mavi + "Sayfamizi ziyaret ettiginzi icin tesekkur ederiz\n" +
                            "Iyi gunler dileriz");
                    break;
                default:
                    System.out.println(kirmizi + "Yanlis secim yaptiniz. Tekrar secim yapiniz.");
                    kullaniciAltMenu();
            }

        }


}

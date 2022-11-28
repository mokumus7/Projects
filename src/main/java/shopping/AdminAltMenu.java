package shopping;

import java.util.HashMap;
import java.util.Scanner;

public class AdminAltMenu {

    /*
    ADMİN
(1.Giris)
 1.1. Urun Tanımlama
 1.2. Urun Girisi
 1.3. Urun Listeleme
 1.4. Urun Arama
 1.5. Urun Silme(ONAY İSTENEBİLİR.)
 1.6. Urun Guncelleme
 1.7. Kayitli musterilerin listeleme
 1.8. Ciro
 1.9. Indirim Belirler

     */
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);

    static HashMap<String, String> adminListesi = new HashMap<>();

    public static void adminAltMethod() throws UrunBulunamadiException {
        System.out.println(kirmizi + "---------------#  ADMİN MENU #---------------");

        System.out.println(sari + "1. Urun Tanimlama\n" +
                "2. Urun Giris\n" +
                "3. Urun Listeleme\n" +
                "4. Urun Arama\n" +
                "5. Urun Silme\n" +
                "6. Urun Guncelle\n" +
                "7. Kayitli Musteriler Listesi\n" +
                "8. Ciro\n" +
                "9. Admin Sayfasi\n" +
                "10. Cikis");

        System.out.println(mor + "Yapmak istediginiz secimi giriniz :");
        String secim = input.next();
        switch (secim) {
            case "1":
                AdminAltMenuMethodlari.urunTanimlama();
                break;
            case "2":
                AdminAltMenuMethodlari.urunGiris();
                break;
            case "3":
                AdminAltMenuMethodlari.urunListeleme();
                break;
            case "4":
                AdminAltMenuMethodlari.urunArama();
                break;
            case "5":
                AdminAltMenuMethodlari.urunSilme();
                break;
            case "6":
                AdminAltMenuMethodlari.urunGuncelle();
                break;
            case "7":
                AdminAltMenuMethodlari.kayitliMusterilerListeleme();
                break;
            case "8":
                AdminAltMenuMethodlari.ciro();
                break;
            case "9":
                AdminAnaMenu.adminAnaMethod();
                break;
            case "10":
                System.out.println(mavi + "Sayfamizi ziyaret ettiginzi icin tesekkur ederiz\n" +
                        "Iyi gunler dileriz");
                break;
            default:
                System.out.println(kirmizi + "Yanlis secim yaptiniz. Tekrar secim yapiniz.");
                adminAltMethod();
        }


    }


}
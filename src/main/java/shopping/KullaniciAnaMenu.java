package shopping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class KullaniciAnaMenu {
    /*
    KULLANİCİ ANA MENU
    1. Giris
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
  static   Set<Map.Entry<String, KullaniciPojo>> kullaniciListesiSet= kullaniciListesi.entrySet();

    public static void kullaniciAnaMenu() throws UrunBulunamadiException {
        System.out.println(kirmizi + "---------------#  KULLANİCİ SAYFASI  #---------------");
        System.out.println(sari + "1. Kullanici Giris\n" +
                "2. Sifremi Unuttum\n" +
                "3. Kayit ol\n" +
                "4. Anasayfa\n" +
                "5. Cikis\n");
        System.out.println(mor + "Yapmak istediginiz secimi giriniz :");
        String secim = input.next();

        switch (secim) {
            case "1":
                KullaniciAnaMenuMethodlar.kullaniciGiris();
                break;
            case "2":
                KullaniciAnaMenuMethodlar.sifremiUnuttum();
                break;
            case "3":
                KullaniciAnaMenuMethodlar.kayitOl();
                break;
            case "4":
                Anasayfa.anasayfaMethodu();
                break;
            case "5":
                System.out.println(mavi + "Sayfamizi ziyaret ettiginzi icin tesekkur ederiz\n" +
                        "Iyi gunler dileriz");
                break;
            default:
                System.out.println(kirmizi + "Yanlis secim yaptiniz. Lutfen tekrar secim yapiniz");
                kullaniciAnaMenu();

        }
    }


}




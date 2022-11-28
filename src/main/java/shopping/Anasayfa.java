package shopping;

import java.util.Scanner;

public class Anasayfa {
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

    public static void anasayfaMethodu() throws UrunBulunamadiException {
        System.out.println(kirmizi + "---------------#  ANASAYFA  #---------------");

        System.out.println(sari + "1. Admin\n" +
                "2. Kullanici\n" +
                "3. Cikis\n");
        System.out.println(mor + "Yapmak istediginiz secimi giriniz :");
        String secim = input.next();

        switch (secim) {
            case "1":
                AdminAnaMenu.adminAnaMethod();
                break;
            case "2":
                KullaniciAnaMenu.kullaniciAnaMenu();
                break;
            case "3":
                System.out.println(mavi + "Sayfamizi ziyaret ettiginzi icin tesekkur ederiz\n" +
                        "Iyi gunler dileriz");
                break;
            default:
                System.out.println(kirmizi + "Yanlis secim yaptiniz. Lutfen tekrar secim yapiniz");
                anasayfaMethodu();


        }

    }


}

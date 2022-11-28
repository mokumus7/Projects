package shopping;

import java.util.HashMap;
import java.util.Scanner;

public class AdminAnaMenu {
    /*
    ADMİN ANA MENU
     1. Admin Giris
     2. Sifremi Unuttum
     3. Anasayfa
     4. Cikis
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
    public static void adminAnaMethod() throws UrunBulunamadiException {
        System.out.println(kirmizi + "---------------#  ADMİN SAYFASI  #---------------");

        System.out.println(sari + "1. Admin Giris\n" +
                "2. Sifremi Unuttum\n" +
                "3. Anasayfa\n" +
                "4. Cikis");
        System.out.println(mor + "Yapmak istediginiz secimi giriniz :");
        String secim = input.next();
            switch (secim) {
                case "1":
                    AdminAnaMenuMethodlari.adminGirisKontrol(AdminAltMenu.adminListesi);
                    break;
                case "2":
                    AdminAnaMenuMethodlari.adminSifreUnuttum(AdminAltMenu.adminListesi);
                    break;
                case "3":
                    Anasayfa.anasayfaMethodu();
                    break;
                case "4":
                    System.out.println(mavi + "Sayfamizi ziyaret ettiginzi icin tesekkur ederiz\n" +
                            "Iyi gunler dileriz");
                    break;
                default:
                    System.out.println(kirmizi + "Yanlis secim yaptiniz. Lutfen tekrar secim yapiniz");
                    adminAnaMethod();
            }
        }


}

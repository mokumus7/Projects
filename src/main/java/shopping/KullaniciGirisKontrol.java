package shopping;

import java.util.HashMap;
import java.util.Scanner;

public class KullaniciGirisKontrol {
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);


    public static void kullaniciGirisKontrol(HashMap<String, KullaniciPojo> kullaniciListesi) throws UrunBulunamadiException {
        String mail = input.next();

        if (kullaniciListesi.containsKey(mail)) {
            System.out.println(mavi + "Sifreyi giriniz : ");

            boolean drm = true;
            while (drm) {
                String sifre = input.next();
                if (kullaniciListesi.get(mail).getSifre().equals(sifre)) {
                    KullaniciAltMenu.kullaniciAltMenu();
                    drm = false;
                } else {
                    System.out.println(kirmizi + "Yanlis sifre girdiniz\n" + " Tekrar sifre giriniz");
                }
            }

        } else {
            System.out.println(kirmizi + "Bu mail adresi kayitli degildir.\n" + "Tekrar mail adresini giriniz");
            kullaniciGirisKontrol(kullaniciListesi);
        }


    }
}

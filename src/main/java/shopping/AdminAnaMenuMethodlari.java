package shopping;

import java.util.HashMap;
import java.util.Scanner;

public class AdminAnaMenuMethodlari {
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);
    public static void adminSifreUnuttum(HashMap<String, String> adminler) throws UrunBulunamadiException {
        System.out.println(kirmizi + "------------------# ADMİN SİFREMİ UNUTTUM #------------------------------");
        System.out.println(yesil + "Mail adresinizi giriniz: ");
        String mailAdresi = input.next();

        boolean durum = true;
        while (durum) {
            if (adminler.containsKey(mailAdresi)) {


                System.out.println(sari + "Ilk okul ogretmeninizin ismini giriniz");
                String ilkOkulOgretmeni = input.next().toLowerCase();
                boolean drm = true;
                while (drm) {
                    if (AdminAnaMenu.gizliSoru.equals(ilkOkulOgretmeni)) {
                        System.out.println("Sifreniz = " + AdminAltMenu.adminListesi.get(mailAdresi));
                        drm = false;
                        durum = false;
                        System.out.println(sari + "Giris bolumune gitmek icin herhangi bir tusa basiniz\n");
                        input.next();
                        adminGirisKontrol(AdminAltMenu.adminListesi);
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
    public static void adminGirisKontrol(HashMap<String, String> adminler) throws UrunBulunamadiException {
        System.out.println(sari + "Mail adresini giriniz");
        String mail = input.next();
        boolean durum = true;
        while (durum)
            if (adminler.containsKey(mail)) {
                System.out.println(sari + "Sifreinizi giriniz");
                String sifre = input.next();
                if (adminler.get(mail).equals(sifre)) {
                    AdminAltMenu.adminAltMethod();
                    break;
                } else {
                    System.out.println(kirmizi + "Sifreyi yanlis girdiniz. ");
                }

            } else {
                System.out.println(kirmizi + "Yanlis mail adresi girdiniz tekrar deneyiniz");
                mail = input.next();
            }


    }
}

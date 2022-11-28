package shopping;

import java.util.Scanner;

public class KullaniciAnaMenuMethodlar {

    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);

    public static void kullaniciGiris() throws UrunBulunamadiException {
        System.out.println(kirmizi + "----------------# KULLANİCİ GİRİS SAYFASİ#-----------------------");
        System.out.println(mavi + "Mail adresinizi giriniz : ");
        KullaniciGirisKontrol.kullaniciGirisKontrol(KullaniciAnaMenu.kullaniciListesi);


    }


    public static void sifremiUnuttum() throws UrunBulunamadiException {
        System.out.println(kirmizi + "----------------# KULLANİCİ SIFREMİ UNUTTUM#-----------------------");
        System.out.println(yesil + "Mail adresinizi giriniz: ");
        String mailAdresi = input.next();

        if (KullaniciAnaMenu.kullaniciListesi.containsKey(mailAdresi)) {
            kullaniciGizliSoruKontrol(mailAdresi);
        } else {
            System.out.println(kirmizi+"Olmayan mail adresi girdiniz. Tekrar deneyiniz");
            sifremiUnuttum();

        }

    }

    public static void kullaniciGizliSoruKontrol(String mailAdersi) throws UrunBulunamadiException {
        System.out.println(sari + "Ilk evcil hayvaninizin ismini giriniz");
        String ilkEvcil = input.next().toLowerCase();
            if (AdminAnaMenu.gizliSoruKullanici.equals(ilkEvcil)) {
                System.out.println(mavi+"Sifreniz = "+  KullaniciAnaMenu.kullaniciListesi.get(mailAdersi).getSifre());
                System.out.println(sari + "Giris bolumune gitmek icin herhangi bir tusa basiniz\n");
                input.next();
                KullaniciAnaMenu.kullaniciAnaMenu();
            } else {
                System.out.println("Yanlis cevap verdiniz\n"+ " Tekrar deneyiniz.");
                kullaniciGizliSoruKontrol(mailAdersi);


        }
    }



    public static void kayitOl() throws UrunBulunamadiException {
        System.out.println(kirmizi + "----------------# KULLANİCİ KAYİT SAYFASİ#-----------------------");
        KullaniciKayitKontrol.emailKontrol();

    }
}

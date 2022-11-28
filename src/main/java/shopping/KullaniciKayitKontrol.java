package shopping;

import java.util.Scanner;

public class KullaniciKayitKontrol {
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";
    static Scanner input = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);


    public static void emailKontrol() throws UrunBulunamadiException {
        System.out.println(sari + "Email adresinizi giriniz");
        boolean durum = true;
        while (durum) {
            String email = input.next();
            if (KullaniciAnaMenu.kullaniciListesi.containsKey(email)) {
                System.out.println(mor + "Bu maile adresine kayitli bir kullanici vardir\n" +
                        "Lutfen farkli bir mail adresi giriniz");
            } else {
                durum = false;
                sifreKontrol(email);
            }

        }

    }

    public static void sifreKontrol(String email) throws UrunBulunamadiException {
        System.out.println(sari + "Sifre olusturunuz\n" +
                "Sifre en az bir buyuk harf, en az bir kucuk harf ve en az bir rakam icermelidir.");

        boolean drm = true;
        while (drm) {
            String sifre = input.next();
            boolean kontrol = sifre.matches(".*[0-9].*") &&
                    sifre.matches(".*[a-z].*") &&
                    sifre.matches(".*[A-Z].*");

            if (kontrol) {
                tamIsimVeTelefon(email, sifre);
                drm = false;
            } else {
                System.out.println(yesil + "Gecersiz sifre giriniz. Tekrar sifre olusturunuz.");
            }

        }
    }

    public static void tamIsimVeTelefon(String email, String sifre) throws UrunBulunamadiException {
        System.out.println(sari + "Isminizi giriniz");
        String tamIsim = scan.nextLine();
        System.out.println(sari + "Telefon numaranizi giriniz");
        String telefon = input.next();

        KullaniciPojo obje = new KullaniciPojo(email, sifre, tamIsim, telefon);
        KullaniciAnaMenu.kullaniciListesi.put(email, obje);

        System.out.println(yesil + "Kullanici menuye donmek icin 1'e\n" +
                "Anasayfaya donmek icin baska herhangi bir tusa basiniz");

        String scm = input.next();

        if (scm.equals("1")) {
            KullaniciAnaMenu.kullaniciAnaMenu();
        } else {
            Anasayfa.anasayfaMethodu();
        }


    }
}

package shopping;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class KullaniciAltMenuMethodlari {
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";
    static DecimalFormat moneyFormat = new DecimalFormat("'$ '###,##0.00");
    static Scanner input = new Scanner(System.in);

    static HashMap<Integer, LocalTime> odemeTarihi = new HashMap<>();
    static HashMap<Integer, Double> fisveTutar = new HashMap<>();
    static int fisNo = 103;
    static LocalTime odemTarihi;
    static LocalTime iadeTarihi;

    public static void temelGida() throws UrunBulunamadiException {
        System.out.println(mavi + "------------#Temel Gida Urunleri#--------------");
        System.out.println(sari + "ID     ISIM        FIYAT  \n" +
                "----------------------------------------------------");

        for (Map.Entry<String, UrunPojo> w : UrunPojo.urunListesiSet) {
            String key = w.getKey();
            if (UrunPojo.urunListesi.get(key).getBolum().equals("temelgida")) {
                System.out.println(key + ". " + UrunPojo.urunListesi.get(key).getUrunIsmi() + "--------"
                        + UrunPojo.urunListesi.get(key).getFiyat());

            }

        }
        System.out.println(mavi + "Sepete eklemek istediginiz urunun id'sini giriniz");
        String keyyyy = input.next();
        System.out.println(mavi + "Urun adeti seciniz");
        int adet = input.nextInt();
        double toplamTutar = UrunPojo.urunListesi.get(keyyyy).getFiyat() * adet;
        String alinanUrun = adet + " adet " + UrunPojo.urunListesi.get(keyyyy).getUrunIsmi();//48. satira bu kod yazilacak.
        Sepet obje = new Sepet(alinanUrun, toplamTutar);

        Sepet.sepet.put(keyyyy, obje);

        System.out.println(yesil + "Urun sepete eklendi.\n" +
                "Urun eklemeye deva metmek icin 1'e basiniz\n" +
                "Ust menuye donmek icin baska bir tusa basiniz");
        String secim = input.next();

        if (secim.equals("1")) {
            temelGida();
        } else {
            KullaniciAltMenu.kullaniciAltMenu();
        }

    }

    public static void manav() throws UrunBulunamadiException {
        System.out.println(mavi + "------------#MANAV URUNLERİ#--------------");
        System.out.println(sari + "ID    ISIM       FIYAT    \n" + "" +
                "---------------------------------------------------");

        for (Map.Entry<String, UrunPojo> w : UrunPojo.urunListesiSet) {
            String key = w.getKey();
            if (UrunPojo.urunListesi.get(key).getBolum().equals("manav")) {
                System.out.println(key + ". " + UrunPojo.urunListesi.get(key).getUrunIsmi() + "--------"
                        + UrunPojo.urunListesi.get(key).getFiyat());

            }

        }
        System.out.println(mavi + "Sepete eklemek istediginiz urunun id'sini giriniz");
        String keyyyy = input.next();
        System.out.println(mavi + "Kac kg istiyorsunuz");
        int kg = input.nextInt();
        double toplamTutar = UrunPojo.urunListesi.get(keyyyy).getFiyat() * kg;
        String alinanUrun = kg + " Kg " + UrunPojo.urunListesi.get(keyyyy);
        Sepet obje = new Sepet(alinanUrun, toplamTutar);

        Sepet.sepet.put(keyyyy, obje);

        System.out.println(yesil + "Urun sepete eklendi.\n" +
                "Urun eklemeye deva metmek icin 1'e basiniz\n" +
                "Ust menuye donmek icin baska bir tusa basiniz");
        String secim = input.next();

        if (secim.equals("1")) {
            manav();
        } else {
            KullaniciAltMenu.kullaniciAltMenu();
        }

    }

    public static void sarkuteri() throws UrunBulunamadiException {
        System.out.println(mavi + "------------#SARKUTERİ URUNLERİ#--------------");
        System.out.println(sari + "ID   ISIM     FIYAT    \n" + "" +
                "-------------------------------------------------------");

        for (Map.Entry<String, UrunPojo> w : UrunPojo.urunListesiSet) {
            String key = w.getKey();
            if (UrunPojo.urunListesi.get(key).getBolum().equals("sarkuteri")) {
                System.out.println(key + ". " + UrunPojo.urunListesi.get(key).getUrunIsmi() + "--------"
                        + UrunPojo.urunListesi.get(key).getFiyat());

            }

        }
        System.out.println(mavi + "Sepete eklemek istediginiz urunun id'sini giriniz");
        String keyyyy = input.next();
        System.out.println(mavi + "Urun miktari seciniz");
        int miktar = input.nextInt();
        double toplamTutar = UrunPojo.urunListesi.get(keyyyy).getFiyat() * miktar;
        String alinanUrun = miktar + " paket " + UrunPojo.urunListesi.get(keyyyy);
        Sepet obje = new Sepet(alinanUrun, toplamTutar);

        Sepet.sepet.put(keyyyy, obje);


        System.out.println(yesil + "Urun sepete eklendi.\n" +
                "Urun eklemeye deva metmek icin 1'e basiniz\n" +
                "Ust menuye donmek icin baska bir tusa basiniz");
        String secim = input.next();

        if (secim.equals("1")) {
            sarkuteri();
        } else {
            KullaniciAltMenu.kullaniciAltMenu();
        }

    }

    public static void sepettenUrunCikart() throws UrunBulunamadiException {
        System.out.println(mavi + "------------#SEPETTEN URUN CİKART #--------------");
        System.out.println(sari + "ID       URUNLER         TOPLAM TUTAR  " +
                "\n------------------------------------------");

        for (Map.Entry<String, Sepet> w : Sepet.sepetSet) {
            String key = w.getKey();

            System.out.println(key + "----" + Sepet.sepet.get(key).getAlinanMiktar() + "-----" + moneyFormat.format(Sepet.sepet.get(key).getToplamTurar()));
        }
        System.out.println(yesil + "Sepetten cikartmak istediginiz urunun ID'sini giriniz : ");

        String sepettenCikacakUrunId = input.next();

        if (Sepet.sepet.containsKey(sepettenCikacakUrunId)) {

            Sepet.sepet.remove(sepettenCikacakUrunId);
            Sepet.sepetSet.remove(sepettenCikacakUrunId);
            System.out.println(mavi + "Urun basariyla sepetten cikartildi. \n" +
                    "Sepetten urun cikartmaya devam etmek icin 1'e\n" +
                    "Kullancini menuye donmek icin baska bir tusa basiniz");
            String secim = input.next();

            if (secim.equals("1")) {
                sepettenUrunCikart();
            } else {
                KullaniciAltMenu.kullaniciAltMenu();
            }


        } else {
            System.out.println(kirmizi + " Yanlis Id girdiniz. Tekrar deneyin");
            sepettenUrunCikart();
        }

    }


    public static void odemeSayfasi() throws UrunBulunamadiException {
        System.out.println(mavi + "------------# ODEME SAYFASİ #--------------");
        double harcamaTutari = 0;
        DecimalFormat moneyFormat = new DecimalFormat("'$ '###,##0.00");
        for (Map.Entry<String, Sepet> w : Sepet.sepetSet) {
            String key = w.getKey();
            harcamaTutari += Sepet.sepet.get(key).getToplamTurar();

        }
        System.out.println(mor + "Toplam harcama tutariniz = " + moneyFormat.format(harcamaTutari));

        System.out.println(yesil + "Alisveris tutariniza asagidaki indirimler uygulanacaktir.\n");
        System.out.println(sari + "1. 100 ile 200 Tl arasina harcama tutarindan %10 indirim\n" +
                "2. 200 ile 500 Tl arasina harcama tutarindan %20 indirim\n" +
                "3. 500 Tl'den fazla alisverislerinizde %25 indirim.\n");
        double indirimSonrasi = Kasa.indirimBelirleme(harcamaTutari);
        System.out.println(sari + "Odenecek tutar = " + moneyFormat.format(indirimSonrasi));
        System.out.println(mavi + "Odeme yapmak icin herhangi bir tusa basiniz\n");
        input.next();
        odemTarihi = LocalTime.now();
        System.out.println(sari + "Fis numraniz = " + fisNo);
        odemeTarihi.put(fisNo, odemTarihi);
        fisveTutar.put(fisNo, indirimSonrasi);
        Kasa.odemeMethod(indirimSonrasi);

        for (Map.Entry<String, Sepet> w : Sepet.sepetSet) {
            String key = w.getKey();

            Sepet.eskiAlisVerisListe.put(fisNo, indirimSonrasi);
        }

        Sepet.sepet.clear();

        System.out.println(mor + "Odeme basariyla alinmistir.\n" +
                "Kullanici menuye donmek icin herhangi bir tusa basiniz.");
        input.next();

        KullaniciAltMenu.kullaniciAltMenu();


    }

    public static void iade() throws UrunBulunamadiException {
        System.out.println(mavi + "------------# IADE SAYFASİ #--------------");
        System.out.println(sari + "Fis numarasi giriniz");
        int fisNo = input.nextInt();

        if (fisveTutar.containsKey(fisNo)) {
            iadeTarihi = LocalTime.now();
            Long fark = ChronoUnit.HOURS.between(odemTarihi, iadeTarihi);
            if (fark < 24) {
                System.out.println(mor + "Alisverisiniz uzerindne 24 saat gecmedigi icin iadeyi kabul ediyoruz");
                System.out.println(yesil + "Iade edilen tutar = " + fisveTutar.get(fisNo));
                Kasa.setKasa(Kasa.getKasa() - fisveTutar.get(fisNo));
                System.out.println(yesil + "Kullanici menuye donmek icin herhangi bir tusa basiniz.");
                input.next();

                KullaniciAltMenu.kullaniciAltMenu();

            } else {
                System.out.println(kirmizi + "Sadece ilk 24 saat icinde iade kabul ediyoruz");
                System.out.println(yesil + "Kullanici menuye donmek icin herhangi bir tusa basiniz.");
                input.next();

                KullaniciAltMenu.kullaniciAltMenu();

            }

        } else {
            System.out.println(kirmizi + "Yanlis fis numrasi girdiniz\n Tekrar deneyiniz");
            iade();
        }


    }

    public static void gecmisAlisVerislerim() throws UrunBulunamadiException {
        System.out.println(mavi + "------------# GECMİS ALİSVERİSLİSTEM  #--------------");

        for (Map.Entry<Integer, Double> w : Sepet.eskiListeSet) {
            Integer key = w.getKey();
            System.out.println(mor + "FISNO---------------TOPLAM TUTAR");
            System.out.println("---------------------------------------------------");
            System.out.println(yesil + key + "------" + Sepet.eskiAlisVerisListe.get(key));
            System.out.println("---------------------------------------------------");


        }
        System.out.println(mor + "Kullanici menuye donmek icin herhangi bir tusa basiniz.");
        input.next();
        KullaniciAltMenu.kullaniciAltMenu();
    }

    public static void bilgilerimiGuncelle() throws UrunBulunamadiException {
        System.out.println(kirmizi + "----------------# KULLANİCİ BILGILERİMİ GUNCELLE-----------------------");

        System.out.println(sari + "Sisteme kayitli oldugunuz mail adresini girin.");
        String mailAdresi = input.next();

        if (KullaniciAnaMenu.kullaniciListesi.containsKey(mailAdresi)) {
            System.out.println(sari + "Guncellemek istediginiz alani seciniz :");
            System.out.println(mavi + "1. Mail Adresimi Guncelle\n" + "" +
                    "2. Sifremi Guncelle\n" +
                    "3. Ad soyadimi Guncelle\n" +
                    "4. Telefon Numarami Guncelle\n" +
                    "5. Kullanici Sayfasi");

            String secim = input.next();

            switch (secim) {
                case "1":
                    KullaniciBilgilerimiGuncelleMethodlar.mailAdresimiGuncelle(mailAdresi);
                    break;
                case "2":
                    KullaniciBilgilerimiGuncelleMethodlar.sifremiGuncelle(mailAdresi);
                    break;
                case "3":
                    KullaniciBilgilerimiGuncelleMethodlar.adSoyadiGuncelle(mailAdresi);
                    break;
                case "4":
                    KullaniciBilgilerimiGuncelleMethodlar.telefonNumarasiGuncelle(mailAdresi);
                    break;
                case "5":
                    KullaniciAltMenu.kullaniciAltMenu();
                    break;
                default:
                    System.out.println(kirmizi + "Yanlis secim yaptiniz. tekrar giris yapiniz");
                    bilgilerimiGuncelle();
            }

        } else {
            System.out.println(kirmizi + "Sisteme kayitli olmayan bir mail adresi girdiniz. Tekrar giris yapiliniz.");
            bilgilerimiGuncelle();
        }


    }


}

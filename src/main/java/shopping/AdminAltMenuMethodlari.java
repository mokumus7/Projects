package shopping;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdminAltMenuMethodlari {
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";

    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);


    public static void urunTanimlama() throws UrunBulunamadiException {
        System.out.println(mavi + "-------------------# URUN TANİMLAMA #----------------");
        System.out.println(sari + "Urun ID giriniz");
        String urunId = input.next();
        System.out.println(sari + "Urun ismi giriniz");
        String urunIsmi = input.next();
        int miktar = 0;
        System.out.println(sari + "Urun fiyatini giriniz");
        double fiyat = input.nextDouble();
        System.out.println(sari + "Urun bolum giriniz");
        String bolum = input.next().toLowerCase();
        UrunPojo obje = new UrunPojo(urunIsmi, miktar, fiyat, bolum);
        UrunPojo.urunListesi.put(urunId, obje);
        System.out.println(mor + "Urun tanimlamaya deva metmek icin 1'ye basiniz\n" +
                "Admin menuye donmek icin baska herhangi bir tusa basiniz");

        String sss = input.next();

        if (sss.equals("1")) {
            urunTanimlama();
        } else {
            AdminAltMenu.adminAltMethod();
        }


    }

    public static void urunGiris() throws UrunBulunamadiException {
        System.out.println(mavi + "-------------------# URUN GİRİS #----------------");
        System.out.println("Giris yapmak istediginiz urunun Id'sini Giriniz");
        String urunId = input.next();

        if (UrunPojo.urunListesi.containsKey(urunId)) {
            System.out.println("Urun mktarini Giriniz");
            int miktar = input.nextInt();
            int depodakiMiktar = UrunPojo.urunListesi.get(urunId).getMiktar();
            UrunPojo.urunListesi.get(urunId).setMiktar(miktar + depodakiMiktar);
            System.out.println(mor + "Urun girisine devam etmek icin 1'ye basiniz\n" +
                    "Admin menuye donmek icin baska herhangi bir tusa basiniz");

            String sss = input.next();

            if (sss.equals("1")) {
                urunGiris();
            } else {
                AdminAltMenu.adminAltMethod();
            }

        } else {
            throw new UrunBulunamadiException("urunGiris");
        }


    }//ex

    public static void urunListeleme() throws UrunBulunamadiException {
        System.out.println(mavi + "-------------------# URUN LISTELEME #----------------");

        System.out.println(sari + "Id           Ad                Miktar              Fiyat                Bolum   " +
                "\n------------------------------------------------------------------------------------------------");


        for (String w : UrunPojo.urunListeKeySet) {
            String key = w;


            System.out.printf("%-20s %-19s %-19s %-19s %-19s\n", key, UrunPojo.urunListesi.get(key).getUrunIsmi(),
                    UrunPojo.urunListesi.get(key).getMiktar(), UrunPojo.urunListesi.get(key).getFiyat(),
                    UrunPojo.urunListesi.get(key).getBolum());


        }
        System.out.println(mor + "Admin menusune donmek icin 1'ye basiniz\n" +
                "Anasayfaya donmek icin baska herhangi bir tusa basiniz");

        String sss = input.next();

        if (sss.equals("1")) {
            AdminAltMenu.adminAltMethod();
        } else {
            Anasayfa.anasayfaMethodu();
        }
    }

    public static void urunArama() throws UrunBulunamadiException {
        System.out.println(mavi + "-------------------# URUN ARAMA #----------------");
        System.out.println("Aramak istediginiz  urunun Id'sini Giriniz");
        String urunId = input.next();

        if (UrunPojo.urunListesi.containsKey(urunId)) {

            System.out.println(sari + "Urun ID = " + urunId);
            System.out.println(sari + "Urun Ismi = " + UrunPojo.urunListesi.get(urunId).getUrunIsmi());
            System.out.println(sari + "Urun Fiyati = " + UrunPojo.urunListesi.get(urunId).getFiyat());
            System.out.println(sari + "Urun Miktari = " + UrunPojo.urunListesi.get(urunId).getMiktar());
            System.out.println(sari + "Urun Bolum = " + UrunPojo.urunListesi.get(urunId).getBolum());

            System.out.println(mor + "Admin menusune donmek icin 1'ye basiniz\n" +
                    "Anasayfaya donmek icin baska herhangi bir tusa basiniz");

            String sss = input.next();

            if (sss.equals("1")) {
                AdminAltMenu.adminAltMethod();
            } else {
                Anasayfa.anasayfaMethodu();
            }

        } else {
            throw new UrunBulunamadiException("urunArama");

        }
        System.out.println(mor + "Admin menusune donmek icin 1'ye basiniz\n" +
                "Anasayfaya donmek icin baska herhangi bir tusa basiniz");

        String sss = input.next();

        if (sss.equals("1")) {
            AdminAltMenu.adminAltMethod();
        } else {
            Anasayfa.anasayfaMethodu();
        }


    }//ex

    public static void urunSilme() throws UrunBulunamadiException {
        System.out.println(mavi + "-------------------# URUN SILME #----------------");
        System.out.println("Silmek istediginiz urunun Id'sini Giriniz");
        String urunId = input.next();

        if (UrunPojo.urunListesi.containsKey(urunId)) {

            System.out.println(sari + "Urun ID = " + urunId);
            System.out.println(sari + "Urun Ismi = " + UrunPojo.urunListesi.get(urunId).getUrunIsmi());
            System.out.println(sari + "Urun Fiyati = " + UrunPojo.urunListesi.get(urunId).getFiyat());
            System.out.println(sari + "Urun Miktari = " + UrunPojo.urunListesi.get(urunId).getMiktar());
            System.out.println(sari + "Urun Bolum = " + UrunPojo.urunListesi.get(urunId).getBolum());

            System.out.println(kirmizi + "Bu urunu silmek istiyorsaniz 1'e\n" +
                    "Tekrar ID girmek icin baska bir tusa basiniz");
            String secim = input.next();
            if (secim.equals("1")) {
                UrunPojo.urunListesi.remove(urunId);
                System.out.println(mavi + "Urun basariyla silinmistir.");

                System.out.println(mor + "Admin menusune donmek icin 1'ye basiniz\n" +
                        "Anasayfaya donmek icin baska herhangi bir tusa basiniz");

                String sss = input.next();

                if (sss.equals("1")) {
                    AdminAltMenu.adminAltMethod();
                } else {
                    Anasayfa.anasayfaMethodu();
                }

            } else {
                urunSilme();
            }


        } else {
            throw new UrunBulunamadiException("urunSilme");
        }
        System.out.println(mor + "Admin menusune donmek icin 1'ye basiniz\n" +
                "Anasayfaya donmek icin baska herhangi bir tusa basiniz");

        String sss = input.next();

        if (sss.equals("1")) {
            AdminAltMenu.adminAltMethod();
        } else {
            Anasayfa.anasayfaMethodu();
        }
    }//ex

    public static void urunGuncelle() throws UrunBulunamadiException {
        System.out.println(mavi + "-------------------# URUN GUNCELLEME #----------------");
        System.out.println(yesil + "Guncellemek istediginiz  urunun Id'sini Giriniz");
        String urunId = input.next();

        if (UrunPojo.urunListesi.containsKey(urunId)) {
            System.out.println(mavi + "1. ID degistir\n" +
                    "2. Ismini degistir\n" +
                    "3. Miktarini degistir\n" +
                    "4. Fiyat degistir\n" +
                    "5. Admin menu");

            String secim = input.next();
            switch (secim) {
                case "1":
                    System.out.println(sari + "Yeni ID giriniz");
                    String id = input.next();
                    UrunPojo.urunListesi.put(id, UrunPojo.urunListesi.get(urunId));
                    UrunPojo.urunListesi.remove(urunId);
                    urunGuncelle();
                    break;
                case "2":
                    System.out.println(sari + "Yeni isim giriniz");
                    String isim = input.next();
                    UrunPojo.urunListesi.get(urunId).setUrunIsmi(isim);
                    urunGuncelle();
                    break;
                case "3":
                    System.out.println(sari + "Yeni miktari giriniz");
                    int miktar = input.nextInt();
                    UrunPojo.urunListesi.get(urunId).setMiktar(miktar);
                    urunGuncelle();
                    break;
                case "4":
                    System.out.println(sari + "Yeni fiyati giriniz");
                    double fiyat = input.nextDouble();
                    UrunPojo.urunListesi.get(urunId).setFiyat(fiyat);
                    urunGuncelle();
                    break;
                case "5":
                    AdminAltMenu.adminAltMethod();
                    break;
                default:
                    System.out.println("Yanlis giris yaptiniz\n");
                    urunGuncelle();
            }


            System.out.println(mor + "Urun girisine devam etmek icin 1'ye basiniz\n" +
                    "Admin menuye donmek icin baska herhangi bir tusa basiniz");

            String sss = input.next();

            if (sss.equals("1")) {
                urunGiris();
            } else {
                AdminAltMenu.adminAltMethod();
            }

        } else {
            throw new UrunBulunamadiException("urunGuncelle");
        }


    }

    public static void kayitliMusterilerListeleme() throws UrunBulunamadiException {
        System.out.println(mavi + "-------------------# MUSTERİ LISTESİ #----------------");

        System.out.println(sari + "Mail          Ad-Soyad                Telefon     " +
                "\n-----------------------------------------------------------------");

        for (Map.Entry<String, KullaniciPojo> w : KullaniciAnaMenu.kullaniciListesiSet) {
            String key = w.getKey();
            System.out.printf("%-20s %-19s %-19s \n", key, KullaniciAnaMenu.kullaniciListesi.get(key).tamIsim,
                    KullaniciAnaMenu.kullaniciListesi.get(key).getTelefonNumarasi());

            System.out.println(mor + "Admin menusune donmek icin 1'ye basiniz\n" +
                    "Anasayfaya donmek icin baska herhangi bir tusa basiniz");

            String sss = input.next();

            if (sss.equals("1")) {
                AdminAltMenu.adminAltMethod();
            } else {
                Anasayfa.anasayfaMethodu();
            }

        }


    }

    public static void ciro() throws UrunBulunamadiException {
        System.out.println(mavi + "-----------------# CIRO # -----------------------");
        System.out.println(yesil + "Su ana kadar toplam ciro = " + Kasa.getKasa());


        System.out.println(mor + "Admin menuye donmek icin herhangi bir tusa basiniz\n");
        input.next();
        AdminAltMenu.adminAltMethod();

    }


}

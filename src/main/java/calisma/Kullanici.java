package calisma;

import java.util.Scanner;

public class Kullanici {

    static Scanner input = new Scanner(System.in);

    public static void kullaniciBilgiAl() {
        System.out.println("kimlik numrasi giriniz");
        String kimlikNo = input.next();
        System.out.println("adres giriniz");
        String adres = input.next();
        System.out.println("telefon giriniz giriniz");
        String tel = input.next();
        System.out.println("isim giriniz");
        String isim = input.next();

        Calisma1 obje1 = new Calisma1(kimlikNo, adres, tel, isim);

        Runner.kullaniciListesi.put(kimlikNo, obje1);

        Q1.ekranaListeYazdir();

    }
}

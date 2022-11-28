package calisma;

import java.util.Scanner;

public class Q1 {

    /*
    kadin ve erkeklerin emekliligi.
    erkekleri 60
    kadinlar 55..
    bir method
     */


  static  Scanner input = new Scanner(System.in);

    public static void emeklilik() {
        System.out.println("yasiniziniz giriniz");
        int yas=input.nextInt();
        System.out.println("Cinsiyetinizi giriniz");
        String cinsiyet= input.next().toLowerCase();

        if(cinsiyet.equals("erkek")){
            Q2.erkekEmeklilik(yas);
        } else if (cinsiyet.equals("kadin")) {
            Q2.kadinEmeklilik(yas);
        }


    }


    public static void ekranaListeYazdir(){
        System.out.println(Runner.kullaniciListesi);
        Kullanici.kullaniciBilgiAl();
    }

}

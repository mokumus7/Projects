package calisma;

import shopping.UrunPojo;

import javax.swing.*;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {
  static  HashMap<String, Calisma1> kullaniciListesi = new HashMap<>();

    public static void main(String[] args) {

//        Kullanici.kullaniciBilgiAl();

        System.out.println("-------------------# URUN TANİMLAMA #----------------");
        String urunId = JOptionPane.showInputDialog("Urun Id'sini Giriniz");
        String urunIsmi = JOptionPane.showInputDialog("Urun ismini Giriniz");
        int miktar = Integer.parseInt(JOptionPane.showInputDialog("Urun mktarini Giriniz"));
        double fiyat = Double.parseDouble((JOptionPane.showInputDialog("Urun fiyatini Giriniz")));
        String bolum = JOptionPane.showInputDialog("Urun bolumunu Giriniz");



    }
}

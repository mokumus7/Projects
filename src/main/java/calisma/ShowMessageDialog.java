package calisma;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ShowMessageDialog {

    public static void main(String[] args) {
        Map<Integer,String> cekilis=new HashMap<>();

      String urunAdi= JOptionPane.showInputDialog("Urun Adi Giriniz");



        int kisiSayisi=Integer.parseInt(JOptionPane.showInputDialog("Kuraya katilan kisi sayisi..: "));

        int a;
        String ad[]=new String[kisiSayisi];
        for(a=0; a<kisiSayisi; a++){
            ad[a]=JOptionPane.showInputDialog(null,a+1+".Aday!");


        }
        for(a=0;a<kisiSayisi; a++){
            cekilis.put(a,ad[a]);

        }
        int sans=(int)(Math.random()*kisiSayisi);//Kura cekilisi yapildi
        //cekilise katilanlari goster ve sansli kisiyi ekranda goster
        if (cekilis.containsKey(sans)){

            JOptionPane.showMessageDialog(null,cekilis.get(sans),"Sansli kisi",1);
        }

    }
}


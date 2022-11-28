package shopping;

import java.util.Scanner;

public class UrunBulunamadiException extends Exception {

    public UrunBulunamadiException( String location) throws UrunBulunamadiException {
        System.out.println("Olmayan ID girdiniz");
        if (location.equals("urunArama")) {
            AdminAltMenuMethodlari.urunArama();
        } else if (location.equals("urunGiris")) {
            AdminAltMenuMethodlari.urunGiris();

        } else if (location.equals("urunSilme")) {
            AdminAltMenuMethodlari.urunSilme();
        } else if (location.equals("urunGuncelle")) {
            AdminAltMenuMethodlari.urunGuncelle();
        }

        Scanner input = new Scanner(System.in);


    }
}

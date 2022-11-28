package shopping;

import java.time.LocalTime;
import java.util.HashMap;

public class Kasa {



    static private double kasa;

    public static double getKasa() {
        return kasa;
    }

    public static void setKasa(double kasa) {
        Kasa.kasa = kasa;
    }


    public static void odemeMethod(double toplamTutar) {
        kasa += toplamTutar;
    }

    public static double indirimBelirleme(double toplamTutar) {

        if (toplamTutar > 100 && toplamTutar < 200) {
            return toplamTutar * 0.90;
        } else if (toplamTutar > 200 && toplamTutar < 500) {
            return toplamTutar * 0.80;
        } else if (toplamTutar>500) {
            return toplamTutar * 0.75;
        }
        return toplamTutar;
    }


}

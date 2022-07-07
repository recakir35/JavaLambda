package day03;

import java.util.Comparator;

public class C04 {
    public static void main(String[] args) {
        // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
        C01_distinct.menu.// akış kaynağı
                stream().// akışa girdi
                sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).// Aksiyona göre karşılaştırma
                reversed()).// tersten
                forEach(t-> System.out.print(t+" "));// yazdırdır
    }
}
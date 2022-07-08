package day03;

import day01.C_Utilities;

import java.util.Comparator;

public class C03 {
    public static void main(String[] args) {
        // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
        C01_distinct.menu.// akış kaynağı
                stream().// akışa girdi
                sorted(Comparator.comparing(String::length)).// Aksiyona göre karşılaştırma
                forEach(t-> System.out.print(t+" "));// yazdırdır
    }
}

package day03;

import day01.C_Utilities;

import java.util.Comparator;

public class C05 {
    public static void main(String[] args) {
        // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,
                                                // ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz..
        C01_distinct.menu.
                stream().
                map(t -> t.length() * t.length()).
                filter(C_Utilities::ciftBul).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(C_Utilities::yazdir);
    }
}


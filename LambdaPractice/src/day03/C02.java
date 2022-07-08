package day03;

import day01.C_Utilities;

import java.util.Comparator;

public class C02 {
    public static void main(String[] args) {
        // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
        C01_distinct.menu.// akış kaynağı
                stream().// akışa girdi
                map(String::length).// Carakter sayısı
                sorted(Comparator.reverseOrder()).// ters sıralı sıraladı
                distinct().// benzersiz,tekrarsız hale getirdi.
                forEach(C_Utilities::yazdir); // yazdırdır
    }
}

package day02;

import day01.C_Utilities;

import java.util.Comparator;

public class C11 {
    public static void main(String[] args) {
        // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
       C01_map.sayi.// akış kaynağı
                stream().// akışa alındı
                filter(t -> t % 2 == 1).// tek sayılar filtrelendi
                map(t -> t * t).//tek sayıların karesi alındı
                sorted(Comparator.reverseOrder()).//sıralandı büyükten küçüğe
               forEach(C_Utilities::yazdir);// prin edildi.

    }
}

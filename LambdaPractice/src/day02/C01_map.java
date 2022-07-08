package day02;

import day01.C_Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_map {
    public static List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));

    public static void main(String[] args) {
        // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
        sayi.
                stream().
                filter(C_Utilities::ciftBul).
                map(t->t*t).//map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.
                forEach(C_Utilities::yazdir);
    }
}

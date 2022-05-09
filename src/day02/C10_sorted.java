package day02;

import day01.C_Utilities;

public class C10_sorted {
    public static void main(String[] args) {
        // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
        C01_map.sayi.
                stream().// akışa alındı
                filter(C_Utilities::ciftBul).// çift sayılar filtrelendi
                map(t -> t * t).// cift sayıların karesi alındı
                sorted().//sıralandı
                forEach(C_Utilities::yazdir);// prin edildi.
        //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
        //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.
    }
}

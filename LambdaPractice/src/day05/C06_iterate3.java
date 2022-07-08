package day05;

import day01.C_Utilities;

import java.util.stream.IntStream;

public class C06_iterate3 {
    public static void main(String[] args) {
        istenenSayiIlkXKuvveti(4, 3);
    }
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

    public static void istenenSayiIlkXKuvveti(int istenenSayi, int x) {
        IntStream.
                iterate(istenenSayi, t -> t * istenenSayi).// 2 den sonsuza kadar elememanları 2'ile çarparak elemanları akışa alır.
                limit(x).//ilk x akışı alır
                forEach(C_Utilities::yazdir); // yazdırır
    }
}

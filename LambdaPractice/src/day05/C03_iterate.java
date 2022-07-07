package day05;

import java.util.stream.IntStream;

public class C03_iterate {
    public static void main(String[] args) {
        System.out.println("TASK 03 -->" + toplaIlkXCift(10));
    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplaIlkXCift(int x) {
        return IntStream.
                iterate(2, t -> t + 2).// 2 den sonsuza kadar elememanları 2 artırarak elemanları akışa alır.
                //iterate(seed, repeat action) --> seed'den başlayarak repeat action'a göre  sonsuza kadar elemanları akısa koy

                        limit(x).//ilk x akışı alır
                        sum(); // akıştaki değerler toplandı
    }
}

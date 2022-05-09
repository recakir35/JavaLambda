package day05;

import java.util.stream.IntStream;

public class C04_iterate1 {
    public static void main(String[] args) {
        System.out.println("TASK 04 -->" + toplaIlkXTek(10));
    }
    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int toplaIlkXTek(int x) {
        return IntStream.
                iterate(1, t -> t + 2).// 1 den sonsuza kadar elememanları 2 artırarak elemanları akışa alır.
                //iterate(seed, repeat action) --> seed'den başlayarak repeat action'a göre  sonsuza kadar elemanları akısa koy

                        limit(x).//ilk x akışı alır
                        sum(); // akıştaki değerler toplandı
    }
}

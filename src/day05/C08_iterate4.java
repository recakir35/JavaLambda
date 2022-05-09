package day05;

import java.util.stream.IntStream;

public class C08_iterate4 {
    public static void main(String[] args) {
        System.out.println("TASK 08 -->"+istenenSayiIlkXciKuvveti(4,3));
    }
    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.

    public static int istenenSayiIlkXciKuvveti(int istenenSayi, int x) {
        return IntStream.
                iterate(istenenSayi, t -> t * istenenSayi).// 2 den sonsuza kadar elememanları 2'ile çarparak elemanları akışa alır.
                limit(x).//ilk x akışı alır
                reduce(0,(t,u)->u);//atla
    }
}

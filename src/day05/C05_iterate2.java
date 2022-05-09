package day05;

import day01.C_Utilities;

import java.util.stream.IntStream;

public class C05_iterate2 {
    public static void main(String[] args) {
        ikiIlkXKuvvetPrint(7);
    }
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikiIlkXKuvvetPrint(int x) {
        IntStream.
                iterate(2, t -> t * 2).// 2 den sonsuza kadar elememanları 2'ile çarparak elemanları akışa alır.
                limit(x).//ilk x akışı alır
                forEach(C_Utilities::yazdir); // yazdırır
    }
}

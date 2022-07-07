package day05;

import day01.C_Utilities;

import java.util.stream.IntStream;

public class C02_rangeClosed {
    public static void main(String[] args) {
        System.out.println("TASK 02 -->" + toplaCift(10));
    }
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int toplaCift(int x) {
        return IntStream.
                rangeClosed(1, x).// 1 den x'e kadarn(x dahil)int degerler akışa alındı
                        filter(C_Utilities::ciftBul).
                sum(); // akıştaki değerler toplandı
    }
}

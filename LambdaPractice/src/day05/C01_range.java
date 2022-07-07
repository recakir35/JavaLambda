package day05;

import java.util.stream.IntStream;

public class C01_range {
    public static void main(String[] args) {
        System.out.println("TASK 01 Amele Topla --> " + toplaAmele(10));
        System.out.println("TASK 01 Cincix Topla --> " + toplaCincix(10));
    }
    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

    //Structured(AMELE) Programming
    public static int toplaAmele(int x) {
        int topla = 0;
        for (int i = 1; i <= x; i++) {
            topla += i;
        }
        return topla;
    }

    //Functional(cincix Programming
    public static int toplaCincix(int x) {
        return IntStream.
                range(1, x + 1).// 1 den x'e kadarn(x dahil)int degerler akışa alındı
                        sum(); // akıştaki değerler toplandı
    }
}

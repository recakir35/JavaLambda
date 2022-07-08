package day03;

import day01.C_Utilities;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class C09_findFirst_limit {
    public static void main(String[] args) {
        // Task : Karakter sayisi en buyuk elemani yazdiriniz.
        System.out.println(C01_distinct.menu.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).reversed()).
                findFirst());// ilk eleman alındı

        //********************************************************************************
        Stream<String> sonIsim = C01_distinct.menu.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).reversed()).
                limit(3);// ilk 3 eleman alındı
        System.out.println(Arrays.toString(sonIsim.toArray()));//arraya cevrilen sonIsim stream print edildi

        /*
        TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz. Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
          Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray())); kullanılabilir.
         */

        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
        // şekilde kesilmiş bir akış return eder. Stream return eder.
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır
    }
}

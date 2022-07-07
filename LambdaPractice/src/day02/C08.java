package day02;

import java.util.Optional;

public class C08 {
    public static void main(String[] args) {
        // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
        //1. yontem Method Reference --> Integer class
        Optional<Integer> minSayiInteger = C01_map.sayi.stream().reduce(Integer::min);
        System.out.println("1.Yöntem= "+minSayiInteger);
        //2. yontem Method Reference --> Math class
        System.out.println("2.Yöntem= "+ C01_map.sayi.
                stream().
                reduce(Math::min));

        //3. yontem Lambda Expression
        int minSayiLJambda = (C01_map.sayi.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y));
        System.out.println("3.Yöntem= "+minSayiLJambda);


    }
}

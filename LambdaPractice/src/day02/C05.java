package day02;

import day01.C_Utilities;

import java.util.Optional;

public class C05 {
    public static void main(String[] args) {
        // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
        Optional<Integer> kareEnBuyukEleman= C01_map.sayi.
                stream().
                filter(C_Utilities::ciftBul).
                map(t->t*t).
                reduce(Math::max);
        System.out.println(kareEnBuyukEleman);

        System.out.println("daha hızlı specific ınteger class : " + C01_map.sayi.
                stream().
                filter(C_Utilities::ciftBul).
                map(t -> t * t).
                reduce(Integer::max));//36 specific class daha hızlı run olur
    }
}

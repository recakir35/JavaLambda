package day02;

import day01.C_Utilities;

import java.util.Optional;

public class C07 {
    public static void main(String[] args) {
        // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
        //Method Ref...
        Optional<Integer> carpim= C01_map.sayi.
                stream().
                filter(C_Utilities::ciftBul).
                reduce(Math::multiplyExact);

        System.out.println(carpim);
        //Lambda Expression...
        System.out.println("Lambda Expression..."+ C01_map.sayi.stream().filter(C_Utilities::ciftBul).reduce(1,(a, b)->a*b));
    }
}

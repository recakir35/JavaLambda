package day05;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C07_multiplyExact {
    public static void main(String[] args) {
        System.out.println("TASK 07 -->"+istenenSayiFaktoriyel(5));
    }
    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    public static OptionalInt istenenSayiFaktoriyel(int x) {
        return IntStream.
                rangeClosed(1, x).
                reduce(Math::multiplyExact);
    }
}

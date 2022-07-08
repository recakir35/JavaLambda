package day02;

import java.util.Optional;

public class C09 {
    public static void main(String[] args) {
        // Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
        Optional<Integer> besBykEnKSayi= C01_map.sayi.
                stream().
                filter(t -> t % 2 == 1 && t > 5).// Tek sayı olması ve 5den büyük olmasını filtreliyor.
                reduce(Math::min);

        System.out.println(besBykEnKSayi);
    }
}

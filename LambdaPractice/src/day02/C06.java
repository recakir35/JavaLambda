package day02;

import java.util.Optional;

public class C06 {
    public static void main(String[] args) {
        // Task : List'teki tum elemanlarin toplamini yazdiriniz.
        //Lambda Expression...
        int toplam = C01_map.sayi.
                stream().
                reduce(0, (a, b) -> a + b);
         /*
        a ilk degerini her zaman atanan degerden (identity) alır
        b degerini her zamana  stream()'dan akısdan alır
        a ilk degerinden sonraki her değeri action(işlem)'dan alır
        */
        System.out.println("Lambda exp. : " + toplam);

        //Method Ref...
       Optional<Integer> toplam1= C01_map.sayi.stream().reduce(Integer::sum);//method ref

        System.out.println("Method Ref. : " + toplam1);
    }
}

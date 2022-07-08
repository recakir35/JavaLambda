package day03;

public class C06_allMatch {
    public static void main(String[] args) {
        // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
        boolean kontrol = C01_distinct.menu.
                stream().
                allMatch(t -> t.length() <= 7);
        if (kontrol) {
            System.out.println("List elemanları 7 ve daha az harften oluşuyor> " + kontrol);
        } else System.out.println("List elemanları 7 harften büyük> " + kontrol);
        //*******************************
        System.out.println("Cincix Code: "+ (C01_distinct.menu.
                stream().
                allMatch(t -> t.length() <= 7) ? "List elemanları 7 ve daha az harften oluşuyor> " : "List elemanları 7 harften büyük> "));

        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.

    }
}

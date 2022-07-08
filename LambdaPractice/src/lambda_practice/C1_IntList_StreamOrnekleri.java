package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        hepsiniYaz(list);
        System.out.println("2-***************************************");
        negatifYaz(list);
        System.out.println("3-***************************************");
        System.out.println("pozitifYaz(list) = " + pozitifYaz(list));
        System.out.println("4-***************************************");
        System.out.println("kareYaz(list) = " + kareYaz(list));
        System.out.println("5-***************************************");
        System.out.println("kareTekrarsizYaz(list) = " + kareTekrarsizYaz(list));
        System.out.println("6-***************************************");
        siralama(list);
        System.out.println("\n7-***************************************");
        TersSiralama(list);
        System.out.println("\n8-***************************************");
        System.out.println("küpBirBes(list) = " + küpBirBes(list));
        System.out.println("9-***************************************");
        System.out.println("KareBirBesDegil(list) = " + KareBirBesDegil(list));
        System.out.println("10-***************************************");
        toplam(list);
        System.out.println("11-***************************************");
        System.out.println("negatifKare(list) = " + negatifKare(list));
        System.out.println("12-***************************************");
        System.out.println("besdenBuyuk(list) = " + besdenBuyuk(list));
        System.out.println("13-***************************************");
        System.out.println("tumSifirKucukMu(list) = " + tumSifirKucukMu(list));
        System.out.println("14-***************************************");
        System.out.println("yuzEsitEleman(list) = " + yuzEsitEleman(list));
        System.out.println("15-***************************************");
        System.out.println("sifirEsitEleman(list) = " + sifirEsitEleman(list));
        System.out.println("16-***************************************");
        ilkBesTopla(list);
        System.out.println("17-***************************************");
        sonBesTopla(list);



    }

    // S1:listi aralarinda bosluk birakarak yazdiriniz //
    public static void hepsiniYaz(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }


    //S2: sadece negatif olanlari yazdir
    public static void negatifYaz(List<Integer> list) {
        list.stream().filter(t -> t < 0).forEach(t -> System.out.print(t + " "));
    }

    //S3: pozitif olanlardan yeni bir liste olustur
    public static List<Integer> pozitifYaz(List<Integer> list) {
        return list.stream().filter(t -> t > 0).collect(Collectors.toList());
    }

    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    public static List<Integer> kareYaz(List<Integer> list) {
        return list.stream().map(t->t*t).collect(Collectors.toList());
    }


    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
    public static List<Integer> kareTekrarsizYaz(List<Integer> list) {
        return list.stream().map(t->t*t).distinct().collect(Collectors.toList());
    }


    //S6: listin elemanlarini kucukten buyuge siralayalim
    public static void siralama(List<Integer> list) {
       list.stream().sorted().forEach(t-> System.out.print(t+" "));
    }

    //S7: listin elemanlarini buyukten kucuge siralayalim
    public static void TersSiralama(List<Integer> list) {
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }

    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim

    public static List<Integer> küpBirBes(List<Integer> list) {
        return list.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
    }

    //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    public static List<Integer> KareBirBesDegil(List<Integer> list) {
        return list.stream().filter(t->t>0).map(t->t*t).filter(t->t%10!=5).collect(Collectors.toList());
    }


    // S10 :list elemanlarini toplamini bulalim
    public static void toplam(List<Integer> list) {
        System.out.println(list.stream().reduce(Integer::sum));
    }

    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
    public static List<Integer> negatifKare(List<Integer> list) {
       return list.stream().filter(t->t<0).peek(t-> System.out.print(t+" ")).map(t->t*t).collect(Collectors.toList());
    }

    // S12 : listeden 5 den buyuk  sayi var mi?
    public static boolean besdenBuyuk(List<Integer> list) {
        return list.stream().anyMatch(t->t>5);
    }


    // S13 : listenin tum elemanlari sifirdan kucuk mu?
    public static boolean tumSifirKucukMu(List<Integer> list) {
        return list.stream().allMatch(t->t<0);
    }


    // S14: listenin 100 e esit elemani yok mu ?
    public static boolean yuzEsitEleman(List<Integer> list) {
        return list.stream().anyMatch(t->t==100);
    }


    // S15: listenin sifira esit elemani yok mu?
    public static boolean sifirEsitEleman(List<Integer> list) {
        return list.stream().anyMatch(t->t==0);
    }


    // S16:  listenin ilk 5 elemanini topla?
    public static void ilkBesTopla(List<Integer> list) {
        System.out.println( list.stream().limit(5).reduce(Integer::sum));
    }


    //S17: listenin son bes elemaninin  listele
    public static void sonBesTopla(List<Integer> list) {
        System.out.println( list.stream().skip(list.size()-5).reduce(Integer::sum));// atlayarakyazdırma
    }


}
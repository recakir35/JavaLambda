package day04;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda04 {

    public static void main(String[] args) {
        Universite u01 = new Universite("bogazici", "matematik", 571, 93);
        Universite u02 = new Universite("istanbul teknik", "matematik", 622, 81);
        Universite u03 = new Universite("istanbul", "hukuk", 1453, 71);
        Universite u04 = new Universite("marmara", "bilgisayar muh", 1071, 77);
        Universite u05 = new Universite("yıldız teknik", "gemi", 333, 74);
        List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

        System.out.println("Task 01: " + task1(unv));

        System.out.println("Task 02: " + task2(unv));

        System.out.println("Task 03: " + task3(unv));

        System.out.println("Task 04: " + task4(unv));

        System.out.println("Task 05: " + task5(unv));

        System.out.println("Task 06: " + task6(unv));

        System.out.println("Task 07: " + task7(unv));
        System.out.println("Task 07: " + task71(unv));

        System.out.println("Task 08: " + task8(unv));

        System.out.println("Task 09: " + task9(unv));

        System.out.println("Task 10: " + task10(unv));

        System.out.println("Task 11: " + task11(unv));

    }

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean task1(List<Universite> unv) {
        return unv.stream().allMatch(t -> t.getNotOrt() > 74);
    }

    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean task2(List<Universite> unv) {
        return unv.stream().allMatch(t -> t.getOgrcSayisi() > 110);
    }

    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean task3(List<Universite> unv) {
        return unv.stream().anyMatch(t -> t.getBolum() == "Matematik");
    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<Universite> task4(List<Universite> unv) {
        return unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).
                collect(Collectors.toList());//collect()->akısdaki elamanları istenen sarta gore toplar
        //Collectors.toList()->collect'e toplanan elemanlarilist'e cevirir
    }

    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static List<Universite> task5(List<Universite> unv) {
        return unv.
                stream().//akısa alındı
                        sorted(Comparator.comparing(Universite::getNotOrt).reversed()).//notOrt a göre b->k sıralandı
                        limit(3).//akısın ilk 3 elemanı alındı
                        collect(Collectors.toList());//akısın ilk 3 elemanı list'e assign edildi
        //toList());//akısın ilk 3 elemanı list'e assign edildi
    }

    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static List<Universite> task6(List<Universite> unv) {
        return unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrcSayisi)).
                limit(2).
                skip(1).
                collect(Collectors.toList());
    }

    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz
    public static Optional<Integer> task7(List<Universite> unv) {
        return unv.
                stream().
                filter(t -> t.getNotOrt() > 63).
                map(t -> t.getOgrcSayisi()).
                // reduce(Integer::sum);
                        reduce(Math::addExact);
        //reduce(0,(t,u)-> t+u);

    }

    public static int task71(List<Universite> unv) {
        return unv.
                stream().
                filter(t -> t.getNotOrt() > 63).
                mapToInt(t -> t.getOgrcSayisi()).
                // mapToInt() --> bu method akısdaki elemanların data type'nı
                // parameterisindeki() degere göre Int data type update eder
                // mapToInt() --> bu method akısdaki elemanların data type'nı
                // parameterisindeki() degere göre Int data type update eder
                sum();
    }

    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static OptionalDouble task8(List<Universite> unv) {
        return unv.
                stream().
                filter(t -> t.getOgrcSayisi() > 333).
                mapToDouble(Universite::getNotOrt).
                // mapToDouble() --> bu method akısdaki elemanların data type'nı
                // parameterisindeki degere göre dooble data type update eder
                average();// akıştaki elemanların ortalaması alındı

    }

    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    public static int task9(List<Universite> unv) {
        return (int) unv.
                stream().
                filter(t -> t.getBolum()=="matematik").
                 count(); //Saydırır

    }


    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz
    public static OptionalInt task10(List<Universite> unv) {
       return unv.
                stream().
                filter(t->t.getOgrcSayisi()>571).
                mapToInt(Universite::getNotOrt).
                max();// en büyüğe bulur. Bunu int formatı verir

    }

    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static OptionalInt task11(List<Universite> unv) {
       return unv.
                stream().filter(t->t.
                       getOgrcSayisi()<1071).
               mapToInt(Universite::getNotOrt).
               min();

    }

}

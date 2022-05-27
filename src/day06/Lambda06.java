package day06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda06 {

    public static void main(String[] args) throws IOException {
        //TASK 01 --> haluk.txt dosyasini okuyunuz.(Console'a print ediniz.)
        Path haluk = Path.of("src/day06/haluk.txt"); // path haluk obj atandı
        Stream<String> akis = Files.lines(haluk);// haluk.txt dataları akıs stream'e atandı

        System.out.println("\nTASK 01 --> haluk.txt dosyasini okuyunuz -->  ");
        Files.lines(Paths.get("src/day06/haluk.txt")).//path'deki dosyanın dataları akısa alındı
                forEach(System.out::println);//akısdaki datalar(her satırdaki string) print edildi.

        //********************************************************************************************************//

        //TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("\nTASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz -->  ");

        Files.lines(Paths.get("src/day06/haluk.txt")).map(String::toUpperCase).//akısdaki datalar buyuk harfe update edldi
                forEach(System.out::println);//akısadaki datalar(her satırdaki string)yazıldı)

        //********************************************************************************************************//

        //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
        System.out.println("\nTASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle okuyunuz 01 -->  ");
        Files.lines(haluk).map(String::toLowerCase).limit(1).forEach(System.out::println);

        //********************************************************************************************************//

        //TASK 04 --> haluk.txt dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("\nTASK 04 --> haluk.txt dosyasinda basari kelimesinin kac satirda gectiginiz yazdiriniz -->  ");
        System.out.println(Files.lines(haluk).
                filter(t -> t.contains("basari")).
                count());

        //********************************************************************************************************//

        //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println("\nTASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  yazdiriniz. -->  ");
        System.out.println(Files.lines(haluk).
                map(t -> t.split(" ")).// satırlardaki kelimeler arraye atandı
                flatMap(Arrays::stream). // 2D arraydaki elemanlar tek eleman olarak akısa alındı
                distinct().// akıştaki elemanlar tekrarsız yapıldı
                collect(Collectors.toList()));//akıstaki tekrarsız elemanlar liste atandı
                /*  Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
                    fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
                    Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

                    Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
                    Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
                    flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
                    ve ardından oluşturulan tüm akışları tek bir akışa birleştirir. */

        //********************************************************************************************************//

        //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..
        System.out.println("\nTASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");

        Files.lines(haluk).
                map(t -> t.split(" ")).// satırlardaki kelimeler arraye atandı
                        flatMap(Arrays::stream). // 2D arraydaki elemanlar tek eleman olarak akısa alındı
                        distinct().// akıştaki elemanlar tekrarsız yapıldı
                        sorted().// akıştaki elemanlar sıralandı
                forEach(System.out::println);//akıstaki tekrarsız elemanlar yazdırıldı

        //********************************************************************************************************//

        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println("\nTASK 07 --> haluk.txt dosyasinda basari kelimesinin kac kere gectigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(haluk).
                map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.equals("basari")).
                count());

        //********************************************************************************************************//

        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println("\nTASK 08 --> haluk.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");
        System.out.println(Files.lines(haluk).
                map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.contains("a")).
                count());

        //********************************************************************************************************//

        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println("\nTASK 09 --> haluk.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");
        Files.lines(haluk).
                map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.contains("a")).forEach(System.out::println);

        //********************************************************************************************************//

        //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
        System.out.println("\nTASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(haluk).
                map(t -> t.replaceAll("\\W", "").//satırlar \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar
                        replaceAll("\\d", "").
                        split("")).//harf akısı saglanır
                        flatMap(Arrays::stream).
                distinct().
                count());

        //********************************************************************************************************//

        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println("\nTASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(haluk).
                map(t -> t.replaceAll("[.!,:)\\-]", "").

                        split(" ")).//kelime akısı saglanır
                        flatMap(Arrays::stream).
                distinct().
                count());

        //********************************************************************************************************//

        //TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz
        System.out.println("\nTASK 12 --> haluk.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
       Files.lines(haluk).
                map(t -> t.replaceAll("[.!,:)\\-]", "").

                        split(" ")).//kelime akısı saglanır
                        flatMap(Arrays::stream).
                distinct().
                forEach(System.out::println);

    }
}



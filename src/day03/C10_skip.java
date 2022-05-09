package day03;

import java.util.Comparator;

public class C10_skip {
    public static void main(String[] args) {
        // Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
        C01_distinct.menu.
                stream().// akışa alındı
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).// son harfe göre sıralandı
                skip(1).//ilk eleman atlandı
                forEach(t-> System.out.print(t+" "));// print edildi.

        //skip(1) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
        // Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür. Bu, durum bilgisi olan bir ara işlemdir.
        //skip(list.size()-1) => List'in uzunluğunun 1 eksiğini yazarsak son elemanı yazdırırız.
    }
}

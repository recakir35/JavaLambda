package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_distinct {
   public static List<String> menu = new ArrayList<>(Arrays.asList("küşleme", "adana", "trileçe", "havuçDilim", "buryan", "yağlama", "kokareç", "arabAşı", "güveç"));

    public static void main(String[] args) {
        // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
        C01_distinct.menu.// akış kaynağı
                stream().// akışa girdi
                map(String::toUpperCase).// Büyük harfe çevirdi
                sorted().// doğal sıraladı
                distinct().// benzersiz,tekrarsız hale getirdi.
                forEach(t-> System.out.print(t+" "));// // yazdırdı
         /*  distinct() => Bu method tekrarlı elemanları sadece bir kere akışa sokar. Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        Sıralı akışlar için, farklı elemanın seçimi sabittir (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
         */
    }
}

package day01;

public class C02 {
    public static void main(String[] args) {
        // Task : structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
        for (Integer w : C01_stream_foreach.sayi) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
        //Task : functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
        System.out.println();
        C01_stream_foreach.sayi.
                stream().
                filter(t->t%2==0).//filter() --> ile icersindeki elemanlari istenen sarta göre filtreleme (secim) yapar
                forEach(C_Utilities::yazdir);

        System.out.println();
        C01_stream_foreach.sayi.
                stream().//list elemanlrı akısa alındı
                filter(C_Utilities::ciftBul).//cift bul method refere edilerek akısdaki elemalar filtrelendi(cift sayı)
                forEach(C_Utilities::yazdir);//fitre den gelen elemanlar yazdır() method refer edilerek print edildi
    }

}

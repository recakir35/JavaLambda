package day01;

public class C04_filter {
    public static void main(String[] args) {
        //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
        C01_stream_foreach.sayi.
                stream().
                filter(t->t>34 || t%2==0).//çift veya 34'den buyuk elemanları filtreler 44 63 65 38
                // filter(lambdaTutorial.Lambda01::ciftBul).//method ref.
                // filter(t -> t > 34).//lambda exp.
                forEach(C_Utilities::yazdir);
    }
}

package day01;

public class C03 {
    public static void main(String[] args) {
        //Task :functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
        C01_stream_foreach.sayi.
                stream().
               // filter(t -> t < 34 && t % 2 == 0).
                       filter(C_Utilities::ciftBul).//method ref.
                filter(t -> t < 34).//lambda exp.
                forEach(C_Utilities::yazdir);
    }
}

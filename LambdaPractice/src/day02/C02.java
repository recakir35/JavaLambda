package day02;

import day01.C_Utilities;

public class C02 {
    public static void main(String[] args) {
        // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
        C01_map.sayi.
                stream().//sayilar akısa  alındı
                filter(t->t%2==1).//tek elemnalr fitrelendi
                map(t->(t*t*t)+1).//tek elemanları küplerinin 1 fazlasına udate edildi
                forEach(C_Utilities::yazdir);//print edildi
    }
}

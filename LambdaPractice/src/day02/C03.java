package day02;

import day01.C_Utilities;

public class C03 {
    public static void main(String[] args) {
        // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
        C01_map.sayi.
                stream().
                filter(C_Utilities::ciftBul).
                map(Math::sqrt).//math ref--> double deger return eder
                //forEach(lambdaTutorial.Lambda01::yazdir)--> yazdir() method int.  çalıştığı için map den çıkan dataları çalıştırmaz
                forEach(t-> System.out.print(t+" "));
    }
}

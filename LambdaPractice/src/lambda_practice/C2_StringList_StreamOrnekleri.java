package lambda_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        System.out.println(ilkharfDC(list));
        System.out.println("2-******************************************");
        yildizliYazdir(list);
        System.out.println("3-******************************************");
        sirali(list);
        System.out.println("\n4-******************************************");
        lsizList(list);
        System.out.println("\n5-******************************************");
        System.out.println("eliList(list) = " + eliList(list));
        System.out.println("6-******************************************");
        ilkHarfTekrarli(list);
        System.out.println("\n7-******************************************");
        ilkHarfBuyuk(list);
        System.out.println("\n8-******************************************");
        System.out.println("size4ve5Haric(list) = " + size4ve5Haric(list));

    }
    // S1: ilk harfi d ve ya c olanlari listeleyelim
    public static List<String> ilkharfDC(List<String> list){
        return list.stream().filter(t -> t.startsWith("d") || t.startsWith("c")).collect(Collectors.toList());
    }


    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void yildizliYazdir(List<String> list){
        list.stream().forEach(t-> System.out.println("*"+t+"*"));
    }


    //S3: alfabedik  gore siralayalim list olarak
    public static void sirali(List<String> list){
        list.stream().sorted().forEach(t-> System.out.print(t+ " "));
    }


    //S4: tum 'l' leri silelim yazdiralim
    public static void lsizList(List<String> list){
        list.stream().map(t->t.replace("l", "")).forEach(t-> System.out.print(t+" "));
    }


    //S5 : icinde e olanlardan yeni bir list olusturunuz
    public static List<String> eliList(List<String> list){
        return list.stream().filter(t->t.contains("e")).collect(Collectors.toList());
    }


    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi

    public static void ilkHarfTekrarli(List<String> list){
        list.stream().map(t->t.substring(0,1)+t.substring(0,1)+t).forEach(t-> System.out.print(t+" "));
    }

    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    public static void ilkHarfBuyuk(List<String> list){
       list.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1)).forEach(t-> System.out.print(t+" "));
    }


    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
    public static List<String> size4ve5Haric(List<String> list){
       return list.stream().filter(t->t.length()!=4 || t.length()!=6).collect(Collectors.toList());
    }


}

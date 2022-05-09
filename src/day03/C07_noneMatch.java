package day03;

public class C07_noneMatch {
    public static void main(String[] args) {
        // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
        System.out.println(C01_distinct.menu.stream().noneMatch(t -> t.startsWith("w")) ? "w ile başlayan yemek menüde yok" : "w ile başlayan yemek menüde var");

        //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    }
}

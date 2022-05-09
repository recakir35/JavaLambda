package day03;

public class C08_anyMatch {
    public static void main(String[] args) {
        // Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.
        System.out.println(C01_distinct.menu.
                stream().
                anyMatch(t -> t.endsWith("x")) ? "x ile biten yemek menüde mevcut" : "x ile biten yemek menüde yok");
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    }
}

package day01;

public class C_Utilities {
    public static void main(String[] args) {

    }

    public static void yazdir(int a) {// verilen int degeri aynı satırda bosluk bırakarak yazdırma action yapan seed(tohum) method create edildi
        System.out.print(a + " ");
    }

    public static boolean ciftBul(int a) {//seed(tohum) method kendisine verile int degerin cift olmasını kontrol eder
        return a % 2 == 0;
    }
}

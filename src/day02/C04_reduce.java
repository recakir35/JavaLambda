package day02;

import java.util.Optional;

public class C04_reduce {
    public static void main(String[] args) {
        // Task : list'in en buyuk elemanini yazdiriniz
        Optional<Integer> enBuyukEleman = C01_map.sayi.
                stream().
                reduce(Integer::max);//akısa giren elemnalrın action sonrası tek eleman haline getirir

        /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */

        System.out.println(enBuyukEleman);
    }
}

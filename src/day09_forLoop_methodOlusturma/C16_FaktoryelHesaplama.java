package day09_forLoop_methodOlusturma;

public class C16_FaktoryelHesaplama {

    public static void main(String[] args) {

        // Verilen pozitif bir tamsayinin
        // faktoryel degerini yazdiran bir method olusturun
        // input:5   output :120   ( 5*4*3*2*1 )

        faktoryelDegeriyazdir(5); // 5! = 120
        faktoryelDegeriyazdir(10); // 10! = 3628800
    }

    public static void faktoryelDegeriyazdir( int sayi){

        int faktoryel = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i ;
        }

        System.out.println(sayi + "! = "+ faktoryel);

    }
}

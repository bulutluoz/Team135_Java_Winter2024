package day03_matematikselIslemler;

public class C05_PreIncrementPostIncrement {
    public static void main(String[] args) {

        // PreIncrement ve PostIncrement sadece ++, -- islemleri icin gecerlidir

        int sayi = 10;

        sayi++;

        System.out.println(sayi); // 11

        ++sayi;

        System.out.println(sayi); // 12

        sayi--;

        System.out.println(sayi); // 11

        --sayi;

        System.out.println(sayi); // 10

        // sayi++ ile ++sayi yaziminda kodun yazildigi satirdan sonra HIC BIR FARK YOKTUR
        // ANCAK bu kodun yazildigi satirda atama veya yazdirma da yapiliyorsa
        // sayi++ ve ++sayi farkli sonuclar verir

        System.out.println("===========");

        sayi = 10;

        System.out.println( sayi++ ); // 10

        System.out.println(sayi); // 11

        System.out.println("===========");

        sayi = 10;

        System.out.println(++sayi); // 11

        System.out.println(sayi); // 11

        System.out.println("===========");

        int a = 20;

        int b = a++ ;

        System.out.println("a : " + a + ", b : " + b); // a : 21, b : 20


        System.out.println("===========");

        a = 20 ;

        b = --a;

        System.out.println("a : " + a + ", b : " + b); // a : 19, b : 19

    }
}

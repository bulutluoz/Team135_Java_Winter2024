package day03_matematikselIslemler;

public class C04_IncrementDecrement {

    public static void main(String[] args) {

        int sayi = 20;

        // sayinin degerini 5 artirin

        sayi = sayi + 5;

        System.out.println(sayi); // 25

        sayi += 5;

        System.out.println(sayi); // 30

        sayi++;
        sayi++;
        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi); // 35

        double dbl = 3.5;

        // sayinin degerini 3 katina cikarin

        dbl = dbl * 3;

        System.out.println(dbl); // 10.5

        dbl *= 3;

        System.out.println(dbl); // 31.5


        sayi = 10;

        // sayinin degerini yazdirin, sonra sayinin degerini 1 artirin

        System.out.println("Sayinin degeri : " + sayi);

        sayi++;

        System.out.println(sayi); // 11


        sayi = 10;

        // sayinin degerini 1 artirin, sonra sayinin degerini yazdirin

        sayi++;

        System.out.println("Sayinin degeri : " + sayi); // 11


        sayi =10;

        // once sayinin degerini olusturacaginiz b variable'ina atayin
        // sonra sayinin degerini 1 artirin

        int b = sayi;
        sayi++;

        System.out.println("sayi : " + sayi + ", b : " + b); // sayi : 11, b : 10


        sayi = 10;

        // once sayinin degerini 1 artirin,
        // sonra sayinin degerini b'ye atayin

        sayi++;

        b = sayi ;

        System.out.println("sayi : " + sayi + ", b : " + b); // sayi : 11, b : 11

    }
}

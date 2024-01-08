package day01_variableOlusturma;

public class C03_PrimitiveDataTurleri {

    public static void main(String[] args) {

        // mantiksal degerler olan true ve false icin boolean
        boolean bl1 = true;

        boolean bl2 = false;

        // boolean bl3 = "true";

        // tek bir karakter depolayacaksa char
        char ch1 = 'a';
        char ch2 = '7';
        char ch3 = '.';


        // char ch4 = "a";
        // char ch5 = 'ab'; // Too many characters in character literal
        // char ch6 = 'd '; // bosluk da bir karakter oldugundan '' icinde 2 karakter oluyor
        char ch7 = ' ';

        // tamsayi depolayacaksak hafiza durumunu gozonunde bulundurarak
        // byte, short, int veya long

        // sayi 27 ise
        byte sayi1  = 27;
        short sayi2 = 27;
        int sayi3 = 27;
        long sayi4 = 27;

        // sayi 259 ise
        // byte sayi5 = 259;

        // sayi 57896 ise

        // byte sayi6 = 57896;
        // short sayi7 = 57896 ;
        int sayi8 = 57896;
        long sayi9 = 57896;

        // ondalikli sayilar icin float veya double

        float sayi10 = 234.9f ;
        float sayi11 = 3.5F;

        double sayi12 = 2.3;

        float s1 = 20;
        float s2 = 6;

        System.out.println(s1/s2); // 3.3333333

        double d1 = 20;
        double d2 = 6;

        System.out.println(d1/d2); // 3.3333333333333335

    }
}

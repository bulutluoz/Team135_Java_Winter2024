package day05_nestedIfElse_ternary;

public class C07_Ternary {

    public static void main(String[] args) {

        int sayi = 11;

        // Ternary operatoru tek basina kullanilamaz
        // YA direk yazdirilmali veya bir variable'a atanmalidir
        //  sayi>0 ? "Guzel sayi" : "Uygun degil" ;


        // Sayi sifirdan buyuk ise "Guzel sayi" , degilse "Uygun degil" yazdirin

        System.out.println(sayi>0 ? "Guzel sayi" : "Uygun degil"); // Guzel sayi


        // Sayi cift ise sayiyi iki katina cikarin, tek sayi ise degerini 5 azaltin

        sayi = sayi%2==0 ? sayi*2 : sayi-5 ;

        System.out.println("Sayinin son hali : " + sayi);
    }
}

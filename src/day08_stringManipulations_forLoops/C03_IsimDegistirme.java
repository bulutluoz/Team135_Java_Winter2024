package day08_stringManipulations_forLoops;

import java.util.Scanner;

public class C03_IsimDegistirme {

    public static void main(String[] args) {

        //Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //	        - ismi daha uzun ise,
        //	           isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //	        - soyisim daha uzun ise
        //	           ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        if (isim.length() > soyisim.length()){

            // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin

            String duzenlenmisHali = isim.toUpperCase().charAt(0) +
                                     isim.substring(1).toLowerCase()+
                                     " "+
                                     soyisim.toUpperCase().charAt(0)+
                                     soyisim.substring(1).toLowerCase();

            System.out.println(duzenlenmisHali);

        }

        if (isim.length() < soyisim.length()){
            // ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
            String duzenlenmisHali = isim.toUpperCase().charAt(0) +
                                     isim.substring(1).toLowerCase()+
                                     " "+
                                     soyisim.toUpperCase();

            System.out.println(duzenlenmisHali);
        }


    }
}

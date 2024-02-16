package day24_inheritance;

import java.util.ArrayList;
import java.util.List;

public class C03_Corsa extends C02_Opel{

    C03_Corsa(){

        System.out.println("Corsa constructor calisti");
    }

    String model = "Corsa";
    String motor = "vvt";
    String renk = "belirtilmedi";

    public static void main(String[] args) {

        /*
            Java'da olusturulan bir objeye ilk deger atamasinin
            yapilabilmesi icin CONSTRUCTOR calismalidir

            Nasil oldu da sadece C03_Corsa() calisarak, parent'i olan
            Opel ve araba class'indaki ozellikleri
            olusturulan corsa1 objesine ekledi ?

           Java child class'dan bir obje olusturuldugunda
           parent class'daki ozelliklere sahip olmasini saglamak icin
           parent class'larin constructor'lari
           otomatik olarak calistiracak ozel bir mekanizma olusturmustur

           Java olusturulan her class'a
           default constructor koydugu gibi,

           EXTENDS keyword kullanan class'lardaki
           her CONSTRUCTOR'in ilk satirina da
           parametresiz super() koyar


         */

        C03_Corsa corsa1 = new C03_Corsa();

        System.out.println(corsa1.model); // Corsa
        System.out.println(corsa1.motor); // vvt
        System.out.println(corsa1.renk); // belirtilmedi

        System.out.println(corsa1.marka); // Opel
        System.out.println(corsa1.kasa); // Belirtilmedi


    }
}

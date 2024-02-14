package day24_inheritance;

public class C03_Corsa extends C02_Opel{

    String model = "Corsa";
    String motor = "vvt";
    String renk = "belirtilmedi";

    public static void main(String[] args) {

        // Java'da olusturulan bir objeye ilk deger atamasinin yapilabilmesi icin CONSTRUCTOR calismalidir
        // Nasil oldu da sadece C03_Corsa() calisarak, parent'i olan
        // Opel ve araba class'indaki ozellikleri
        // olusturulan corsa1 objesine ekledi ?

        C03_Corsa corsa1 = new C03_Corsa();

        System.out.println(corsa1.model); // Corsa
        System.out.println(corsa1.motor); // vvt
        System.out.println(corsa1.renk); // belirtilmedi

        System.out.println(corsa1.marka); // Opel
        System.out.println(corsa1.kasa); // Belirtilmedi




    }
}

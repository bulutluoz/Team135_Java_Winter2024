package day11_whileLoop_doWhileLoop_scope;

public class Hastane {

    /*
        Java'da tum objeler icin ortak olan variable'lari static olarak,
        sadece bir objeye bagli olan variable'lari ise instance olarak OLUSTURURUz

        Bir obje olusturdugumuzda
        Java hemen instance tum variable'larin birer kopyasini olusturur
        ve objeye ilisiklendirir

        yani bu class'da 100 tane personel olsa
        personelYas variable'inin 100 tane kopyasi olur

        biz instance variable'lari direk kullanamayiz,
        obje ile ilintili oldugundan
        objeIsmi.instanceVariableIsmi seklinde kullaniriz
     */

    static String hastaneIsmi = "Yildiz hastanesi";
    static String hastaneAdresi = "Cankaya";
    static String bashekimIsmi = "Doktor Damra";

    String personelIsmi = "Isim atanmadi";
    String personelAdresi = "Adres belirtilmedi";
    int personelYas;

    public static void main(String[] args) {

        Hastane pers01 = new Hastane();

        System.out.println(pers01.personelYas); // 0
        System.out.println(pers01.personelIsmi); // Isim atanmadi
        System.out.println(pers01.personelAdresi); // Adres belirtilmedi

        pers01.personelIsmi = "Cigdem";
        pers01.personelYas = 30;
        pers01.personelAdresi = "Cankaya";


        Hastane pers02 = new Hastane();
        System.out.println(pers02.personelYas); // 0
        System.out.println(pers02.personelIsmi); // Isim atanmadi
        System.out.println(pers02.personelAdresi); // Adres belirtilmedi

        System.out.println(pers01.personelYas); // 30
        System.out.println(pers01.personelIsmi); // Cigdem
        System.out.println(pers01.personelAdresi); // Cankaya


        Hastane pers03 = new Hastane();
    }
}

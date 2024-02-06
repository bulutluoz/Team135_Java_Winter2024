package day18_constructors_staticKeyword;

public class C02_StaticKeyword {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String bashekimIsmi = "Doktor Damra";

    String persIsmi = "Atanmadi";
    String persAdres = "Girilmedi";
    int perYas;

    public static void main(String[] args) {

        C02_StaticKeyword pers1 = new C02_StaticKeyword();

        System.out.println(pers1.persIsmi); // Atanmadi
        System.out.println(pers1.persAdres); // Girilmedi
        System.out.println(pers1.perYas); // 0

        System.out.println(pers1.hastaneIsmi); // Yildiz Hastanesi
        // Static member 'hastaneIsmi' accessed via instance reference
        System.out.println(pers1.bashekimIsmi); // Doktor Damra
        // Static member 'bashekimIsmi' accessed via instance reference

        pers1.persIsmi = "Bilal";
        pers1.persAdres = "Cankaya";
        pers1.perYas = 34;

        pers1.hastaneIsmi = "Cankaya Hastanesi";

        System.out.println(pers1.persIsmi); // Bilal
        System.out.println(pers1.persAdres); // Cankaya
        System.out.println(pers1.perYas); // 34

        System.out.println(pers1.hastaneIsmi); // Cankaya Hastanesi


        C02_StaticKeyword pers2 = new C02_StaticKeyword();

        System.out.println(pers2.persIsmi); // Atanmadi
        System.out.println(pers2.persAdres); // Girilmedi
        System.out.println(pers2.perYas); // 0

        System.out.println(pers2.hastaneIsmi); // Cankaya Hastanesi
        System.out.println(pers2.bashekimIsmi); // Doktor Damra

        pers2.persIsmi = "Selcuk";
        pers2.persAdres = "Sincan";
        pers2.perYas = 29;

        pers2.hastaneIsmi = "Sincan Hastanesi";



        C02_StaticKeyword pers3 = new C02_StaticKeyword();

        System.out.println(pers3.persIsmi); // Atanmadi
        System.out.println(pers3.persAdres); // Girilmedi
        System.out.println(pers3.perYas); // 0

        System.out.println(pers3.hastaneIsmi); // Sincan Hastanesi

    }
}

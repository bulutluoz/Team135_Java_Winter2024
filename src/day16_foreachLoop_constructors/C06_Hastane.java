package day16_foreachLoop_constructors;

public class C06_Hastane {

    /*
        Java'nin class'lara otomatik olarak koydugu default constructor
        parametresizdir ve body'sinde kod yoktur

        default constructor'in aynisini
        gozle gorunur olarak biz olusturursak
        asagidaki gibi olur
        ama gorunur oldugundan buna
        default constructor DENILMEZ,

        Gozle gorunur bir constructor varsa, java default constructor'i siler

        Bir kod blogunun constructor olabilmesi icin
        2 sarti MUTLAKA saglamalidir
        1- ismi class ismi ile ayni olmalidir
        2- returnType olmamalidir (method'larda olur)
     */

    public C06_Hastane(){
        System.out.println("Bu parametresiz constructor'dir");
        System.out.println("Default constructor gorunmez");
    }


    static String hastaneIsmi = "Yildiz hastanesi";
    static String hastaneAdresi = "Cankaya";
    static String bashekimIsmi = "Doktor Damra";

    String personelIsmi = "Isim atanmadi";
    String personelAdresi = "Adres belirtilmedi";
    int personelYas;

    public static void Deneme(){
        // method isimleri naming convention'a uygun olmasi icin kucuk harfle baslamalidir
        // ancak buyuk harfle baslarsa da Java CTE vermez
    }

    public void C06_Hastane(){ // Method name 'C06_Hastane' is the same as its class name
        // bu bir method'dur constructor degil
        // cunku returnType'i var
    }

    //public DENEME(){ // Invalid method declaration; return type required
        // ismi buyuk harfle yazilan ama class ismi ile ayni olmayan kod blogu
        // constructor olamaz cunku ismi class ismi ile ayni degil
        // method da OLAMAZ cunku return type yok
        // Java CTE verir
    //}

}

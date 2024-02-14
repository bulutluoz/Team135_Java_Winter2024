package day23_encapsulation_inheritance;

public class C04_EncapsulationRunner {


    public static void main(String[] args) {

        C03_EncapsuleClass obj = new C03_EncapsuleClass();
        // hic bir getter ve setter olmadan
        // sadece adres bilgisine ulasabiliyoruz
        // adrese hem deger atayabilir, hem de yazdirabiliriz

        obj.adres = "Ankara";
        System.out.println(obj.adres); // Ankara

        // Write ve Read yetkisini sinirlamak istedigimiz
        // private isim ve okulIsmi variable'larina
        // ulasabilmek icin uygun getter ve setter'lari olusturmaliyiz
        // System.out.println(obj.isim); // 'isim' has private access
        obj.setIsim("Ali");
        // System.out.println(obj.isim); 'isim' has private access
        // System.out.println(obj.okulIsmi); // 'okulIsmi' has private access
        System.out.println(obj.getOkulIsmi()); // Yildiz Koleji


        // telefon bilgisi icin hem getter() hem de setter() var
        System.out.println(obj.getTelefon()); // null
        // obj.telefon = "5552342344"; 'telefon' has private access
        obj.setTelefon("5552342344");
        // System.out.println(obj.telefon); // 'telefon' has private access
        System.out.println(obj.getTelefon()); // 5552342344

        // EGER bir variable icin HEM Getter, HEM Setter olusturursak
        // public gibi hem atama yapabilir, hem de degerini yazdirabiliriz
        // Aralarindaki fark getter ve setter ile yapilan isi vurgulamak olur
        // BU bir TERCIH MESELESIDIR, bazi developer'lar bunu tercih eder
    }
}

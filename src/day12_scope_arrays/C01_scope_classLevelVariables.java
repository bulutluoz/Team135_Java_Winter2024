package day12_scope_arrays;

public class C01_scope_classLevelVariables {

    static String hastaneIsmi = "Yildiz hastanesi";
    static String hastaneAdresi = "Cankaya";
    static String bashekimIsmi = "Doktor Damra";

    String personelIsmi = "Isim atanmadi";
    String personelAdresi = "Adres belirtilmedi";
    int personelYas;

    public static void main(String[] args) {

        C01_scope_classLevelVariables per1 = new C01_scope_classLevelVariables();

        per1.personelAdresi = "Cankaya";
        per1.personelIsmi = "Murat";


        C01_scope_classLevelVariables per2 = new C01_scope_classLevelVariables();

        per2.personelYas = 34;
        per2.personelIsmi = "Damra";

        System.out.println(hastaneIsmi); // Yildiz hastanesi
        System.out.println(bashekimIsmi); // Doktor Damra

        // objeler uzerinden de static variable'lara ulasabilir miyiz?

        System.out.println("pers1'in hastanesi : "+ per1.hastaneIsmi);
        // Static member '.hastaneIsmi' accessed via instance reference
        // pers1'in hastanesi : Yildiz hastanesi

        System.out.println("pers2'in hastanesi : "+ per2.hastaneIsmi);
        // pers2'in hastanesi : Yildiz hastanesi

        // obje uzerinden static variable'larin degeri degisir mi ?

        per1.hastaneIsmi = "Cankaya Hastanesi";

        System.out.println(hastaneIsmi); // Cankaya Hastanesi
        System.out.println(per2.hastaneIsmi); // Cankaya Hastanesi


        per1.personelYas = 43;

        System.out.println("pers1 yas : " + per1.personelYas); // pers1 yas : 43
        System.out.println("pers2 yas : " + per2.personelYas); // pers2 yas : 34
    }
}















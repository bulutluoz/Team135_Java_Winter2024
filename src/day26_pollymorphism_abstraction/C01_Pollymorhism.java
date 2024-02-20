package day26_pollymorphism_abstraction;

import day25_inheritanceDataTypeKullanimi_overriding.C02_Kuslar;
import day25_inheritanceDataTypeKullanimi_overriding.C03_AvciKuslar;


public class C01_Pollymorhism {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.substring(3)); // a Jandir

        System.out.println(str.substring(3, 6)); // a C


        C03_AvciKuslar kartal1 = new C03_AvciKuslar();
        System.out.println(kartal1.beslenme); // et yerler

        C02_Kuslar kartal2 = new C03_AvciKuslar();
        System.out.println(kartal2.beslenme); // beslenirler
    }
}

package day12_scope_arrays;

public class C02_BaskaClassdanVariablelaraUlasma {

    public static void main(String[] args) {

        // C01 class'indaki variable'lara ulasmaya calisalim

        // static variable'lara classIsmi.variableIsmi seklinde ulasabiliriz

        System.out.println(C01_scope_classLevelVariables.hastaneIsmi); // Yildiz hastanesi
        System.out.println(C01_scope_classLevelVariables.bashekimIsmi); // Doktor Damra

        // instance variable'lara ise obje olusturarak ulasabiliriz
        // objeIsmi.instanceVariableIsmi seklinde kullanabiliriz

        C01_scope_classLevelVariables per3 = new C01_scope_classLevelVariables();
        System.out.println(per3.personelYas); // 0
        per3.personelIsmi = "Berk";



    }
}

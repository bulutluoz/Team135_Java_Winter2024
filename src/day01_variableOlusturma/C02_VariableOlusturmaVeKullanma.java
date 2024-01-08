package day01_variableOlusturma;

public class C02_VariableOlusturmaVeKullanma {

    public static void main(String[] args) {


        int sayi = 20;



        System.out.println("sayi"); // sayi

        System.out.println(sayi); // 20


        // int sayi = 30; // Variable 'sayi' is already defined in the scope

        sayi = 30 ;

        System.out.println(sayi); // 30

        sayi = 50;

        System.out.println(sayi); // 50


        sayi = sayi + 20;


        System.out.println(sayi); // 70


        sayi = (sayi -10) / 2 ;

        System.out.println(sayi); // 30


        // matematikte  2 * a = a + 3 olabilirdi
        // java'da sol tarafta SADECE variable ismi olur
        // baska hic bir sey olmaz

        // 2 * sayi = sayi + 10; // Variable expected

    }
}













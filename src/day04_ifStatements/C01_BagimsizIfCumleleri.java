package day04_ifStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // kullanicidan notunu isteyin
        // not 50 veya daha fazla ise "Gectin" yazdirin

        double not = 49.9;

        if (not >= 50) {
            System.out.println("Gectin");
        }

        int sayi = 10;

        // sayi cift ise sayiyi 2 katina cikarin

        if ( sayi % 2 == 0 ){

            sayi *= 2;
        }


        System.out.println("Sayinin yeni hali : " + sayi);


        // sayi 5 ile bolunebiliyorsa "5'in kati" yazdirin

        if ( sayi % 5 == 0){

            System.out.println("5'in kati");
        }
    }
}

package day02_scanner_dataCasting_wrapperClasses;

public class C08_DataCasting {
    public static void main(String[] args) {

        /*
            1- kucuk data turundeki DEGERI, buyuk data turundeki VARIABLE'a atamak istersek
               Java bunu otomatik olarak yapar, adina Auto Widening denir

            2- buyuk data turundeki DEGERI, kucuk data turundeki VARIABLE'a atamak istersek
               Java sorumlulugu almamizi ister,
               cevirmek istedigimiz degerin onune (cevirmek istedigimiz variable'in data turu) yazariz

               Buna EXplicit Narrowing (Zorla daraltma) denir

                - Eger atanan deger variable'in data turunun sinirlari icinde ise
                  deger ayni kalir

                - Eger atanan deger, variable'in data turunun sinirlari icinde degil ise
                  deger kaybi veya baskalasma olabilir


         */

        int sayi1 = 45 ;

        int sayi2 = sayi1 ; // ayni data turunde oldugu icin bu islem Casting degil normal atamadir


        double dbl = sayi1; // auto widening

        System.out.println("dbl : " + dbl); // dbl : 45.0


        short sayi3 = 66;

        sayi1 = sayi3; // auto widening

        System.out.println("Sayi1 : " + sayi1); // Sayi1 : 66


        int sayi4 = 22;

        byte byt1 = (byte)sayi4 ;

        System.out.println("byt1 : " + byt1); // byt1 : 22


        double dbl2 = 34.54;

        int sayi5 = (int) dbl2 ;
        System.out.println("sayi5 : " + sayi5); // sayi5 : 34

        sayi5 = 132;

        byte byt2 = (byte)sayi5;

        System.out.println("132'nin byte hali : " + byt2);
        // 132'nin byte hali : -124

        sayi5 = 256;

        byt2 = (byte)sayi5;
        System.out.println("256'nin byte hali : " + byt2);
        // 256'nin byte hali : 0


        sayi5 = 261;

        byt2 = (byte)sayi5;
        System.out.println("261'nin byte hali : " + byt2);
        // 261'nin byte hali : 5

        sayi5 = 522;

        byt2 = (byte)sayi5;
        System.out.println("522'nin byte hali : " + byt2);
        // 522'nin byte hali : 10

    }
}



















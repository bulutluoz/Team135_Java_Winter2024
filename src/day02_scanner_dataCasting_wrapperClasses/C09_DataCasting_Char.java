package day02_scanner_dataCasting_wrapperClasses;

public class C09_DataCasting_Char {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println(chr1 + chr2); // 97 + 98 ==> 195

        /*
            char data turu matematiksel islemlerle karsilastiginda
            ascii tablosundaki degerler ile isleme girer

            matematiksel islemlerde ascii degerleri aldigi icin
            sayisal data turleri ile casting de olabilir
         */

        System.out.println( 'c' < 'e'); // 99 < 101 ==> true


      int sayi1 = chr2;

      System.out.println("'b' nin int'a donmus hali : " + sayi1);
      // 'b' nin int'a donmus hali : 98

      // 123'un ascii tablosundaki degerini yazdirin

        System.out.println(   (char)123    );   // {

        System.out.println(   (char)75    );    // K
    }
}

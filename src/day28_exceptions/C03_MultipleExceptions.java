package day28_exceptions;

import java.util.Scanner;

public class C03_MultipleExceptions {

    public static void main(String[] args) {

        String str = "Java Candir";

        String[] harfler = {"a","b","c","f","g","h","j","k"};

        // Kullanicidan pozitif bir sayi isteyip
        // sayiyi index kabul edin
        // str ve array'deki o index'deki harfi yazdirin
        // ornek input : 2   output ==> v,c

        Scanner scanner = new Scanner(System.in);
        System.out.println("Index olarak pozitif bir tamsayi giriniz...");
        int index = scanner.nextInt();

        // birden fazla exception olusma ihtimali varsa
        // oncelikle olasi exception'larin birbiri ile ilintili olup olmadigina
        // (parent - child exceptions) bakmaliyiz
        // Eger bu sorudaki gibi olasi exception'lar birbiri ile ilintili degilse
        // 3 farkli cozum uretebiliriz


        // 1- iki tane bagimsiz try catch yapabiliriz

        /*
        try {

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsExceptions

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println( "Verilen index String'in sinirlari disinda");
        }


        try {

            System.out.println(harfler[index]); // ArrayIndexOutOfBoundsExceptions

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println( "Verilen index Array'in sinirlari disinda");
        }
         */

        // 2- bir try, birden fazla catch kullanabiliriz
        //    ancak burada ilk exception ile karsilastiginda calismayi durduracagi icin
        //    tum exception'lari raporlayamayabilir

        /*
        try {
            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsExceptions
            System.out.println(harfler[index]); // ArrayIndexOutOfBoundsExceptions
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println( "Verilen index String'in sinirlari disinda");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println( "Verilen index Array'in sinirlari disinda");
        }

         */

        // 3 - tek bir try ve daha kapsamli tek catch kullanabiliriz
        //     bu durumda tek bir catch ile sorunu cozebiliriz
        //     ancak hata raporunu detaylandiramayiz, genel bir hata verebiliriz

        try {
            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsExceptions
            System.out.println(harfler[index]); // ArrayIndexOutOfBoundsExceptions
        } catch (RuntimeException e) {
            System.out.println("Verilen index sinirlarin disinda");
        }


    }
}

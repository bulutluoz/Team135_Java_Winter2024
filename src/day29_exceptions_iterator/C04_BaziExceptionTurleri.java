package day29_exceptions_iterator;

public class C04_BaziExceptionTurleri {

    public static void main(String[] args) {

        // 1 - NullPointerException
        // Bir variable null olarak isretlenip,
        // sonra yazdirma disinda bir islem yapilirsa NPE olusur

        String str = null ;

        System.out.println(str); // null

        // System.out.println(str.substring(1)); // NullPointerException


        // 2- StringIndexOutOfBoundsException
        // 3- ArrayIndexOutOfBoundsException
        // 4- ArithmeticException


        // 5- NumberFormatException
        //    String'i Integer'a parse yapmaya calisirken,
        //    String sayi olmayan bir karakter iceriyorsa olusur

        String say1 = "24a";
        String say2 = "12";

        // say1 ve say2'i sayisal olarak toplayin

        System.out.println(say1+say2); // 2412

        //System.out.println(Integer.parseInt(say1) + Integer.parseInt(say2)); // 36


        // 6- ClassCastException

        Integer sayi = 10;

        Object obj = sayi; // Object HAS-A Integer

        String str1 = (String) obj; // String IS-A Object

        // 7- FileNotFoundException
        // 8- IOException  ==> Dosya Input-Output exception, Parent exception
        // 9- RunTimeException ==> Run time'da ortaya cikan tum exception'larin Parent'idir.
        // 10 - Exception ==> Tum exception'larin parent'idir


    }
}

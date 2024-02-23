package day28_exceptions;

import java.io.FileInputStream;

public class C02_Exceptions {

    public static void main(String[] args) {

        // Java compile time'da variable'larin degerlerini goremez
        // ama data turlerini bilir
        // yazdigimiz kodlari syntax ve data turleri acisindan kontrol edip
        // uygun olmayan bir durumla karsilasirsa CTE verir

        // ANCAK alti cizilen her durum Compile Time Error degildir
        // bazen Compile Time Exception da olabilir

        // String str = 5; // Required type: String   Provided:int

        // FileInputStream fileInputStream = new FileInputStream("asd");


        String str = "Java Candir";

        System.out.println(str.substring(7)); // ndir

        // System.out.println(str.substring(15));// StringIndexOutOfBoundsException

       str = null;

        System.out.println(str.length()); // NullPointerException
    }
}

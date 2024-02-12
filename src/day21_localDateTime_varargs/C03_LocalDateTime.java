package day21_localDateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2024-02-12T09:41:28.007815

        // bu bilgiden istedigimiz bolumleri, istedigimiz formatta yazdirabilir miyiz ?
        // once istedigimiz formati Java'ya gostermeliyiz

        DateTimeFormatter format1 = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(ldt.format(format1)); // 20240212

        /*
             GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini

             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h

                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati

                 a yazarsak AM veya PM degerini yazar
         */


        // 12/02/2024  ==> dd/MM/yyyy
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ldt.format(format2));  // 12/02/2024

        // 12 Feb 2024 ==> dd MMM YYYY
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd MMM YYYY");
        System.out.println(ldt.format(format3)); // 12 Feb 2024

        // 12/2/24 Monday ==> dd/M/yy EEEE
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("dd/M/yy EEEE");
        System.out.println(ldt.format(format4)); // 12/2/24 Monday

        // 12 February 2024 09:41 ==> dd MMMM yyyy HH:mm
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm");
        System.out.println(ldt.format(format5)); // 12 February 2024 10:16

        // 12/02/24 9:41 AM ==> dd/MM/YY h:mm a
        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("dd/MM/YY h:mm a");
        System.out.println(ldt.format(format6)); // 12/02/24 10:17 AM


    }
}

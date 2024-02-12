package day21_localDateTime_varargs;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime baslangic = LocalTime.now();
        LocalTime istenenSaat = LocalTime.of(21,13);
        LocalTime istenenUlkeSaati = LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(istenenUlkeSaati); // 11:06:22.409172

        // Bir islemin suresini bulmak istersek
        // baslangic ve bitis'de farkli localTime bilgilerini kaydetmek gerekir


        for (int i = 0; i <100000 ; i++) {
            for (int j = 0; j <100000 ; j++) {
                for (int k = 0; k <1 ; k++) {

                }
            }
        }

        LocalTime bitis = LocalTime.now();

        // Iki local time ararsindaki farki farkli methodlarla bulabiliriz

        // 1- until()
        System.out.println(baslangic.until(bitis, ChronoUnit.SECONDS)); // 9

        // 2- toSecondOfDay()
        System.out.println(bitis.toSecondOfDay() - baslangic.toSecondOfDay());// 10

        // 3-toNanoOfDay
        System.out.println(bitis.toNanoOfDay()- baslangic.toNanoOfDay()); //9579535000

    }
}

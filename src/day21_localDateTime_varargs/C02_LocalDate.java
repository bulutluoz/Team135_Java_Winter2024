package day21_localDateTime_varargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class C02_LocalDate {

    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        System.out.println(bugun); // 2024-02-12

        LocalDate dogumTarihi = LocalDate.of(1980,10,23);
        LocalDate istenenTarih = LocalDate.ofYearDay(1970,245);

        LocalDate istenenUlkeTarih = LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println(istenenUlkeTarih); // 2024-02-11


        System.out.println(bugun.getDayOfWeek()); // MONDAY
        System.out.println(bugun.getDayOfYear()); // 43
        System.out.println(bugun.getMonth()); // FEBRUARY
        System.out.println(bugun.getMonthValue()); // 2
        System.out.println(bugun.getEra()); // CE donem, milattan sonra
        System.out.println(bugun.getChronology()); // ISO

        System.out.println(bugun.plusYears(5).plusMonths(3).plusDays(2));
        // 2029-05-14

        System.out.println(bugun.minusYears(30).minusDays(25)); // 1994-01-18

        System.out.println(bugun.withMonth(10)); // 2024-10-12

        System.out.println(bugun.isLeapYear()); // true
        System.out.println(dogumTarihi.isLeapYear()); // true

        System.out.println(bugun.isAfter(dogumTarihi)); // true
        System.out.println(bugun.isBefore(dogumTarihi)); // false

        System.out.println(bugun.lengthOfYear()); // 366
        System.out.println(bugun.lengthOfMonth()); // 29

        // iki tarih arasindaki zamani bulma  1980-10-23

        System.out.println(dogumTarihi.until(bugun)); // P43Y3M20D
        System.out.println(dogumTarihi.until(bugun).getYears()); // 43

        // eger tarihler arasindaki zaman dilimini kaydetmek gerekirse
        Period period = Period.between(dogumTarihi,bugun);
        System.out.println(period); // P43Y3M20D
        System.out.println(period.getYears()); // 43


    }
}

package day20_ImmutableClasses_dateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class C03_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        /*
            LocalTime.now(); method'u calistigi anda
            calistigi bilgisayardaki saat bilgisini alip, bize getirir
            ve biz de onu sabit olarak bir variable'a atayabiliriz
         */

        System.out.println(saat); // 11:50:15.791450

        for (int i = 0; i <1000000 ; i++) {

            for (int j = 0; j <1000000 ; j++) {

            }
        }

        saat = LocalTime.now();
        System.out.println(saat); // 12:05:17.955460

        // get() lari bize saat'in bilesenlerinden istedigimizi getirir

        System.out.println(saat.getHour()); // 12

        // zamani 23 : 44 seklinde yazdirin

        System.out.println(saat.getHour() +":" + saat.getMinute()); // 12:6

        // plus() ve minus() lari kaydettigimiz zamana ekleme veya cikarma yapabilir

        System.out.println(saat.plusHours(4).plusMinutes(15));// 16:24:38.362929

        System.out.println(saat.minusMinutes(337)); // 06:33:40.947954

        // with() kaydettigimiz saatin bir bolumunu istedigimiz deger ile yazdirir

        System.out.println(saat.withMinute(15).withSecond(15).withNano(15));
        // 12:15:15.000000015

        System.out.println(saat.withNano(0)); // 12:13:51
        System.out.println(saat.withNano(0).withSecond(0)); // 12:14

        // eger saati olusturdugumuz an disinda bir saat olusturmak istersek

        LocalTime time1 = LocalTime.of(16,23,56);
        System.out.println(time1); // 16:23:56

        // time1  suandan sonra mi ?

        System.out.println(time1.isAfter(saat)); // true
        System.out.println(time1.isBefore(saat)); // false

        System.out.println( saat.toNanoOfDay()); // 44369049250000


        // Asagida verilen for loop'u Javanin ne kadar surede yaptigini bulun

        LocalTime baslangic = LocalTime.now();
        System.out.println("baslangic : " + baslangic);
        System.out.println("baslangic nano saniye degeri : "+ baslangic.toNanoOfDay());
        System.out.println("baslangic saniye degeri : "+ baslangic.toSecondOfDay());


        for (int i = 0; i <100000 ; i++) {

            for (int j = 0; j <1000000 ; j++) {
                for (int k = 0; k <1 ; k++) {

                }
            }
        }

        LocalTime bitis = LocalTime.now();
        System.out.println("bitis zamani : " + bitis);
        System.out.println("bitis nano saniye degeri : "+ bitis.toNanoOfDay());
        System.out.println("bitis saniye degeri : "+ bitis.toSecondOfDay());

        System.out.println("Toplam sure nanosaniye: " + (bitis.toNanoOfDay() - baslangic.toNanoOfDay()));
        System.out.println("Toplam sure saniye : " + (bitis.toSecondOfDay() - baslangic.toSecondOfDay()));
        // kaydedilen iki zaman arasindaki sure'yi bulmak icin
        System.out.println("Toplam sure until method'u ile : "+ baslangic.until(bitis, ChronoUnit.SECONDS));


        System.out.println(baslangic.equals(bitis)); // false

        // String manipulation methodlari ile zamani duzenlemek istersek String'e cevirebiliriz
        String baslangicStr = baslangic.toString();
        System.out.println("String olarak baslangic suresi : "+ baslangicStr);

    }
}

package day06_stringManipulations;

import java.util.Locale;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String str = "Java Candir";

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır

        System.out.println(str.length()); // 11 karakter sayisini verir

        // ilk harfi yazdirin
        System.out.println(str.charAt(0)); // J

        // 6.karakteri yazdirin
        System.out.println(str.charAt(5)); // C

        // son karakteri yazdirin
        System.out.println(str.charAt(10)); // R bu kod, sonuncu karakteri degil, 10.index'deki karakteri verir
                                            // ozellikle kullanicidan aldigimiz degerleri dusunursek
                                            // uzunlugunun kac olacagini bilemeyiz
                                            // bize her zaman son karakteri vermesi icin DINAMIK KOD yazmaliyiz


        str = "Ekrem Tarik AYDIN";

        System.out.println(str.charAt(10)); // son karakteri degil k verir

        System.out.println(str.charAt(17-1)); // N    dinamik degil

        System.out.println(str.charAt(str.length()-1)); // N dinamik


        str = "Java";

        System.out.println(str.charAt(str.length()-1)); // a

        str = "Elif Alptekin";

        System.out.println(str.charAt(str.length()-1)); // n

        // sondan 3.harfini yazdirin

        System.out.println(str.charAt(str.length()-3)); // k

        str = "Esra Uzunkavaklar";

        // sondan 3.harfini yazdirin

        System.out.println(str.charAt(str.length()-3)); // l

        // charAt() index olarak length veya daha buyuk bir deger girersek
        // Java calisinca size hata verir

        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException

        // System.out.println(str.charAt(30)); // StringIndexOutOfBoundsException
    }
}

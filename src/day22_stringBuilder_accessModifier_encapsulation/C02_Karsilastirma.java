package day22_stringBuilder_accessModifier_encapsulation;

public class C02_Karsilastirma {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        // String ile StringBuilder'i karsilastiralim

        // str == sb1; // Operator '==' cannot be applied to 'String', 'StringBuilder'
                      // Java'da farkli data turlerindeki non-primitive'leri == ile karsilastiramazsiniz

        System.out.println(sb1.equals(str)); // false  Suspicious call to 'equals()' on 'StringBuilder' object
                                             // Java CTE vermez ama sonuc hep FALSE olur

        // Sadece sb'yi toString() ile cevirip karsilastirabiliriz
        System.out.println(sb1.toString().equals(str)); // true


        // StringBuilder'lari karsilastirma

        // ==  StringBuilder icin Her zaman FALSE olur
        System.out.println(sb1 == sb2); // New object is compared using '=='

        // equals() iki farkli sb karsilastirildiginda her zaman FALSE verir
        System.out.println(sb1.equals(sb2)); // false Suspicious call to 'equals()' on 'StringBuilder' object
        System.out.println(sb1.equals(sb1)); // true
        System.out.println(sb2.equals(sb2)); // true

        // StringBuilder'lari karsilastirmak icin compareTo() kullanilir
        // Java her bir index'deki harfleri karsilastirir
        // eger tum indekslerdeki karakterler ayni ise sonuc 0 olur
        // eger farkli iseler, farkli harf olan ilk indeksdeki harfler arasindaki farki verir

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3 = new StringBuilder("Ali");
        StringBuilder sb4 = new StringBuilder("Ahmet");
        StringBuilder sb5 = new StringBuilder("Bilal");
        StringBuilder sb6 = new StringBuilder("Barbaros");

        System.out.println(sb3.compareTo(sb4)); // 4    1.index    l k j i h
        System.out.println(sb4.compareTo(sb5)); // -1   0.index    A B
        System.out.println(sb5.compareTo(sb6)); // 8    1.index    i h g f e d c b a




    }
}

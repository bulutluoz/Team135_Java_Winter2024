package day21_localDateTime_varargs;

public class C10_StringBuilderVeString {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ali");

        String str = "Ali";

        // StringBuilder sb2 = str;

        // str = sb;

        // System.out.println(sb == str);

        // Farkli data turundeki variable'lari birbirine atayamayiz,
        // ve == kullanarak birbiri ile karsilastiramayiz
        // (Sadece aralarinda parent-child iliskisi olanlarda atama yapilabilir)

        String str2 = sb.toString();

        // StringBuilder'da olmayip, String'de olan method'lari kullanmak istersek
        // oncelikle StringBuilder'i toString() ile String'e ceviririz


        // sb "a" iceriyor mu ?

        System.out.println(sb.toString().contains("a")); // false

        System.out.println(sb.toString().toLowerCase().contains("a")); // true

        // Hani StringBuilder'da method ile yapilan degisiklik kalici oluyordu ?
    }
}

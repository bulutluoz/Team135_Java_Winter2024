package day05_nestedIfElse_ternary;

public class C13_StringManipulations {

    public static void main(String[] args) {

        String str = "Java candir, Selenium heyecan";

        // verilen str'i tamami buyuk harf yapin

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR, SELENIUM HEYECAN

        // verilen str'i tamami kucuk harf olarak yazdirin

        System.out.println(str.toLowerCase()); // java candir, selenium heyecan

        // str'in ilk harfini yazdirin

        System.out.println(str.charAt(0));  // J

        // str'in 7.harfini kucuk harf olarak yazdirin

        System.out.println(str.toLowerCase().charAt(6)); // a


        // str'da kac karakter kullanildigini yazdirin

        System.out.println(str.length()); // 29

        // son harfi yazdirin

        System.out.println(str.charAt(29-1)); // N
    }
}

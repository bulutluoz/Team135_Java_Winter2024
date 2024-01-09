package day02_scanner_dataCasting_wrapperClasses;

public class C12_WrapperClasses {

    public static void main(String[] args) {

        int sayi = 10;

        String str = "Java";

        // Java primitive data turleri icin de bazi hazir method'lar kullanabilmemiz icin
        // Wrapper Class'lari olusturmustur
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double

        Integer sayi2 = 20;

        // wrapper class'lar ayni isimdeki primitive'ler ile
        // gecis ozelligine sahiptirler

        Integer sayi3 = sayi;


        String sayi5 = "23";
        String sayi6 = "45";

        // sayi5 ve sayi6'yi matematiksel olarak toplayin

        System.out.println(sayi5+sayi6); // 2345

        int sayi5Int = Integer.parseInt(sayi5);
        int sayi6Int = Integer.parseInt(sayi6);

        System.out.println(sayi5Int + sayi6Int); // 23=45 ==> 68


        System.out.println(Integer.MAX_VALUE); // 2147483647

        System.out.println(Short.MIN_VALUE); // -32768

        char chr = 'a';

        // buyuk harfe cevirin

        System.out.println(Character.toUpperCase(chr)); // A

        System.out.println(Character.isUpperCase(chr)); // false
        System.out.println(Character.isDigit(chr)); // false
        System.out.println(Character.isLetter(chr)); // true
        System.out.println(Character.isLowerCase(chr)); // true


    }
}

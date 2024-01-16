package day06_stringManipulations;

public class C05_Substring {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        System.out.println(str.substring(2, 7)); // va Gu

        // ilk 3 karakteri yazdirin
        System.out.println(str.substring(0,3)); // Jav

        // sadece 3. karakteri(2.index) substring ile yazdirin

        System.out.println(str.substring(2,3)  ); // v String oldugu icin yeni method'lar kullanilabilir
        System.out.println(str.charAt(2)       ); // v char oldugu icin method kullanamaz

        System.out.println(str.substring(3,3)); // "" bos bir satir yazdirdi
        System.out.println("sonraki satir");

        // System.out.println(str.substring(8,4)); // StringIndexOutOfBoundsException: begin 8, end 4, length 13


        String str1 = "Ja";
        String str2 = "va";

        System.out.println(str1+str2); // Java

        System.out.println(str1.concat(str2)); // Java

    }
}

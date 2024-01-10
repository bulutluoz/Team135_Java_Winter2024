package day03_matematikselIslemler;

public class C06_Conatenation {

    public static void main(String[] args) {

        String str = "Java";
        String s = "Candir";
        int sayi = 5;
        boolean bl  = true;
        char chr = 'k';

        System.out.println(str+s); // JavaCandir
        System.out.println(str+sayi); // Java5
        System.out.println(str+sayi+chr); // "Java5" + 'k' ==> "Java5k"

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int a = 4;
        int b = 6;

        // sadece verilen variable'lari kullanarak istenen metinleri yazdirin

        // Java Candir 46

        System.out.println(s1+s3+s2+s3+a+b);

        // Java 10

        System.out.println(s1+s3+(a+b));

        // 10 Java

        System.out.println(a+b+s3+s1);

        // 46 Java

        System.out.println(s4+a+b+s3+s1); // s4 a'yi String'lestirdi,
                                          // boylece a ve b toplama yerine concatenation oldu
    }
}

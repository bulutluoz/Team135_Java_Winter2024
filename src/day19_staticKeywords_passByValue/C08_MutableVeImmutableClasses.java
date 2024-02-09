package day19_staticKeywords_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_MutableVeImmutableClasses {

    public static void main(String[] args) {

        /*
            Java bazi class'lardan olusturulan objeleri
            IMMUTABLE (degistirilemez) yapmistir
            bizim kullandigimiz data turlerinden
            String ve Wrapper Class'lar IMMUTABLE'dir
            Bu class'larda yeni obje olusturabilirsiniz ama
            varolan objenin degerini DEGISTIREMEZSINIZ


            Bazi class'lar ise MUTABLE(degistirilebilir)
            bizim kullandigimiz data turlerinden
            Array ve List'ler MUTABLE'dir
         */

        String str = "Java Candir";

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str.toUpperCase()); // JAVA JANDIR

        System.out.println(str.substring(5)); // Candir

        System.out.println(str.replace("a", "b")); // Jbvb Cbndir

        System.out.println(str); // Java Candir


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,5,6,7,8,2));

        System.out.println(sayilar); // [3, 5, 6, 7, 8, 2]

        sayilar.remove(1);

        Integer silinecekSayi = 8;

        sayilar.remove(silinecekSayi);

        sayilar.set(3,15);

        sayilar.add(20);

        System.out.println(sayilar); // [3, 6, 7, 15, 20]


        StringBuilder sb = new StringBuilder("Java Candir");
        sb.append("aaaaa");
        System.out.println(sb); // Java Candiraaaaa



        StringBuffer sf = new StringBuffer("Java Candir");



    }
}




















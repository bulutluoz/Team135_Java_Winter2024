package day33_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_FarkliDataTurleriIleElemanEkleme {

    public static void main(String[] args) {

        List<Object> liste = new ArrayList<>();

        liste.add("Ali");
        liste.add(24);
        liste.add(true);
        liste.add('a');

        int[] arr = {4,5,6,7};

        liste.add(arr);

        // Listeyi yazdiralim
        System.out.println(liste); // [Ali, 24, true, a, [I@e580929]
        // Listedeki array'i tek basina yazdirabilirz
        System.out.println(Arrays.toString(   (int[]) liste.get(4)     )); // [4, 5, 6, 7]

        // listedeki arr'in uzunlugunu yazdirin
        System.out.println(((int[]) liste.get(4)).length); // 4

        // Listedeki Ali'yi buyuk harf olarak yazdirin

        System.out.println(((String) liste.get(0)).toUpperCase()); // ALI

        // Listedeki 24'un karesini yazdirin

        System.out.println(  ( (Integer) liste.get(1) * (Integer)liste.get(1)    )); // 576

    }
}

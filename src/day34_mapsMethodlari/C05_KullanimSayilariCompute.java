package day34_mapsMethodlari;

import java.util.*;

public class C05_KullanimSayilariCompute {

    public static void main(String[] args) {

        // Verilen harfler listesinde
        // herbir harfi ve kacar defa kullanildigini bir map olarak yazdirin

        List<String> harfler = new ArrayList<>(Arrays.asList("a","b","b","z","k","z","k","b","k"));

        // a=1, b=3, z=2, k=3

        Map<String,Integer> kullanimSayilariMap = new TreeMap<>();

        for (String eachHarf : harfler
             ) {

            kullanimSayilariMap.computeIfPresent(eachHarf, (k,v) -> v+1);
            kullanimSayilariMap.putIfAbsent(eachHarf,1);
        }

        System.out.println(kullanimSayilariMap); // {a=1, b=3, k=3, z=2}
    }
}

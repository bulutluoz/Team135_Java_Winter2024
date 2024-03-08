package day34_mapsMethodlari;

import java.util.*;

public class C03_KullanimSayilari {

    public static void main(String[] args) {

        // Verilen harfler listesinde
        // herbir harfi ve kacar defa kullanildigini bir map olarak yazdirin

        List<String> harfler = new ArrayList<>(Arrays.asList("a","b","b","z","k","z","k","b","k"));

        // a=1, b=3, z=2, k=3

        // for each loop ile harfleri gozden gecirelim
        // map'de yoksa value=1 olarak ekleyelim
        // varsa eski degeri alip, bir fazlasini value olarak ekleyelim

        Map<String,Integer> kullanimSayilariMap = new TreeMap<>();

        for (String eachHarf : harfler
             ) {

            // varsa
            if (kullanimSayilariMap.containsKey(eachHarf)){
                int eskiDeger = kullanimSayilariMap.get(eachHarf);
                kullanimSayilariMap.put(eachHarf,eskiDeger+1);
            }

            // yoksa
            kullanimSayilariMap.putIfAbsent(eachHarf,1);

        }

        System.out.println(kullanimSayilariMap); // {a=1, b=3, k=3, z=2}
    }
}

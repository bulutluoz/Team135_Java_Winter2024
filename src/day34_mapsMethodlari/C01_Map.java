package day34_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_Map {

    public static void main(String[] args) {
        //Soru : Verilen bir array’de kullanilan sayilari
        //       ve kacar defa kullanildigini yazdirin.
        //  Input : {1,2,4,4,5,3,4,1,5,1,4,2,4,1}
        //  output :
        //  1 kullanimi : 4 adet
        //	2 kullanimi : 2 adet
        //	3 kullanimi : 1 adet
        //	4 kullanimi : 5 adet
        //	5 kullanimi : 2 adet

        // { 1=4,2=2,3=1,4=5,5=2}

        Map<Integer,Integer> kullanimSayilariMap = new TreeMap<>();

        System.out.println(kullanimSayilariMap); // {}

        int[] sayilar = {1,2,4,4,5,3,4,1,5,1,4,2,4,1};

        for (int each : sayilar
             ) {

            // eger sayi map'de yoksa value'su 1 olarak map'e ekle
            if (!kullanimSayilariMap.containsKey(each)){

                kullanimSayilariMap.put(each,1);
            }else{
            // map'de varsa eski value'yu alip, 1 fazlasi ile yeniden map'e ekleyelim

                int eskiDeger = kullanimSayilariMap.get(each);
                kullanimSayilariMap.put(each,eskiDeger+1);
            }
        }

        System.out.println(kullanimSayilariMap);

    }
}

package day33_maps;

import day31_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C03_EntryIleListeYazdir {

    public static void main(String[] args) {

        // Ogrenci map'inde 10 sinifdaki ogrencilerin
        // no, sinif, sube, isim ve soyisimlerini liste olarak yazdirin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        // 1- tum ogrencilere ulasabilmek icin entry set olustur

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        // 2- herbir entry'i ele almak icin for-each loop olustur

        System.out.println("No  Sinif  Sube  Isim  Soyisim");

        for ( Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {

            // 3- value'daki bilgilere ulasabilmek icin array'e split edelim

            String[] valueArr = eachEntry.getValue().split("-");// [Ali, Can, 11, H, MF]

            // 4- Listede istenenleri yazdirabiliriz

            if (valueArr[2].equals("11")){
                System.out.println(
                        eachEntry.getKey()+"   "+
                                valueArr[2]+"   "+
                                valueArr[3]+"     "+
                                valueArr[0]+"  "+
                                valueArr[1]
                );
            }
        }

    }
}

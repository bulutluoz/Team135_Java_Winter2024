package day32_maps;

import day31_maps.MapDepo;

import java.util.HashMap;
import java.util.Map;

public class C01_TekOgrenciBilgisineUlasma {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        System.out.println(ogrenciMap);
        /*
            {
            101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-K-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Cem-11-M-TM,
            106=Sevgi-Can-10-K-MF,
            107=Esra-Han-11-M-SOZ
            }
         */

        ogrenciMap.put(108,"Veli-San-11-H-TM");

        // manuel olarak 102 nolu ogrencinin soyadini Han yapalim

        ogrenciMap.put(102,"Veli-Han-10-K-TM");

        System.out.println(ogrenciMap);
        /*
            {
            101=Ali-Can-11-H-MF,
            102=Veli-Han-10-K-TM,
            103=Ali-Cem-11-K-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Cem-11-M-TM,
            106=Sevgi-Can-10-K-MF,
            107=Esra-Han-11-M-SOZ,
            108=Veli-San-11-H-TM
            }
         */

        // 103 numarali ogrencinin soyismini yazdirin
        // value icindeki bir bilgiye ulasmak icin
        // 1- value'yu elde ederiz
        // 2- value'yu bir array'e ceviririz
        // 3- array'den istedigimiz bilgiye ulasabiliriz

        System.out.println(MapDepo.getData(ogrenciMap, 103, "soyisim")); // Cem

        // 105 numarali ogrencinin isim ve soyismini yazdirin

        System.out.println(
                "105 numarali ogrencinin isim ve soyismi : "+
                MapDepo.getData(ogrenciMap,105,"isim")+
                " "+
                MapDepo.getData(ogrenciMap,105,"soyisim")
        );

    }
}

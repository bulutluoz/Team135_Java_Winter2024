package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C02_SinifSubeListesiOlusturma {

    public static void main(String[] args) {

        // Verilen sinif ve sube'deki tum ogrencilerin
        // numara, isim ve soyisimlerini yazdirin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();
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

        // 11.sinif M subesinin listesini yazdirin

        MapDepo.sinifSubeListesiYazdir(ogrenciMap,11,"M");

        MapDepo.sinifSubeListesiYazdir(ogrenciMap,10,"K");
    }
}

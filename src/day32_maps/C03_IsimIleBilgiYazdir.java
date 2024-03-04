package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C03_IsimIleBilgiYazdir {

    public static void main(String[] args) {

        // Verilen isim ve soyisim'deki
        // tum ogrencilerin no, sinif, sube ve bolum bilgilerini yazdirin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();
        /*
        {
           101=Ali-Can-11-H-MF,
           102=Veli-Cem-10-K-TM,
           103=Ali-Can-11-K-TM,
           104=Ayse-Can-10-H-MF,
           105=Sevgi-Cem-11-M-TM,
           106=Sevgi-Cem-10-K-MF,
           107=Esra-Han-11-M-SOZ
           }
         */

        ogrenciMap.put(103,"Ali-Can-11-K-TM");
        ogrenciMap.put(106,"Sevgi-Cem-10-K-MF");

        MapDepo.isimSoyisimIleOgrenciBilgiYazdir(ogrenciMap,"sevgi","cem");

        /*
                No Sinif  Sube Bolum
                105  11    M    TM
                106  10    K    MF
         */

        MapDepo.isimSoyisimIleOgrenciBilgiYazdir(ogrenciMap,"ALI","CAN");



    }
}

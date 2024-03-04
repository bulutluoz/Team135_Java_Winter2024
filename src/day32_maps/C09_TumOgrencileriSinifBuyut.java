package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C09_TumOgrencileriSinifBuyut {

    public static void main(String[] args) {

        // Tum ogrencileri gozden gecirip
        // bir ust sinifa cikartin
        // 12.sinifta olanlara sinif bilgisi olarak "Mezun" yazin
        // Sinif olarak mezun yazan varsa bir sey yapmayin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        ogrenciMap = MapDepo.yilSonuSinifArtirma(ogrenciMap);

        System.out.println(ogrenciMap);

        /*
            {
            101=Ali-Can-12-H-MF,
            102=Veli-Cem-11-K-TM,
            103=Ali-Cem-12-K-TM,
            104=Ayse-Can-11-H-MF,
            105=Sevgi-Cem-12-M-TM,
            106=Sevgi-Can-11-K-MF,
            107=Esra-Han-12-M-SOZ}
         */

        ogrenciMap = MapDepo.yilSonuSinifArtirma(ogrenciMap);

        System.out.println(ogrenciMap);
        /*
        {
            101=Ali-Can-Mezun-H-MF,
            102=Veli-Cem-12-K-TM,
            103=Ali-Cem-Mezun-K-TM,
            104=Ayse-Can-12-H-MF,
            105=Sevgi-Cem-Mezun-M-TM,
            106=Sevgi-Can-12-K-MF,
            107=Esra-Han-Mezun-M-SOZ}
         */

        ogrenciMap = MapDepo.yilSonuSinifArtirma(ogrenciMap);

        System.out.println(ogrenciMap);

        /*
            {
            101=Ali-Can-Mezun-H-MF,
            102=Veli-Cem-Mezun-K-TM,
            103=Ali-Cem-Mezun-K-TM,
            104=Ayse-Can-Mezun-H-MF,
            105=Sevgi-Cem-Mezun-M-TM,
            106=Sevgi-Can-Mezun-K-MF,
            107=Esra-Han-Mezun-M-SOZ
            }
         */

    }
}

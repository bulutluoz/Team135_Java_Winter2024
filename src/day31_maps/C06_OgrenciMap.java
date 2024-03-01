package day31_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_OgrenciMap {

    public static void main(String[] args) {

        // ogrenci map'inde 105 numarali ogrencinin bolumunu yazdirin

        Map<Integer, String> ogrenciMap = MapDepo.mapOlustur();

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}

        // 108 numarali bir ogrenci ekleyelim

        ogrenciMap.put(108,"Murat-Akar-12-D-MF");

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ, 108=Murat-Akar-12-D-MF}


        System.out.println(MapDepo.getBolum(ogrenciMap, 105)); // TM




    }
}

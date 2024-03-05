package day33_maps;

import day31_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntryIleSoyadiUpdate {

    public static void main(String[] args) {

        // ogrenci map'indeki soyisimleri
        // tumu buyuk harf olacak sekilde duzenleyin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        // 1. entry'leri bir set olarak kaydedelim

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        // 2. tum entry'lere ulasmak icin bir for-each loop olusturalim

        for (Map.Entry<Integer,String>  eachEntry: ogrenciEntrySeti
             ) {

            // 3- value'yu direk bir array olarak kaydedelim
            String[] eachValueArr = eachEntry.getValue().split("-"); // [Ali, Can, 11, H, MF]

            // 4- istedigimiz update'i yapalim
            eachValueArr[1] = eachValueArr[1].toUpperCase();

            // 5- Array'i value olacak sekilde String'e donusturelim ve entry'i update edelim

            eachEntry.setValue( String.join("-",eachValueArr)   );

        }

        System.out.println(ogrenciMap);
        /*
                {
                101=Ali-CAN-11-H-MF,
                102=Veli-CEM-10-K-TM,
                103=Ali-CEM-11-K-TM,
                104=Ayse-CAN-10-H-MF,
                105=Sevgi-CEM-11-M-TM,
                106=Sevgi-CAN-10-K-MF,
                107=Esra-HAN-11-M-SOZ
                }
         */
    }
}

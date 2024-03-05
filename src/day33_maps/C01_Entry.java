package day33_maps;

import day31_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_Entry {

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


        System.out.println(ogrenciMap.size()); // 7

        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106, 107]

        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        /*
            Bu map'de 7 eleman var
            ama biz elemanlara bir butun olarak ulasamiyoruz
            cunku her bir eleman key ve value'den olusuyor
            biz key'lere ve value'lara ayri ayri ulasabiliyoruz

            Java bir map'deki elemanlara key-value birlikte ulasabilmemiz icin
            Entry data turunu olusturmustur
         */

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti
             ) {
            eachEntry.setValue(eachEntry.getValue() + "-Y"   );
        }

        System.out.println(ogrenciMap);

        /*
            {
            101=Ali-Can-11-H-MF-Y,
            102=Veli-Cem-10-K-TM-Y,
            103=Ali-Cem-11-K-TM-Y,
            104=Ayse-Can-10-H-MF-Y,
            105=Sevgi-Cem-11-M-TM-Y,
            106=Sevgi-Can-10-K-MF-Y,
            107=Esra-Han-11-M-SOZ-Y
            }
         */
    }
}

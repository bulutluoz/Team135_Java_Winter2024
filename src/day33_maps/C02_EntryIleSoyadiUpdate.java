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


    }
}

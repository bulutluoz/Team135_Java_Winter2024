package day31_maps;

import java.util.HashMap;
import java.util.Map;

public class MapDepo {

    // Bu class Ogrenci map'i ile kullanabilecegimiz
    // method'lari depolamak icin olusturuldu

    // Map olusturup, donduren method olusturalim

    public static Map<Integer,String>  mapOlustur(){

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        return ogrenciMap;
    }

    public static void NoIleBolumYazdir(Map<Integer,String> ogrenciMap, Integer istenenNo){

        String istenenNoValue = ogrenciMap.get(istenenNo); // Sevgi-Cem-11-M-TM

        String[] istenenValueArr = istenenNoValue.split("-"); // [Sevgi, Cem, 11, M, TM]

        System.out.println(istenenValueArr[4]); // TM
    }
}

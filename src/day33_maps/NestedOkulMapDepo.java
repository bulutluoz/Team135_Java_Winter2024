package day33_maps;

import java.util.HashMap;
import java.util.Map;

public class NestedOkulMapDepo {

    /*
        ogrenciMap.put(101,{isim=Ali, soyisim=Can, sinif=11, sube=H, bolum=MF});


        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
         */

    public static Map<Integer,Map<String,String>> nesOgrMapOlustur(){

        Map<Integer,Map<String,String>> nesOgrMap = new HashMap<>();
        nesOgrMap.put(101,ogrenciValueMapOlustur("Ali","Can","11","H","MF"));
        nesOgrMap.put(102,ogrenciValueMapOlustur("Ali","Cem","11","K","TM"));
        nesOgrMap.put(103,ogrenciValueMapOlustur("Ayse","Can","10","H","MF"));

        return nesOgrMap;
    }


    public static Map<String,String> ogrenciValueMapOlustur(String isim, String soyisim,
                                                            String sinif,String sube,String bolum){

        Map<String,String> ogrenciValueMap = new HashMap<>();
        ogrenciValueMap.put("isim",isim);
        ogrenciValueMap.put("soyisim",soyisim);
        ogrenciValueMap.put("sinif",sinif);
        ogrenciValueMap.put("sube",sube);
        ogrenciValueMap.put("bolum",bolum);

        return ogrenciValueMap;
    }

    public static Map<Integer, Map<String, String>> ogrenciEkle(Map<Integer, Map<String, String>> nesOgrMap, int okulNo, String isim, String soyisim, String sinif, String sube, String bolum) {

        Map<String,String> ogrenciValueMap = new HashMap<>();
        ogrenciValueMap.put("isim",isim);
        ogrenciValueMap.put("soyisim",soyisim);
        ogrenciValueMap.put("sinif",sinif);
        ogrenciValueMap.put("sube",sube);
        ogrenciValueMap.put("bolum",bolum);

        nesOgrMap.put(okulNo,ogrenciValueMap);

        return nesOgrMap;
    }
}

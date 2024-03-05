package day33_maps;

import java.util.Map;
import java.util.Set;

public class C09_OgrenciListesiYazdirma {

    public static void main(String[] args) {
        // okuldaki tum ogrencilerin no, sinif, sube, isim, soyisim yazdirin

        Map<Integer, Map<String,String>> nesOgrMap = NestedOkulMapDepo.nesOgrMapOlustur();

        nesOgrMap = NestedOkulMapDepo.ogrenciEkle(nesOgrMap,104,"Ali","Han","11","M","TM");

        // Tum ogrencileri gozden gecirmek icin Key'leri kaydedelim
        Set<Integer> ogrenciKeySeti = nesOgrMap.keySet();

        System.out.println("No   Sinif  Sube Isim Soyisim");

        // Her bir ogrenciye ulasmak icin bir for-each loop olusturalim

        for (Integer eachKey : ogrenciKeySeti
             ) {

            System.out.println(
                    eachKey+ "   "+
                    nesOgrMap.get(eachKey).get("sinif")+ "     "+
                    nesOgrMap.get(eachKey).get("sube")+"    "+
                    nesOgrMap.get(eachKey).get("isim")+" "+
                    nesOgrMap.get(eachKey).get("soyisim")
            );

        }
        System.out.println("     11.sinif ogrencileri    ");
        System.out.println("No   Sinif  Sube Isim Soyisim");
        // 10.sinifdaki ogrencilerin no, sinif, sube, isim, soyisim yazdirin

        for (Integer eachKey : ogrenciKeySeti
             ) {

            if (nesOgrMap.get(eachKey).get("sinif").equalsIgnoreCase("11")){
                System.out.println(
                        eachKey+ "   "+
                                nesOgrMap.get(eachKey).get("sinif")+ "     "+
                                nesOgrMap.get(eachKey).get("sube")+"    "+
                                nesOgrMap.get(eachKey).get("isim")+" "+
                                nesOgrMap.get(eachKey).get("soyisim")
                );
            }

        }


    }
}

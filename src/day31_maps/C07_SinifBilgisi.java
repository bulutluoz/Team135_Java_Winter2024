package day31_maps;

import java.util.Map;

public class C07_SinifBilgisi {

    public static void main(String[] args) {

        // Ogrenci map'indeki 103 numarali ogrencinin
        // sinif bilgisini yazdirin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        System.out.println(MapDepo.getSinif(ogrenciMap, 103)); // 11


        System.out.println(MapDepo.getData(ogrenciMap, 107, "Sube"));  // M

        System.out.println(MapDepo.getData(ogrenciMap, 104, "isim")); // Ayse


    }
}

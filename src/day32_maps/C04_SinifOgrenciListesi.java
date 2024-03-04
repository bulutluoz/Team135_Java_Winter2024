package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C04_SinifOgrenciListesi {

    public static void main(String[] args) {

        // verilen siniftaki tum ogrencilerin
        // numara isim soyisim ve subelerini yazdirin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        // 11.siniftaki ogrenci listesini yazdiralim

        MapDepo.sinifListesiYazdir(ogrenciMap,11);

        /*
            No Sube Isim Soyisim
            101  H  Ali Can
            103  K  Ali Cem
            105  M  Sevgi Cem
            107  M  Esra Han
         */

        MapDepo.sinifListesiYazdir(ogrenciMap,10);

        /*
            No Sube Isim Soyisim
            102  K  Veli Cem
            104  H  Ayse Can
            106  K  Sevgi Can
         */

    }
}

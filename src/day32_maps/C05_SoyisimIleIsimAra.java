package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C05_SoyisimIleIsimAra {

    public static void main(String[] args) {
        // verilen soyisimdeki tum ogrencilerin
        // no isim sinif ve sube'lerini yazdirin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();


        // soyadi can olanlari listeleyin

        MapDepo.soyisimIleOgrenciListele(ogrenciMap,"can");

        /*
            No Sube Isim Soyisim
            101  H  Ali Can
            104  H  Ayse Can
            106  K  Sevgi Can
         */
    }
}

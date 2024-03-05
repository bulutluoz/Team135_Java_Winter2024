package day33_maps;

import day31_maps.MapDepo;

import java.util.HashMap;
import java.util.Map;

public class C05_NoIleBilgiGuncelleme {

    public static void main(String[] args) {

        // Ogrenci map'inde numarasi verilen ogrencinin
        // istenen bilgisini guncelleyin


        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        ogrenciMap = MapDepo.setData(ogrenciMap,103,"isim","Rasit");
        ogrenciMap = MapDepo.setData(ogrenciMap,105,"bolum","SAY");
        ogrenciMap = MapDepo.setData(ogrenciMap,104,"Sube","K");

        System.out.println(ogrenciMap);
    }
}

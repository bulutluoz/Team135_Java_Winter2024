package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C08_IsimVeSoyisimDuzenle {

    public static void main(String[] args) {

        // map'deki tum ogrencilerin
        // isimlerini ilk harf buyuk, diger harfler kucuk
        // soyisimlerini tum harfler buyuk hale getirin

        Map<Integer, String> ogrenciMap = MapDepo.mapOlustur();

        ogrenciMap = MapDepo.isimSoyisimDuzenle(ogrenciMap);

        System.out.println(ogrenciMap);

    }
}

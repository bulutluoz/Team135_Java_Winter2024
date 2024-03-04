package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C07_NumaraIleSoyisimUpdate {

    public static void main(String[] args) {

        // 104 numarali ogrencinin soyismini Yasar yapin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        ogrenciMap = MapDepo.numaraIleSoyisimDegistir(ogrenciMap,104,"Yasar");

        System.out.println(ogrenciMap);
    }
}

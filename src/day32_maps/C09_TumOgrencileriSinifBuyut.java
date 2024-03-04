package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C09_TumOgrencileriSinifBuyut {

    public static void main(String[] args) {

        // Tum ogrencileri gozden gecirip
        // bir ust sinifa cikartin
        // 12.sinifta olanlara sinif bilgisi olarak "Mezun" yazin
        // Sinif olarak mezun yazan varsa bir sey yapmayin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        ogrenciMap = MapDepo.yilSonuSinifArtirma(ogrenciMap);
    }
}

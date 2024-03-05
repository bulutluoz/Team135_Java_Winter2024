package day33_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C04_EntryIleBolumDegistirme {

    public static void main(String[] args) {

        // verilen bolumdeki  tum ogrencilerin
        // bolum bilgisini yeni verilen bolum ile update edelim

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        ogrenciMap = MapDepo.topluBolumDegistir(ogrenciMap,"MF","SAY");

        ogrenciMap = MapDepo.topluBolumDegistir(ogrenciMap,"TM","EA");

        System.out.println(ogrenciMap);
    }
}

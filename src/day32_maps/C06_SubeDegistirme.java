package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C06_SubeDegistirme {

    public static void main(String[] args) {

        // H subesindeki tum ogrencilerin subesini A yapin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        /*
        {
           101=Ali-Can-11-H-MF,
           102=Veli-Cem-10-K-TM,
           103=Ali-Can-11-K-TM,
           104=Ayse-Can-10-H-MF,
           105=Sevgi-Cem-11-M-TM,
           106=Sevgi-Cem-10-K-MF,
           107=Esra-Han-11-M-SOZ
           }
         */

        // MapDepo'da yaptigimiz degisiklik orada kalacagi icin
        // method'dan map'in son halini return edip
        // bu class'da onu ogrenciMap olarak kaydetmeliyiz

        MapDepo.subeDegistir(ogrenciMap,"H","A");

        System.out.println(ogrenciMap);
        // araba degismeden, sadece yolcular degistigi icin
        // baska method'da yapilan degisiklik kalici oluyor


        // K subesindekileri, B subesine alin

        ogrenciMap = MapDepo.subeDegistir(ogrenciMap,"K","B");
    }
}

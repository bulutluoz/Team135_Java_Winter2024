package day33_maps;

import java.util.Map;

public class C08_NestedOgrenciMapKullanimi {

    public static void main(String[] args) {

        Map<Integer,Map<String,String>> nesOgrMap = NestedOkulMapDepo.nesOgrMapOlustur();

        System.out.println(nesOgrMap);
        /*
                {
                101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                102={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
                103={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse}
                }
         */

        // 103 numarali ogrencinin soyismini yazdirin

        System.out.println(nesOgrMap.get(103).get("soyisim")); // Can

        // 102 numarali ogrencinin subesini M yapin

        nesOgrMap.get(102).put("sube","M");

        // map'e 104 okul numarasi ile "Hasan","Yan","10","M","MF" ekleyin

        nesOgrMap = NestedOkulMapDepo.ogrenciEkle(nesOgrMap,104,"Hasan","Yan","10","M","MF");

        nesOgrMap = NestedOkulMapDepo.ogrenciEkle(nesOgrMap,105,"Rasit","Celik","11","J","MF");
        System.out.println(nesOgrMap);


    }
}

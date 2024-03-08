package day34_mapsMethodlari;

import day33_maps.NestedOkulMapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class C02_SinifOgrenciSayilari {

    public static void main(String[] args) {

        // nested map olarak verilen ogrenci map'inde
        // her sinifta kacar ogrenci oldugunu bir map olarak yazdirin

        Map<Integer,Map<String,String>> ogrenciMap = NestedOkulMapDepo.nesOgrMapOlustur();

        System.out.println(ogrenciMap);

        // {
        //     101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
        //     102={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
        //     103={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse}
        //     }

        Map<String,Integer> sinifSayilariMap = new TreeMap<>(); // {}

        // tum ogrencileri gozden gecirebilmek icin
        //  - sadece value'lerle isimiz oldugundan values() ile value'leri alabiliriz
        //  - keySet() alip, her bir key'e ait value'yu inceleriz
        //  - entrySet() ile Entry olarak key ve value'yu alabiliriz

        Collection<Map<String,String>> ogrenciBilgiMapleriCollection = ogrenciMap.values();

        System.out.println(ogrenciBilgiMapleriCollection);
        // [
        // {sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
        // {sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
        // {sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse}
        // ]


        // for-each loop ile ogrenci bilgilerini alip
        // icindeki sinif bilgisini kontrol edelim
        // eger sinif sinifSayilariMap'de yoksa value'su 1 olarak ekleyelim
        // sinif, sinifSayilariMap'de varsa eski degeri alip, 1 fazlasi ile ekleyelim

    }
}

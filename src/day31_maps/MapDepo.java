package day31_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {

    // Bu class Ogrenci map'i ile kullanabilecegimiz
    // method'lari depolamak icin olusturuldu

    // Map olusturup, donduren method olusturalim

    public static Map<Integer,String>  mapOlustur(){

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        return ogrenciMap;
    }

    public static String getBolum(Map<Integer,String> ogrenciMap, Integer istenenNo){

        String istenenNoValue = ogrenciMap.get(istenenNo); // Sevgi-Cem-11-M-TM

        String[] istenenValueArr = istenenNoValue.split("-"); // [Sevgi, Cem, 11, M, TM]

        return istenenValueArr[4];
    }

    public static String getSinif(Map<Integer,String> ogrenciMap, int istenenNo){

        String istenenOgrValue = ogrenciMap.get(istenenNo) ; // "Ali-Cem-11-K-TM"

        String[] istenenValueArr = istenenOgrValue.split("-"); // [Ali, Cem, 11, K, TM]

        return istenenValueArr[2]; // 11
    }

    public static String getData(Map<Integer,String> ogrenciMap, int istenenNo, String istenenBilgi){
        // verilen bir ogrenci map'inde
        // istenen numaradaki ogrencinin
        // Isim,Soyisim,Sinif,Sube veya Bolum bilgisini dondursun

        String istenenOgrValue = ogrenciMap.get(istenenNo) ; // "Ali-Cem-11-K-TM"

        String[] istenenValueArr = istenenOgrValue.split("-"); // [Ali, Cem, 11, K, TM]


        switch (istenenBilgi.toUpperCase()){

            case "ISIM" :
                return istenenValueArr[0];

            case "SOYISIM" :
                return istenenValueArr[1];

            case "SINIF" :
                return istenenValueArr[2];

            case "SUBE" :
                return istenenValueArr[3];

            case "BOLUM" :
                return istenenValueArr[4];

            default:
                return "Yanlis bilgi istegi";
        }



    }

    public static void sinifSubeListesiYazdir(Map<Integer,String> ogrenciMap, Integer sinif , String sube){

        /*
        {
           101=Ali-Can-11-H-MF,
           102=Veli-Cem-10-K-TM,
           103=Ali-Cem-11-K-TM,
           104=Ayse-Can-10-H-MF,
           105=Sevgi-Cem-11-M-TM,
           106=Sevgi-Can-10-K-MF,
           107=Esra-Han-11-M-SOZ
           }
         */

        // 1- tum ogrencileri gozden gecirebilmek icin
        //    once tum ogrenci numaralarini elde etmeliyim
        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106, 107]

        // 2- bu Key'leri kullanarak her bir key icin value'lari bize getirecek
        //    bir for-each loop olusturalim

        for ( Integer eachKey: ogrenciNoSeti
             ) { // 101
            // 3- for-each loop'da gelen ogrenci numarasina ait value'yu kaydedelim
            String eachvalue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 4- value'daki bilgilere erisebilmek icin
            //    value'yu array'e cevirelim

            String[] valueArr = eachvalue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- istenen sartlari kontrol edip,
            //    istenen sartlari saglayan ogrencilerin
            //    numara, isim ve soyisimlerini yazdiralim




        }
    }






}
